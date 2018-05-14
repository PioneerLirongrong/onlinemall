package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * 用户相关接口
 * @author lrr
 */
public interface IUserService {

    /**
     * 用户注册接口
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> addUser(RequestParams<OnlinemallUser> params);


    /**
     * 用户登录接口
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> checkUser(RequestParams<OnlinemallUser> params);


    /**
     * 退出登录的接口
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> loginOut(RequestParams<OnlinemallUser> params);


    /**
     * 找回密码接口
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> findPassByMailOrPhone(RequestParams<OnlinemallUser> params);


    /**
     * 通过用户id找用户
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> findOnlineMallUserById(RequestParams<OnlinemallUser> params);


    /**
     * 跟新用户的信息
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> updateOnlineMallUserByUserId(RequestParams<OnlinemallUser> params);

    /**
     * 得到用户的登录状态
     * @param params
     * @return
     */
    BaseResult<OnlinemallUser> getUserLoginOutStatus(RequestParams<OnlinemallUser> params);

}
