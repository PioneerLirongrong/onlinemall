package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallUserMapper;
import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author lrr
 */
@Service
public class UserServcieImp implements IUserService {

    @Autowired
    private OnlinemallUserMapper onlinemallUserMapper;

    public BaseResult<OnlinemallUser> addUser(RequestParams<OnlinemallUser> params) {
        onlinemallUserMapper.insert(new OnlinemallUser());
        return null;
    }
}
