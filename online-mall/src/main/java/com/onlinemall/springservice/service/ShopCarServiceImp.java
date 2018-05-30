package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopCarService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.USERID;
import static com.onlinemall.constants.Params.USER_SHOP_CAR_ID;

@Service
public class ShopCarServiceImp implements IShopCarService {


    private static Logger logger = Logger.getLogger(ShopCarServiceImp.class);

    @Autowired
    private OnlinemallShopcarMapper onlinemallShopcarMapper;

    @Autowired
    private OnlinemallGoodsClothesMapper onlinemallGoodsClothesMapper;

    @Autowired
    private OnlinemallGoodsDrinkingMapper onlinemallGoodsDrinkingMapper;

    @Autowired
    private OnlinemallGoodsDailyNecessitiesMapper onlinemallGoodsDailyNecessitiesMapper;

    @Autowired
    protected OnlinemallGoodsCookedFoodMapper onlinemallGoodsCookedFoodMapper;

    @Autowired
    private OnlinemallGoodsFreshsMapper onlinemallGoodsFreshsMapper;

    @Autowired
    private OnlinemallGoodsStationeryMapper onlinemallGoodsStationeryMapper;

    public BaseResult<OnlinemallShopcar> addShopCarItem(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的addShopCarItem方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        //查询对应的商品
        if (StringUtils.isNotBlank((String) params.getParams().get("queryurl")) && StringUtils.isNotBlank((String) params.getParams().get("goodsid"))) {
            String goodsid = (String) params.getParams().get("goodsid");
            OnlinemallShopcarExample onlinemallShopcarExample = new OnlinemallShopcarExample();
            OnlinemallShopcarExample.Criteria criteria = onlinemallShopcarExample.createCriteria();
            criteria.andGoodsidEqualTo(goodsid);
            criteria.andUseridEqualTo((String) params.getParams().get(USERID));
            String flag = (String) params.getParams().get("flag");
            int value = 1;
            if(!"add".equals(flag)){
                value = -1;
            }
            List<OnlinemallShopcar> shopcars = onlinemallShopcarMapper.selectByExample(onlinemallShopcarExample);
            if (shopcars.size() != 0) {
                OnlinemallShopcar shopcar = shopcars.get(0);
                int count = Integer.valueOf(shopcar.getGoodcount()) + value;
                shopcar.setGoodcount(count + "");
                int i = onlinemallShopcarMapper.updateByExample(shopcar,onlinemallShopcarExample);
                logger.info("{跟新后台的购物车该项为 "+shopcar.toString()+"}");
                if (0 != i) {
                    baseResult.setCode(BaseResult.SUCCESS);
                    baseResult.setDataObj(shopcar);
                    return baseResult;
                } else {
                    return baseResult;
                }
            } else {
                OnlinemallShopcar onlinemallShopcar = new RequestParamConvertBeanUtil<OnlinemallShopcar>().convertBean(params, new OnlinemallShopcar());
                onlinemallShopcar.setId(CommonUtils.createUuid());
                onlinemallShopcar.setRegistertime(new Date());
                onlinemallShopcar.setGoodcount("1");
                createOnlineMallShopCar(params, onlinemallShopcar);
                logger.info("{添加到购物车的项为 "+onlinemallShopcar.toString()+"}");
                int insert = onlinemallShopcarMapper.insert(onlinemallShopcar);
                if (0 == insert) {
                    baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
                    return baseResult;
                }
                baseResult.setCode(BaseResult.SUCCESS);
                baseResult.setDataObj(onlinemallShopcar);
                return baseResult;
            }
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
    }
    private void createOnlineMallShopCar(RequestParams params, OnlinemallShopcar onlinemallShopcar) {
        String url = (String) params.getParams().get("queryurl");
        String goodsid = (String) params.getParams().get("goodsid");
        if (url.contains("listClothes")) {
            OnlinemallGoodsClothes onlinemallGoodsClothes = onlinemallGoodsClothesMapper.selectByPrimaryKey(goodsid);
            onlinemallShopcar.setGoodsname(onlinemallGoodsClothes.getGoodsname());
            onlinemallShopcar.setOriginalprice(onlinemallGoodsClothes.getOriginalprice());
            onlinemallShopcar.setDiscouuntprice(onlinemallGoodsClothes.getDiscouuntprice());
            onlinemallShopcar.setGoodtype(onlinemallGoodsClothes.getClothestype());
            onlinemallShopcar.setGood(onlinemallGoodsClothes.getGoodsname());
            onlinemallShopcar.setUrl(onlinemallGoodsClothes.getUrl());
        } else if (url.contains("listDrinking")) {
            OnlinemallGoodsDrinking onlinemallGoodsDrinking = onlinemallGoodsDrinkingMapper.selectByPrimaryKey(goodsid);
            onlinemallShopcar.setGoodsname(onlinemallGoodsDrinking.getGoodsname());
            onlinemallShopcar.setOriginalprice(onlinemallGoodsDrinking.getOriginalprice());
            onlinemallShopcar.setDiscouuntprice(onlinemallGoodsDrinking.getDiscouuntprice());
            onlinemallShopcar.setGoodtype(onlinemallGoodsDrinking.getDrinkingtype());
            onlinemallShopcar.setGood(onlinemallGoodsDrinking.getGoodsname());
            onlinemallShopcar.setUrl(onlinemallGoodsDrinking.getUrl());
        } else if (url.contains("listNecessities")) {
            OnlinemallGoodsDailyNecessities onlinemallGoodsDailyNecessities = onlinemallGoodsDailyNecessitiesMapper.selectByPrimaryKey(goodsid);
            onlinemallShopcar.setGoodsname(onlinemallGoodsDailyNecessities.getGoodsname());
            onlinemallShopcar.setOriginalprice(onlinemallGoodsDailyNecessities.getOriginalprice());
            onlinemallShopcar.setDiscouuntprice(onlinemallGoodsDailyNecessities.getDiscouuntprice());
            onlinemallShopcar.setGoodtype(onlinemallGoodsDailyNecessities.getDailynecessitiestype());
            onlinemallShopcar.setGood(onlinemallGoodsDailyNecessities.getGoodsname());
            onlinemallShopcar.setUrl(onlinemallGoodsDailyNecessities.getUrl());
        } else if (url.contains("listGoodsFreshs")) {
            OnlinemallGoodsFreshs onlinemallGoodsFreshs = onlinemallGoodsFreshsMapper.selectByPrimaryKey(goodsid);
            onlinemallShopcar.setGoodsname(onlinemallGoodsFreshs.getGoodsname());
            onlinemallShopcar.setOriginalprice(onlinemallGoodsFreshs.getOriginalprice());
            onlinemallShopcar.setDiscouuntprice(onlinemallGoodsFreshs.getDiscouuntprice());
            onlinemallShopcar.setGoodtype(onlinemallGoodsFreshs.getFreshstype());
            onlinemallShopcar.setGood(onlinemallGoodsFreshs.getGoodsname());
            onlinemallShopcar.setUrl(onlinemallGoodsFreshs.getUrl());
        } else {
            OnlinemallGoodsStationery onlinemallGoodsStationery = onlinemallGoodsStationeryMapper.selectByPrimaryKey(goodsid);
            onlinemallShopcar.setGoodsname(onlinemallGoodsStationery.getGoodsname());
            onlinemallShopcar.setOriginalprice(onlinemallGoodsStationery.getOriginalprice());
            onlinemallShopcar.setDiscouuntprice(onlinemallGoodsStationery.getDiscouuntprice());
            onlinemallShopcar.setGoodtype(onlinemallGoodsStationery.getStationerytype());
            onlinemallShopcar.setGood(onlinemallGoodsStationery.getGoodsname());
            onlinemallShopcar.setUrl(onlinemallGoodsStationery.getUrl());
        }
    }

    public BaseResult<OnlinemallShopcar> listShopCarItems(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的listShopCarItems方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallShopcarExample onlinemallShopcarExample = new OnlinemallShopcarExample();
        OnlinemallShopcarExample.Criteria criteria = onlinemallShopcarExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(USERID))) {
            criteria.andUseridEqualTo((String) params.getParams().get(USERID));
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        List<OnlinemallShopcar> onlinemallShopcars = onlinemallShopcarMapper.selectByExample(onlinemallShopcarExample);
        baseResult.setDataList(onlinemallShopcars);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    public BaseResult<OnlinemallShopcar> deleteShopCarItem(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteShopCarItem方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallShopcarExample onlinemallShopcarExample = new OnlinemallShopcarExample();
        OnlinemallShopcarExample.Criteria criteria = onlinemallShopcarExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(USER_SHOP_CAR_ID))) {
            criteria.andIdEqualTo((String) params.getParams().get(USER_SHOP_CAR_ID));
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        int delete = onlinemallShopcarMapper.deleteByExample(onlinemallShopcarExample);
        if (0 == delete) {
            baseResult.setErrors(Errors.SERVICE_DELETE_ERROR);
            return baseResult;
        }
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }
}
