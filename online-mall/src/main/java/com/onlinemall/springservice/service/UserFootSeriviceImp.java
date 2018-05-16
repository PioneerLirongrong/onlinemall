package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallUserRecordMapper;
import com.onlinemall.dao.model.OnlinemallUserRecord;
import com.onlinemall.dao.model.OnlinemallUserRecordExample;
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

    public BaseResult<OnlinemallUserRecord> listRecord(RequestParams<OnlinemallUserRecord> params) {
        logger.info("{调用增加用户的服务,由springservice的listRecord方法提供服务}");
        BaseResult<OnlinemallUserRecord> baseResult = new BaseResult<OnlinemallUserRecord>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserRecordExample onlinemallUserRecordExample = new OnlinemallUserRecordExample();
        OnlinemallUserRecordExample.Criteria criteria = onlinemallUserRecordExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<OnlinemallUserRecord>());
        }
        List<OnlinemallUserRecord> onlinemallUserRecords = onlinemallUserRecordMapper.selectByExample(onlinemallUserRecordExample);
        logger.info("{查询的结果"+params.getParams().get(USERID)+"\t"+onlinemallUserRecords.toString()+"}");
        baseResult.setDataList(onlinemallUserRecords);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
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
