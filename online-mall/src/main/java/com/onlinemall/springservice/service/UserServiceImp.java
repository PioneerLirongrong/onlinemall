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
        logger.info("{调用增加用户的服务,由springservice的addUser方法提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        //先验用户是否已经注册
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            criteria.andMailEqualTo((String) params.getParams().get(MAIL));
        }
        String p1 = "";
        String p2 = "";
        if (StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_1))) {
            p1 = (String) params.getParams().get(PASSWORD_1);
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_2))) {
            p2 = (String) params.getParams().get(PASSWORD_2);
        }
        if (!(p1.equals(p2))) {
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
            String passwordMD5 = CommonUtils.getMD5(((String) params.getParams().get(PASSWORD_1)).trim() + PASSWORD_PARA);
            onlinemallUser.setPassword(passwordMD5);
            onlinemallUser.setRegistertime(new Date());
            onlinemallUserMapper.insert(onlinemallUser);
            //在redis里缓存一份数据,方便登录是做校验
            //缓存手机号
            if (StringUtils.isNotBlank(onlinemallUser.getPhonenumber())) {
                //缓存userId
                CacheUtil.set(onlinemallUser.getPhonenumber(), "");
            }
            //缓存邮箱
            if (StringUtils.isNotBlank(onlinemallUser.getMail())) {
                //缓存userId
                CacheUtil.set(onlinemallUser.getMail(), "");
            }
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            return baseResult;
        }
    }

    public BaseResult<OnlinemallUser> checkUser(RequestParams<OnlinemallUser> params) {
        logger.info("{调用登录用户服务,由springservice的checkUser方法提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        String redisKey4 = null;
        //校验前台的数据
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            criteria.andMailEqualTo((String) params.getParams().get(MAIL));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(ACCOUNT))) {
            criteria.andAccountEqualTo((String) params.getParams().get(ACCOUNT));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(PASSWORD))) {
            String password = (String) params.getParams().get(PASSWORD);
            redisKey4 = CommonUtils.getMD5(password + PASSWORD_PARA);
            criteria.andPasswordEqualTo(redisKey4);
        }
        List<OnlinemallUser> onlinemallUser = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        if (onlinemallUser.size() == 0 || null == onlinemallUser) {
            logger.info("{mysql中存在当前用户\t" + onlinemallUser.get(0).getAccount() + "}");
            return baseResult;
        }
        baseResult.setDataObj(onlinemallUser.get(0));
        baseResult.setCode(BaseResult.SUCCESS);
        logger.info("{mysql中存在当前用户\t" + onlinemallUser.get(0).getAccount() + "}");
        return baseResult;

    }

    public BaseResult<OnlinemallUser> findPassByMailOrPhone(RequestParams<OnlinemallUser> params) {
        logger.info("{调用修改用户密码的服务,由springservice的方法findPassByMailOrPhone提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        String redisKey = "";
        if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidPhone((String) params.getParams().get(PHONENUMBER));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MOBILE_PHONE_FORMAT_ERROR);
                logger.info("{用户手机号码格式有误}");
                return baseResult;
            }
            redisKey = (String) params.getParams().get(PHONENUMBER);
            criteria.andPhonenumberEqualTo((String) params.getParams().get(PHONENUMBER));
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
            //校验前台的数据
            boolean bool = CommonUtils.checkValidEmail((String) params.getParams().get(MAIL));
            if (!bool) {
                baseResult.setErrors(Errors.USER_MAIL_FORMAT_ERROR);
                logger.info("{用户邮箱格式错误}");
                return baseResult;
            }
            redisKey = (String) params.getParams().get(MAIL);
            criteria.andMailEqualTo((String) params.getParams().get(MAIL));
        }
        String p1 = "";
        String p2 = "";
        if (StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_1))) {
            p1 = (String) params.getParams().get(PASSWORD_1);
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(PASSWORD_2))) {
            p2 = (String) params.getParams().get(PASSWORD_2);
        }
        if (!(p1.equals(p2))) {
            logger.info("{密码不一致}");
            baseResult.setErrors(Errors.USER_MAIL_PASSWORD_FORMAT_ERROR);
            return baseResult;
        }
        //现在缓存中查找
        if(!CacheUtil.exists(redisKey)){
            baseResult.setErrors(Errors.USER_NOT_EXIST_ERRPOR);
            return baseResult;
        }
        //查询数据
        List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        logger.info("{selectByExample的结果为" + onlinemallUsers.size() + "\t" + onlinemallUsers.toString() + "}");
        if (onlinemallUsers.size() == 0) {
            baseResult.setErrors(Errors.USER_NOT_EXIST_ERRPOR);
            return baseResult;
        } else {
            OnlinemallUser onlinemallUser = onlinemallUsers.get(0);
            String newPass = CommonUtils.getMD5(p1 + PASSWORD_PARA);
            onlinemallUser.setPassword(newPass);
            //更新mysql中的数据
            onlinemallUserMapper.updateByExample(onlinemallUser, onlinemallUserExample);
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            logger.info("{数据更新成功!!}");
            return baseResult;
        }
    }

    public BaseResult<OnlinemallUser> findOnlineMallUserById(RequestParams<OnlinemallUser> params) {
        logger.info("{调用获取用户详细信息服务,由springservice中的方法findOnlineMallUserById提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        if(StringUtils.isNotBlank((String) params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String) params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        String useId = (String) params.getParams().get(USERID);
        if(StringUtils.isBlank(useId)){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(new OnlinemallUser());
        }
        logger.info("{用户ID为"+useId+"}");
        OnlinemallUser onlinemallUser = onlinemallUserMapper.selectByPrimaryKey(useId);
        if(null == onlinemallUser){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(new OnlinemallUser());
            return baseResult;
        }else {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            return baseResult;
        }
    }
}
