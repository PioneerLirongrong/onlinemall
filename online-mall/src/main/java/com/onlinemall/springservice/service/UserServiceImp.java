package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallUserMapper;
import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.dao.model.OnlinemallUserExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.cache.CacheUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.*;

/**
 * 用户服务
 *
 * @author lrr
 */
@Service
public class UserServiceImp implements IUserService {

    private static Logger logger = Logger.getLogger(UserServiceImp.class);

    @Autowired
    private OnlinemallUserMapper onlinemallUserMapper;


    public BaseResult<OnlinemallUser> addUser(RequestParams<OnlinemallUser> params) {
        logger.info("{调用增加用户的服务,由springservice提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        //先验用户是否已经注册
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if(!bool){
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if(!bool){
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            criteria.andMailEqualTo((String) params.getParams().get(MAIL));
        }
        String p1 = "";
        String p2 = "";
        if(StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_1))){
            p1 = (String) params.getParams().get(PASSWORD_1);
        }
        if (StringUtils.isNotBlank((String)params.getParams().get(PASSWORD_2))) {
            p2 = (String) params.getParams().get(PASSWORD_2);
        }
        if(!(p1.equals(p2))){
            logger.info("{密码不一致}");
            baseResult.setErrors(Errors.USER_MAIL_PASSWORD_FORMAT_ERROR);
            return baseResult;
        }
        //查询数据
        List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        logger.info("{selectByExample的结果为" + onlinemallUsers.size() + "\t" + onlinemallUsers.toString() + "}");
        if (onlinemallUsers.size() != 0) {
            //用户已经存在
            baseResult.setErrors(Errors.USER_AREADY_EXIST_ERRPOR);
            logger.info("{用户已经存在}");
            return baseResult;
        } else {
            //用户不存在,创建新的用户
            OnlinemallUser onlinemallUser = new RequestParamConvertBeanUtil<OnlinemallUser>().convertBean(params, new OnlinemallUser());
            onlinemallUser.setUserid(CommonUtils.createUuid());
            String passwordMD5 = CommonUtils.getMD5((params.getParams().get(PASSWORD_1)) + PASSWORD_PARA);
            onlinemallUser.setPassword(passwordMD5);
            onlinemallUser.setRegistertime(new Date());
            //在redis里缓存一份数据,方便登录是做校验
            //缓存手机号
            if(StringUtils.isNotBlank(onlinemallUser.getPhonenumber())){
                CacheUtil.set(onlinemallUser.getPhonenumber(), passwordMD5);
            }
            //缓存邮箱
            if(StringUtils.isNotBlank(onlinemallUser.getMail())){
                CacheUtil.set(onlinemallUser.getMail(),passwordMD5);
            }
            onlinemallUserMapper.insert(onlinemallUser);
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            return baseResult;
        }
    }

    public BaseResult<OnlinemallUser> checkUser(RequestParams<OnlinemallUser> params) {
        logger.info("{调用增加用户的服务,由springservice提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        String redisKey = null;
        String redisValue = null;
        //校验前台的数据
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if(!bool){
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            redisKey = (String) params.getParams().get(PHONENUMBER);
            criteria.andPhonenumberEqualTo(redisKey);
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if(!bool){
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            redisKey = (String) params.getParams().get(MAIL);
            criteria.andMailEqualTo(redisKey);
        }
        if(StringUtils.isNotBlank((String) params.getParams().get(ACCOUNT))){
            redisKey = (String) params.getParams().get(ACCOUNT);
            criteria.andAccountEqualTo(redisKey);
        }
        if(StringUtils.isNotBlank((String) params.getParams().get(PASSWORD))){
            redisValue = (String) params.getParams().get(PASSWORD);
            redisValue = CommonUtils.getMD5(redisValue+PASSWORD_PARA);
            criteria.andPassword1EqualTo(redisValue);
        }
        //现在redis里面找数据,如果没有，再去mysql找数据
        String redisV = CacheUtil.get(redisKey);
        if(null != redisValue && redisValue.equals(redisV)){
            OnlinemallUser onlinemallUser = new RequestParamConvertBeanUtil<OnlinemallUser>().convertBean(params, new OnlinemallUser());
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            logger.info("{Cache中存在当前用户\t"+onlinemallUser.getAccount()+"}");
            return baseResult;
        }else {
            List<OnlinemallUser> onlinemallUser = onlinemallUserMapper.selectByExample(onlinemallUserExample);
            if(onlinemallUser.size() == 0 || null == onlinemallUser){
                logger.info("{mysql中存在当前用户\t"+onlinemallUser.get(0).getAccount()+"}");
                return baseResult;
            }
            baseResult.setDataObj(onlinemallUser.get(0));
            baseResult.setCode(BaseResult.SUCCESS);
            logger.info("{mysql中存在当前用户\t"+onlinemallUser.get(0).getAccount()+"}");
            return baseResult;
        }
    }

    public BaseResult<OnlinemallUser> findPassByMailOrPhone(RequestParams<OnlinemallUser> params) {
        logger.info("{调用增加用户的服务,由springservice提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if(!bool){
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if(!bool){
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            criteria.andMailEqualTo((String) params.getParams().get(MAIL));
        }
        String p1 = "";
        String p2 = "";
        if(StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_1))){
            p1 = (String) params.getParams().get(PASSWORD_1);
        }
        if (StringUtils.isNotBlank((String)params.getParams().get(PASSWORD_2))) {
            p2 = (String) params.getParams().get(PASSWORD_2);
        }
        if(!(p1.equals(p2))){
            logger.info("{密码不一致}");
            baseResult.setErrors(Errors.USER_MAIL_PASSWORD_FORMAT_ERROR);
            return baseResult;
        }
        //查询数据
        List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        logger.info("{selectByExample的结果为" + onlinemallUsers.size() + "\t" + onlinemallUsers.toString() + "}");
        if(onlinemallUsers.size() == 0){
            baseResult.setErrors(Errors.USER_AREADY_NOT_EXIST_ERRPOR);
            return baseResult;
        }else {
            OnlinemallUser onlinemallUser = onlinemallUsers.get(0);
            String newPass = CommonUtils.getMD5(p1+PASSWORD_PARA);
            onlinemallUser.setPassword(newPass);
            //更新mysql中的数据
            onlinemallUserMapper.updateByPrimaryKey(onlinemallUser.getUserid());
            //同时跟新缓存中的数
            if(StringUtils.isNotBlank(onlinemallUser.getMail())){
                CacheUtil.set(onlinemallUser.getMail(),newPass);
            }
            if(StringUtils.isNotBlank(onlinemallUser.getAccount())){
                CacheUtil.set(onlinemallUser.getAccount(),newPass);
            }
            if(StringUtils.isNotBlank(onlinemallUser.getPhonenumber())){
                CacheUtil.set(onlinemallUser.getPhonenumber(),newPass);
            }
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            return baseResult;
        }
    }
}
