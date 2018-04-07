package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallUserMapper;
import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.dao.model.OnlinemallUserExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.onlinemall.constants.Params.MAIL;
import static com.onlinemall.constants.Params.PHONENUMBER;

/**
 * 用户服务
 * @author lrr
 */
@Service
public class UserServiceImp implements IUserService {

    public static Logger logger = Logger.getLogger(UserServiceImp.class);

    @Autowired
    private OnlinemallUserMapper onlinemallUserMapper;


    public BaseResult<OnlinemallUser> addUser(RequestParams<OnlinemallUser> params) {
        logger.info("{调用增加用户的服务,由springservice提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        //先验用户是否已经注册
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(PHONENUMBER))) {
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(MAIL))){
            criteria.andMailEqualTo((String)params.getParams().get(MAIL));
        }
        //查询数据
        List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        logger.info("{selectByExample的结果为"+onlinemallUsers.size()+"\t"+onlinemallUsers.toString()+"}");
        if(onlinemallUsers.size() != 0){
            //用户已经存在
            baseResult.setErrors(Errors.USER_AREADY_EXIST_ERRPOR);
            logger.info("{用户已经存在}");
        }else {
            //用户不存在,创建新的用户
            OnlinemallUser onlinemallUser = new RequestParamConvertBeanUtil<OnlinemallUser>().convertBean(params, new OnlinemallUser());
            onlinemallUser.setUserid(CommonUtils.createUuid());
            onlinemallUserMapper.insert(onlinemallUser);
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
        }
        return baseResult;
    }
}
