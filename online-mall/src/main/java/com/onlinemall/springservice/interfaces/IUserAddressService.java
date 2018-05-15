package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallUserAddress;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 */
public interface IUserAddressService {

    /**
     * 增加地址接口
     */
    BaseResult addAddress(RequestParams<OnlinemallUserAddress> params);

    /**
     * 查询地址接口
     */
    BaseResult listAddress(RequestParams<OnlinemallUserAddress> params);

    /**
     * 更新地址接口
     */
    BaseResult updateAddress(RequestParams<OnlinemallUserAddress> params);

    /**
     * 删除地址接口
     */
    BaseResult deleteAddress(RequestParams<OnlinemallUserAddress> params);
}
