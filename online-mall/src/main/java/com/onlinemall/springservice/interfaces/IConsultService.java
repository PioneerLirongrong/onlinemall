package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallAcquireAdvice;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 客服接口
 */
public interface IConsultService {

    /**
     * 　增加咨询
     */
    BaseResult<OnlinemallAcquireAdvice> addOnlineMallAcquirAdvice(RequestParams<OnlinemallAcquireAdvice> params);

}
