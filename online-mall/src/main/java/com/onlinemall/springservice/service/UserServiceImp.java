package com.onlinemall.springservice.service;

import com.onlinemall.constants.Params;
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
import java.util.Random;

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
            //注册时给当前用户设置一个默认的用户名，后期可一做修改
            if (StringUtils.isNotBlank(onlinemallUser.getPhonenumber())) {
                onlinemallUser.setAccount(onlinemallUser.getPhonenumber() + "用户");
            } else if (StringUtils.isNotBlank(onlinemallUser.getMail())) {
                onlinemallUser.setAccount(onlinemallUser.getMail() + "用户");
            } else {
                onlinemallUser.setAccount("幸运" + String.format("%03d", new Random().nextInt(10) + "") + "用户");
            }
            //设置账户安全分 默认值
            onlinemallUser.setSecuritydegree(60);
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
        String redisKey4;
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
        if (onlinemallUser.size() == 0) {
            logger.info("{mysql中不存在当前用户}");
            return baseResult;
        }
        //在redis中记录这当前用户的登录状态
        CacheUtil.set(onlinemallUser.get(0).getUserid(), Params.LOGIN);
        baseResult.setDataObj(onlinemallUser.get(0));
        baseResult.setCode(BaseResult.SUCCESS);
        logger.info("{mysql中存在当前用户\t" + onlinemallUser.get(0).getAccount() + "}");
        return baseResult;

    }

    public BaseResult<OnlinemallUser> loginOut(RequestParams<OnlinemallUser> params) {
        logger.info("{调用修改用户密码的服务,由springservice的方法loginOut提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        if (StringUtils.isNotBlank((String) params.getParams().get(USERID))) {
            //清除掉redis里的数据
            String userId = (String) params.getParams().get(USERID);
            CacheUtil.set(userId, Params.LOGOUT);
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setStatus(Params.LOGOUT);
            baseResult.setDataObj(new OnlinemallUser());
        } else {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setStatus(Params.LOGOUT);
            baseResult.setDataObj(new OnlinemallUser());
        }
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
        if (!CacheUtil.exists(redisKey)) {
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
        if (StringUtils.isNotBlank((String) params.getParams().get(USERID))) {
            criteria.andUseridEqualTo((String) params.getParams().get(USERID));
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        String useId = (String) params.getParams().get(USERID);
        if (StringUtils.isBlank(useId)) {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(new OnlinemallUser());
        }
        logger.info("{用户ID为" + useId + "}");
        OnlinemallUser onlinemallUser = onlinemallUserMapper.selectByPrimaryKey(useId);
        if (null == onlinemallUser) {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(new OnlinemallUser());
            return baseResult;
        } else {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUser);
            return baseResult;
        }
    }

    public BaseResult<OnlinemallUser> updateOnlineMallUserByUserId(RequestParams<OnlinemallUser> params) {
        logger.info("{调用获取用户详细信息服务,由springservice中的方法updateOnlineMallUserByUserId提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        //先通过userId找到当前的user,然后更新其信息字段
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        String userId = (String) params.getParams().get(USERID);
        if (StringUtils.isBlank(userId)) {
            baseResult.setDataObj(new OnlinemallUser());
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
        } else {
            criteria.andUseridEqualTo(userId);
            List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
            if (0 != onlinemallUsers.size()) {
                OnlinemallUser onlinemallUser = onlinemallUsers.get(0);
                if (StringUtils.isNotBlank((String) params.getParams().get(QQ_NUMBER))) {
                    onlinemallUser.setQqnumber((String) params.getParams().get(QQ_NUMBER));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(WEIXIN_NUMBER))) {
                    onlinemallUser.setWeixinnumber((String) params.getParams().get(WEIXIN_NUMBER));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(WEIBO_NUMBER))) {
                    onlinemallUser.setWeibonumber((String) params.getParams().get(WEIBO_NUMBER));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(NAME))) {
                    onlinemallUser.setName((String) params.getParams().get(NAME));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(SEX))) {
                    onlinemallUser.setSex((String) params.getParams().get(SEX));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(BIRTHDAY))) {
                    onlinemallUser.setBirthday((String) params.getParams().get(BIRTHDAY));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(MAIL))) {
                    onlinemallUser.setMail((String) params.getParams().get(MAIL));
                }
                if (StringUtils.isNotBlank((String) params.getParams().get(PHONENUMBER))) {
                    onlinemallUser.setPhonenumber((String) params.getParams().get(PHONENUMBER));
                }
                if(StringUtils.isNotBlank((String)params.getParams().get(ACCOUNT))){
                    onlinemallUser.setAccount((String)params.getParams().get(ACCOUNT));
                }
                int updateByExample = onlinemallUserMapper.updateByExample(onlinemallUser, onlinemallUserExample);
                if (0 == updateByExample) {
                    baseResult.setErrors(Errors.USER_UPDATE_ERROR);
                    baseResult.setDataObj(new OnlinemallUser());
                    logger.info("{用户跟新失败" + onlinemallUser.getUserid() + "\t" + onlinemallUser.getAccount() + "}");
                } else {
                    logger.info("{用户跟新成功" + onlinemallUser.getUserid() + "\t" + onlinemallUser.getAccount() + "}");
                    baseResult.setCode(BaseResult.SUCCESS);
                    List<OnlinemallUser> onlinemallUsersNew = onlinemallUserMapper.selectByExample(onlinemallUserExample);
                    baseResult.setDataObj(onlinemallUsersNew.get(0));
                }
            } else {
                baseResult.setErrors(Errors.USER_NOT_EXIST_ERRPOR);
                baseResult.setDataObj(new OnlinemallUser());
            }
        }
        return baseResult;
    }

    public BaseResult<OnlinemallUser> getUserLoginOutStatus(RequestParams<OnlinemallUser> params) {
        logger.info("{调用获取用户详细信息服务,由springservice中的方法getUserLoginOutStatus提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setStatus(Params.LOGOUT);
        baseResult.setCode(BaseResult.FAIL);
        if (StringUtils.isNotBlank((String) params.getParams().get(USERID))) {
            String status = CacheUtil.get((String) params.getParams().get(USERID));
            logger.info("{redis里存储的状态为" + status + "}");
            if (StringUtils.isBlank(status)) {
                baseResult.setCode(BaseResult.SUCCESS);
                baseResult.setStatus(Params.LOGOUT);
            } else {
                if (Params.LOGIN.equals(status)) {
                    baseResult.setCode(BaseResult.SUCCESS);
                    baseResult.setStatus(Params.LOGIN);
                } else {
                    baseResult.setCode(BaseResult.SUCCESS);
                    baseResult.setStatus(Params.LOGOUT);
                }
            }
        }
        return baseResult;
    }

    public BaseResult<OnlinemallUser> updateUserSecurityDegree(RequestParams<OnlinemallUser> params) {
        logger.info("{调用获取用户详细信息服务,由springservice中的方法updateUserSecurityDegree提供服务}");
        BaseResult<OnlinemallUser> baseResult = new BaseResult<OnlinemallUser>();
        baseResult.setCode(BaseResult.FAIL);
        String userId = (String) params.getParams().get(Params.USERID);
        if (StringUtils.isBlank(userId)) {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        OnlinemallUserExample onlinemallUserExample = new OnlinemallUserExample();
        OnlinemallUserExample.Criteria criteria = onlinemallUserExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<OnlinemallUser> onlinemallUsers = onlinemallUserMapper.selectByExample(onlinemallUserExample);
        if (0 == onlinemallUsers.size()) {
            baseResult.setErrors(Errors.USER_NOT_EXIST_ERRPOR);
            return baseResult;
        } else {
            OnlinemallUser onlinemallUser = onlinemallUsers.get(0);
            int degree = onlinemallUser.getSecuritydegree();
            String p1 = (String) params.getParams().get(PASSWORD_1);
            String p2 = (String) params.getParams().get(PASSWORD_2);
            if (StringUtils.isNotBlank(p1) && StringUtils.isNotBlank(p2) && p1.equals(p2)) {
                String pass = CommonUtils.getMD5(p1 + Params.PASSWORD_PARA);
                onlinemallUser.setPassword(pass);
                onlinemallUser.setPassword1(p1);
                onlinemallUser.setPassword2(p2);
                degree = degree + 10;
            }
            String pay1 = (String) params.getParams().get(PAY_PASSWORD_1);
            String pay2 = (String) params.getParams().get(PAY_PASSWORD_2);
            if (StringUtils.isNotBlank(pay1) && StringUtils.isNotBlank(pay2) && pay1.equals(pay2)) {
                String pass = CommonUtils.getMD5(pay2 + Params.PASSWORD_PARA);
                onlinemallUser.setPaypassword(pass);
                onlinemallUser.setSecuritypay("1");
                degree = degree + 10;            }
            if(StringUtils.isNotBlank((String)params.getParams().get(Params.REAL_NAME)) &&
                    StringUtils.isNotBlank((String)params.getParams().get(Params.IDENTITYNUMBER))){
                onlinemallUser.setRealname((String)params.getParams().get(Params.REAL_NAME));
                onlinemallUser.setIdentitynumber((String)params.getParams().get(Params.IDENTITYNUMBER));
                degree = degree + 10;
            }
            String problem1 = (String) params.getParams().get(Params.SECURITYPROBLEM_1);
            String problem2 = (String) params.getParams().get(Params.SECURITYPROBLEM_2);
            String ansower1 = (String) params.getParams().get(Params.SECURITYANSOWER_1);
            String ansower2 = (String) params.getParams().get(Params.SECURITYANSOWER_2);
            if(StringUtils.isNotBlank(problem1) && StringUtils.isNotBlank(problem2)
                    && StringUtils.isNotBlank(ansower1) && StringUtils.isNotBlank(ansower2)){
                onlinemallUser.setSecurityproblem1(problem1);
                onlinemallUser.setSecurityproblem2(problem2);
                onlinemallUser.setSecurityansower1(ansower1);
                onlinemallUser.setSecurityansower2(ansower2);
                degree = degree+10;
            }
            onlinemallUser.setSecuritydegree(degree);
            int i = onlinemallUserMapper.updateByExample(onlinemallUser, onlinemallUserExample);
            if(0 == i){
                return baseResult;
            }
        }
        OnlinemallUser onlinemallUser = onlinemallUserMapper.selectByPrimaryKey(userId);
        baseResult.setCode(BaseResult.SUCCESS);
        baseResult.setDataObj(onlinemallUser);
        return baseResult;
    }
}
