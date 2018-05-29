package com.onlinemall.springservice.service;

import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserFootService;
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
 * 用户接口
 */
@Service
public class UserFootSeriviceImp implements IUserFootService {

    private Logger logger = Logger.getLogger(ConsultServiceImp.class);

    @Autowired
    private OnlinemallUserRecordMapper onlinemallUserRecordMapper;

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

    public BaseResult<OnlinemallUserRecord> addRecord(RequestParams<OnlinemallUserRecord> params) {
        logger.info("{调用增加用户的服务,由springservice的addRecord方法提供服务}");
        BaseResult<OnlinemallUserRecord> baseResult = new BaseResult<OnlinemallUserRecord>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserRecord onlinemallUserRecord = new RequestParamConvertBeanUtil<OnlinemallUserRecord>().convertBean(params, new OnlinemallUserRecord());
        onlinemallUserRecord.setId(CommonUtils.createUuid());
        onlinemallUserRecord.setRecordtime(new Date());
        int insert = onlinemallUserRecordMapper.insert(onlinemallUserRecord);
        if(0 != insert){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUserRecord);
        }
        return baseResult;
    }

    public BaseResult<PageCollectFootBean> listRecord(RequestParams<OnlinemallUserRecord> params) {
        logger.info("{调用增加用户的服务,由springservice的listRecord方法提供服务}");
        BaseResult<PageCollectFootBean> baseResult = new BaseResult<PageCollectFootBean>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserRecordExample onlinemallUserRecordExample = new OnlinemallUserRecordExample();
        OnlinemallUserRecordExample.Criteria criteria = onlinemallUserRecordExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<PageCollectFootBean>());
        }
        List<OnlinemallUserRecord> onlinemallUserRecords = onlinemallUserRecordMapper.selectByExample(onlinemallUserRecordExample);
        logger.info("{查询的结果"+params.getParams().get(USERID)+"\t"+onlinemallUserRecords.toString()+"}");
        List<PageCollectFootBean> listPages = new ArrayList<PageCollectFootBean>();
        for(OnlinemallUserRecord record:onlinemallUserRecords){
            PageCollectFootBean collectBean = new PageCollectFootBean();
            collectBean.setId(CommonUtils.createUuid());
            collectBean.setGoodId(record.getGoodsid());
            collectBean.setUserId(record.getUserid());
            collectBean.setQueryUrl(record.getQueryurl());
            createOnlineMallShopCar(record.getQueryurl(),record.getGoodsid(),collectBean);
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


    public BaseResult<OnlinemallUserRecord> deleteRecord(RequestParams<OnlinemallUserRecord> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteRecord方法提供服务}");
        BaseResult<OnlinemallUserRecord> baseResult = new BaseResult<OnlinemallUserRecord>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserRecordExample onlinemallUserRecordExample = new OnlinemallUserRecordExample();
        OnlinemallUserRecordExample.Criteria criteria = onlinemallUserRecordExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USER_GOODS_ID))){
            criteria.andGoodsidEqualTo((String)params.getParams().get(USER_GOODS_ID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        int delete = onlinemallUserRecordMapper.deleteByExample(onlinemallUserRecordExample);
        if(0 != delete){
            baseResult.setCode(BaseResult.SUCCESS);
        }
        return baseResult;
    }
}
