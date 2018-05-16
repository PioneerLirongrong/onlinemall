package com.onlinemall.controller;

import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.onlinemall.constants.Params.ACCOUNT;

/**
 * @author lrr
 * 用户服务控制器
 */
@RestController
@RequestMapping("/onlinemall")
public class UserServiceController {

    private static Logger logger = Logger.getLogger(UserServiceController.class);

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> registerUser(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/registerUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.addUser(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/loginUser",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> loginUser(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/loginUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.checkUser(params);
        HttpSession session = getSession();
        session.setAttribute(ACCOUNT,((OnlinemallUser) baseResult.getDataObj()).getAccount());
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/findPassByMailOrPhone",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> findPassByMailOrPhone(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/findPassByMailOrPhone\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.findPassByMailOrPhone(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> findOnlineMallUserById(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/getUserInfo\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.findOnlineMallUserById(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/getUserLoginOutStatus",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> getUserLoginOutStatus(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/getUserLoginOutStatus\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.getUserLoginOutStatus(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/updateUserAllInformation",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> updateOnlineMallUserByUserId(@ModelAttribute RequestParams params){
        logger.info("{请求后台接口\'/onlinemall/updateOnlineMallUserByUserId\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.updateOnlineMallUserByUserId(params);
        HttpSession session = getSession();
        session.setAttribute(ACCOUNT,((OnlinemallUser) baseResult.getDataObj()).getAccount());
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/loginOut",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> loginOut(@ModelAttribute RequestParams params){
        logger.info("{请求后台接口\'/onlinemall/loginOut\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.loginOut(params);
        HttpSession session = getSession();
        session.setAttribute(ACCOUNT,((OnlinemallUser) baseResult.getDataObj()).getAccount());
        session.invalidate();
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/updateUserSecurityDegree",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> updateUserSecurityDegree(@ModelAttribute RequestParams params){
        logger.info("{请求后台接口\'/onlinemall/updateUserSecurityDegree\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.updateUserSecurityDegree(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    /**
     * 获取session
     * */
    public static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {}
        return session;
    }

    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
}
