package com.onlinemall.springservice.service;

import com.onlinemall.constants.Params;
import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IOrderService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.*;

@Service
public class OrderServiceImp implements IOrderService {

    private Logger logger = Logger.getLogger(OrderServiceImp.class);

    @Autowired
    private OnlinemallOrderMapper onlinemallOrderMapper;

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

    public BaseResult<OnlinemallOrder> addOrder(RequestParams<OnlinemallOrder> params){
        logger.info("{调用增加订单服务，由springservice的addOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        //校验参数
        String userId = (String) params.getParams().get(USERID);
        String goodsid = (String) params.getParams().get("goodsid");
        String ordertotalamount = (String) params.getParams().get("ordertotalamount");
        String orderaddress = (String) params.getParams().get("orderaddress");
        String url = (String) params.getParams().get("url");
        if(StringUtils.isBlank(userId) || StringUtils.isBlank(goodsid)
                || StringUtils.isBlank(ordertotalamount) || StringUtils.isBlank(orderaddress)
                || StringUtils.isBlank(url)){
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        String decode = null;
        try {
            decode = URLDecoder.decode(orderaddress,"UTF-8");
            params.getParams().put("orderaddress",decode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        OnlinemallOrder onlinemallOrder = new RequestParamConvertBeanUtil<OnlinemallOrder>().convertBean(params, new OnlinemallOrder());
        onlinemallOrder.setId(CommonUtils.createUuid());
        onlinemallOrder.setOrderid(CommonUtils.createUuid());
        onlinemallOrder.setOrdertype(ORDER_WAIT_FAHUO);
        onlinemallOrder.setOrdertime(new Date());
        onlinemallOrder.setOrderchengjiaotime(new Date());
        onlinemallOrder.setOrderstatus(ORDER_WAIT_FAHUO);
        onlinemallOrder.setGoodsoperate("1");
        onlinemallOrder.setGoodscount(Integer.valueOf((String) params.getParams().get("goodscount")));
        onlinemallOrder.setOrdercreatetime(new Date());
        logger.info("{未完善其他信息之前的订单"+onlinemallOrder.toString()+"}");
        createOnlineMallShopCar(url,goodsid,onlinemallOrder);
        logger.info("{完善其他信息之后的订单"+onlinemallOrder.toString()+"}");
        int insert = onlinemallOrderMapper.insert(onlinemallOrder);
        if(0 == insert){
            logger.info("{订单交易失败}");
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
        }else {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallOrder);
        }
        return baseResult;
    }

    private void createOnlineMallShopCar(String url,String goodsid,OnlinemallOrder onlinemallOrder) {
        if(StringUtils.isBlank(url) || StringUtils.isBlank(goodsid)){
            return;
        }
        if (url.contains("listClothes")) {
            OnlinemallGoodsClothes onlinemallGoodsClothes = onlinemallGoodsClothesMapper.selectByPrimaryKey(goodsid);
            onlinemallOrder.setShopid(onlinemallGoodsClothes.getShop());
            onlinemallOrder.setGoodsurl(onlinemallGoodsClothes.getUrl());
            onlinemallOrder.setGoodsname(onlinemallGoodsClothes.getGoodsname());
            onlinemallOrder.setGoodsprice(onlinemallGoodsClothes.getOriginalprice()+"");
        } else if (url.contains("listDrinking")) {
            OnlinemallGoodsDrinking onlinemallGoodsDrinking = onlinemallGoodsDrinkingMapper.selectByPrimaryKey(goodsid);
            onlinemallOrder.setShopid(onlinemallGoodsDrinking.getShop());
            onlinemallOrder.setGoodsurl(onlinemallGoodsDrinking.getUrl());
            onlinemallOrder.setGoodsname(onlinemallGoodsDrinking.getGoodsname());
            onlinemallOrder.setGoodsprice(onlinemallGoodsDrinking.getOriginalprice()+"");
        } else if (url.contains("listNecessities")) {
            OnlinemallGoodsDailyNecessities onlinemallGoodsDailyNecessities = onlinemallGoodsDailyNecessitiesMapper.selectByPrimaryKey(goodsid);
            onlinemallOrder.setShopid(onlinemallGoodsDailyNecessities.getShop());
            onlinemallOrder.setGoodsurl(onlinemallGoodsDailyNecessities.getUrl());
            onlinemallOrder.setGoodsname(onlinemallGoodsDailyNecessities.getGoodsname());
            onlinemallOrder.setGoodsprice(onlinemallGoodsDailyNecessities.getOriginalprice()+"");
        } else if (url.contains("listGoodsFreshs")) {
            OnlinemallGoodsFreshs onlinemallGoodsFreshs = onlinemallGoodsFreshsMapper.selectByPrimaryKey(goodsid);
            onlinemallOrder.setShopid(onlinemallGoodsFreshs.getShop());
            onlinemallOrder.setGoodsurl(onlinemallGoodsFreshs.getUrl());
            onlinemallOrder.setGoodsname(onlinemallGoodsFreshs.getGoodsname());
            onlinemallOrder.setGoodsprice(onlinemallGoodsFreshs.getOriginalprice()+"");
        } else {
            OnlinemallGoodsStationery onlinemallGoodsStationery = onlinemallGoodsStationeryMapper.selectByPrimaryKey(goodsid);
            onlinemallOrder.setShopid(onlinemallGoodsStationery.getShop());
            onlinemallOrder.setGoodsurl(onlinemallGoodsStationery.getUrl());
            onlinemallOrder.setGoodsname(onlinemallGoodsStationery.getGoodsname());
            onlinemallOrder.setGoodsprice(onlinemallGoodsStationery.getOriginalprice()+"");
        }
    }

    public BaseResult<OnlinemallOrder> listOrder(RequestParams<OnlinemallOrder> params) {
        logger.info("{调用查询订单服务,由springservice的addOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallOrderExample onlinemallOrderExample = new OnlinemallOrderExample();
        OnlinemallOrderExample.Criteria criteria = onlinemallOrderExample.createCriteria();
        onlinemallOrderExample.setOrderByClause("\'ordertime\' DESC");
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<OnlinemallOrder>());
            return baseResult;
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_ID))){
            criteria.andIdEqualTo((String)params.getParams().get(ORDER_ID));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_STATUS))){
            criteria.andOrderstatusEqualTo((String)params.getParams().get(ORDER_STATUS));
        }
        List<OnlinemallOrder> onlinemallOrders = onlinemallOrderMapper.selectByExample(onlinemallOrderExample);
        baseResult.setDataList(onlinemallOrders);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    public BaseResult<OnlinemallOrder> updateOrder(RequestParams<OnlinemallOrder> params) {
        logger.info("{调用查询订单服务,由springservice的updateOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallOrderExample onlinemallOrderExample = new OnlinemallOrderExample();
        OnlinemallOrderExample.Criteria criteria = onlinemallOrderExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_ID))){
            criteria.andIdEqualTo((String)params.getParams().get(ORDER_ID));
        }

        return baseResult;
    }
}
