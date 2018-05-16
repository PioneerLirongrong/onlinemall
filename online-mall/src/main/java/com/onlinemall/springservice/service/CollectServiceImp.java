package com.onlinemall.springservice.service;


import com.onlinemall.dao.mapper.OnlinemallUserCollectMapper;
import com.onlinemall.dao.model.OnlinemallUserCollect;
import com.onlinemall.dao.model.OnlinemallUserCollectExample;
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

    public BaseResult<OnlinemallUserCollect> listCollect(RequestParams<OnlinemallUserCollect> params) {
        logger.info("{调用增加用户的服务,由springservice的listCollect方法提供服务}");
        BaseResult<OnlinemallUserCollect> baseResult = new BaseResult<OnlinemallUserCollect>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserCollectExample onlinemallUserCollectExample = new OnlinemallUserCollectExample();
        OnlinemallUserCollectExample.Criteria criteria = onlinemallUserCollectExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<OnlinemallUserCollect>());
        }
        List<OnlinemallUserCollect> onlinemallUserCollects = onlinemallUserCollectMapper.selectByExample(onlinemallUserCollectExample);
        logger.info("{查询的结果"+(String)params.getParams().get(USERID)+"\t"+onlinemallUserCollects.toString()+"}");
        baseResult.setDataList(onlinemallUserCollects);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
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
