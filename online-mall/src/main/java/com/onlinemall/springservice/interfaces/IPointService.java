package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallUserPoint;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 用户积分接口
 */
public interface IPointService {

    /**
     * 增加积分
     */
    BaseResult<OnlinemallUserPoint> addPoint(RequestParams<OnlinemallUserPoint> params);

    /**
     * 查询积分
     */
    BaseResult<OnlinemallUserPoint> listPoint(RequestParams<OnlinemallUserPoint> params);

    /**
     *计算积分
     */
    BaseResult<OnlinemallUserPoint> cacluPoint(RequestParams<OnlinemallUserPoint> params);
}
