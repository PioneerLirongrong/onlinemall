package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallAcquireAdviceMapper;
import com.onlinemall.dao.model.OnlinemallAcquireAdvice;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IConsultService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author lrr
 * 用户咨询的接口实现
 */
@Service
public class ConsultServiceImp implements IConsultService {

    private Logger logger = Logger.getLogger(ConsultServiceImp.class);

    @Autowired
    private OnlinemallAcquireAdviceMapper onlinemallAcquireAdviceMapper;

    public BaseResult<OnlinemallAcquireAdvice> addOnlineMallAcquirAdvice(RequestParams<OnlinemallAcquireAdvice> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteAddress方法提供服务}");
        BaseResult<OnlinemallAcquireAdvice> baseResult = new BaseResult<OnlinemallAcquireAdvice>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallAcquireAdvice onlinemallAcquireAdvice = new RequestParamConvertBeanUtil<OnlinemallAcquireAdvice>().convertBean(params, new OnlinemallAcquireAdvice());
        onlinemallAcquireAdvice.setId(CommonUtils.createUuid());
        onlinemallAcquireAdvice.setAcquireadvicetime(new Date());
        int insert = onlinemallAcquireAdviceMapper.insert(onlinemallAcquireAdvice);
        if(0 != insert){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallAcquireAdvice);
        }
        return baseResult;
    }
}
