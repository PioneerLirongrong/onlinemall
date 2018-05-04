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

import javax.management.ObjectName;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.onlinemall.constants.Params.MAIL;
import static com.onlinemall.constants.Params.PHONENUMBER;
import static com.onlinemall.constants.Params.USERNAME;

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
        session.setAttribute(USERNAME,((OnlinemallUser) baseResult.getDataObj()).getAccount());
        session.setAttribute(PHONENUMBER,((OnlinemallUser) baseResult.getDataObj()).getPhonenumber());
        session.setAttribute(MAIL,((OnlinemallUser) baseResult.getDataObj()).getMail());
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/findPassByMailOrPhone",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> findPassByMailOrPhone(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/loginUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.findPassByMailOrPhone(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    public BaseResult<OnlinemallUser> findById(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/loginUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.findOnlineMallUserById(params);
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
