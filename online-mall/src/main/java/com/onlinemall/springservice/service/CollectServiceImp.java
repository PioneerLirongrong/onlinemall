package com.onlinemall.springservice.service;


import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.ICollectionService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.USERID;
import static com.onlinemall.constants.Params.USER_GOODS_ID;

/**
 * @author lrr
 * 用户收藏接口
 */
@Service
public class CollectServiceImp implements ICollectionService {

    private Logger logger = Logger.getLogger(ConsultServiceImp.class);

    @Autowired
    private OnlinemallUserCollectMapper onlinemallUserCollectMapper;

    @Autowired
    private OnlinemallGoodsClothesMapper onlinemallGoodsClothesMapper;

    @Autowired
    private OnlinemallGoodsDrinkingMapper onlinemallGoodsDrinkingMapper;

    @Autowired
    private OnlinemallGoodsDailyNecessitiesMapper onlinemallGoodsDailyNecessitiesMapper;


    @Autowired
    private OnlinemallGoodsFreshsMapper onlinemallGoodsFreshsMapper;

    @Autowired
    private OnlinemallGoodsStationeryMapper onlinemallGoodsStationeryMapper;

    public BaseResult<OnlinemallUserCollect> addCollect(RequestParams<OnlinemallUserCollect> params) {
        logger.info("{调用增加用户的服务,由springservice的addCollect方法提供服务}");
        BaseResult<OnlinemallUserCollect> baseResult = new BaseResult<OnlinemallUserCollect>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserCollect onlinemallUserCollect = new RequestParamConvertBeanUtil<OnlinemallUserCollect>().convertBean(params, new OnlinemallUserCollect());
        onlinemallUserCollect.setId(CommonUtils.createUuid());
        onlinemallUserCollect.setCollectime(new Date());
        int insert = onlinemallUserCollectMapper.insert(onlinemallUserCollect);
        if(0 != insert){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUserCollect);
        }
        return baseResult;
    }

    public BaseResult<PageCollectFootBean> listCollect(RequestParams<OnlinemallUserCollect> params) {
        logger.info("{调用增加用户的服务,由springservice的listCollect方法提供服务}");
        BaseResult<PageCollectFootBean> baseResult = new BaseResult<PageCollectFootBean>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserCollectExample onlinemallUserCollectExample = new OnlinemallUserCollectExample();
        OnlinemallUserCollectExample.Criteria criteria = onlinemallUserCollectExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<PageCollectFootBean>());
        }
        List<OnlinemallUserCollect> onlinemallUserCollects = onlinemallUserCollectMapper.selectByExample(onlinemallUserCollectExample);
        logger.info("{查询的结果"+(String)params.getParams().get(USERID)+"\t"+onlinemallUserCollects.toString()+"}");
        List<PageCollectFootBean> listPages = new ArrayList<PageCollectFootBean>();
        for(OnlinemallUserCollect collect:onlinemallUserCollects){
            PageCollectFootBean collectBean = new PageCollectFootBean();
            collectBean.setId(CommonUtils.createUuid());
            collectBean.setGoodId(collect.getGoodsid());
            collectBean.setUserId(collect.getUserid());
            collectBean.setQueryUrl(collect.getQueryurl());
            createOnlineMallShopCar(collect.getQueryurl(),collect.getGoodsid(),collectBean);
            listPages.add(collectBean);
        }
        logger.info("{netty和spring处理的结果为"+listPages.toString()+"}");
        baseResult.setDataList(listPages);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    private void createOnlineMallShopCar(String url,String goodId, PageCollectFootBean collect) {
        if (url.contains("listClothes")) {
            OnlinemallGoodsClothes onlinemallGoodsClothes = onlinemallGoodsClothesMapper.selectByPrimaryKey(goodId);
            collect.setOriginalPrice(onlinemallGoodsClothes.getOriginalprice()+"");
            collect.setDiscountPrice(onlinemallGoodsClothes.getDiscouuntprice()+"");
            collect.setGoodEvaluate(onlinemallGoodsClothes.getEvaluateprecent());
            collect.setUrl(onlinemallGoodsClothes.getUrl());
            collect.setSaleMonth(onlinemallGoodsClothes.getSalesmonth()+"");
            collect.setGoodName(onlinemallGoodsClothes.getGoodsname());
        } else if (url.contains("listDrinking")) {
            OnlinemallGoodsDrinking onlinemallGoodsDrinking = onlinemallGoodsDrinkingMapper.selectByPrimaryKey(goodId);
            collect.setOriginalPrice(onlinemallGoodsDrinking.getOriginalprice()+"");
            collect.setDiscountPrice(onlinemallGoodsDrinking.getDiscouuntprice()+"");
            collect.setGoodEvaluate(onlinemallGoodsDrinking.getEvaluateprecent());
            collect.setUrl(onlinemallGoodsDrinking.getUrl());
            collect.setSaleMonth(onlinemallGoodsDrinking.getSalesmonth()+"");
            collect.setGoodName(onlinemallGoodsDrinking.getGoodsname());
        } else if (url.contains("listNecessities")) {
            OnlinemallGoodsDailyNecessities onlinemallGoodsDailyNecessities = onlinemallGoodsDailyNecessitiesMapper.selectByPrimaryKey(goodId);
            collect.setOriginalPrice(onlinemallGoodsDailyNecessities.getOriginalprice()+"");
            collect.setDiscountPrice(onlinemallGoodsDailyNecessities.getDiscouuntprice()+"");
            collect.setGoodEvaluate(onlinemallGoodsDailyNecessities.getEvaluateprecent());
            collect.setUrl(onlinemallGoodsDailyNecessities.getUrl());
            collect.setSaleMonth(onlinemallGoodsDailyNecessities.getSalesmonth()+"");
            collect.setGoodName(onlinemallGoodsDailyNecessities.getGoodsname());
        } else if (url.contains("listGoodsFreshs")) {
            OnlinemallGoodsFreshs onlinemallGoodsFreshs = onlinemallGoodsFreshsMapper.selectByPrimaryKey(goodId);
            collect.setOriginalPrice(onlinemallGoodsFreshs.getOriginalprice()+"");
            collect.setDiscountPrice(onlinemallGoodsFreshs.getDiscouuntprice()+"");
            collect.setGoodEvaluate(onlinemallGoodsFreshs.getEvaluateprecent());
            collect.setUrl(onlinemallGoodsFreshs.getUrl());
            collect.setSaleMonth(onlinemallGoodsFreshs.getSalesmonth()+"");
            collect.setGoodName(onlinemallGoodsFreshs.getGoodsname());
        } else {
            OnlinemallGoodsStationery onlinemallGoodsStationery = onlinemallGoodsStationeryMapper.selectByPrimaryKey(goodId);
            collect.setOriginalPrice(onlinemallGoodsStationery.getOriginalprice()+"");
            collect.setDiscountPrice(onlinemallGoodsStationery.getDiscouuntprice()+"");
            collect.setGoodEvaluate(onlinemallGoodsStationery.getEvaluateprecent());
            collect.setUrl(onlinemallGoodsStationery.getUrl());
            collect.setSaleMonth(onlinemallGoodsStationery.getSalesmonth()+"");
            collect.setGoodName(onlinemallGoodsStationery.getGoodsname());
        }
    }



    public BaseResult<OnlinemallUserCollect> deleteCollect(RequestParams<OnlinemallUserCollect> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteCollect方法提供服务}");
        BaseResult<OnlinemallUserCollect> baseResult = new BaseResult<OnlinemallUserCollect>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserCollectExample onlinemallUserCollectExample = new OnlinemallUserCollectExample();
        OnlinemallUserCollectExample.Criteria criteria = onlinemallUserCollectExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USER_GOODS_ID))){
            criteria.andGoodsidEqualTo((String)params.getParams().get(USER_GOODS_ID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        int delete = onlinemallUserCollectMapper.deleteByExample(onlinemallUserCollectExample);
        if(0 != delete){
            baseResult.setCode(BaseResult.SUCCESS);
        }
        return baseResult;
    }
}
