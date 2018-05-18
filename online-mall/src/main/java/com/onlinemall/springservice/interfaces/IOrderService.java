package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallOrder;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 用户订单
 */
public interface IOrderService {

    /**
     *  增加订单
     */
    BaseResult<OnlinemallOrder> addOrder(RequestParams<OnlinemallOrder> params);


    /**
     * 查找所有订单
     */
    BaseResult<OnlinemallOrder> listOrder(RequestParams<OnlinemallOrder> params);


    /**
     * 更新订单
     */
    BaseResult<OnlinemallOrder> updateOrder(RequestParams<OnlinemallOrder> params);
}
