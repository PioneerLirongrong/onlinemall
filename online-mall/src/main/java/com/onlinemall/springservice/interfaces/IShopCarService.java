package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallShopcar;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 用户购物车服务接口
 */
public interface IShopCarService {

    /**
     * 添加购物车
     */
    BaseResult<OnlinemallShopcar> addShopCarItem(RequestParams<OnlinemallShopcar> params);

    /**
     * 查询购物车的所有内容
     */
    BaseResult<OnlinemallShopcar> listShopCarItems(RequestParams<OnlinemallShopcar> params);

    /**
     * 删除购物的商品
     */
    BaseResult<OnlinemallShopcar> deleteShopCarItem(RequestParams<OnlinemallShopcar> params);


}
