package com.onlinemall.springservice.interfaces;

import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.model.OnlinemallUserRecord;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 用户足记接口
 */
public interface IUserFootService {

    /**
     * 新增足记
     */
    BaseResult<OnlinemallUserRecord> addRecord(RequestParams<OnlinemallUserRecord> params);

    /**
     *  查询所有足记
     */
    BaseResult<PageCollectFootBean> listRecord(RequestParams<OnlinemallUserRecord> params);

    /**
     *　删除足记
     */
    BaseResult<OnlinemallUserRecord> deleteRecord(RequestParams<OnlinemallUserRecord> params);


}
