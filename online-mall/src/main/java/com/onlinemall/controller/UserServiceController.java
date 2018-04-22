package com.onlinemall.controller;

import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lrr
 * 用户服务控制器
 */
@Controller
@RequestMapping("/onlinemall")
public class UserServiceController {

    public static Logger logger = Logger.getLogger(UserServiceController.class);

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/registerUser")
    @ResponseBody
    public BaseResult<OnlinemallUser> registerUser(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/registerUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.addUser(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping("/loginUser")
    public BaseResult<OnlinemallUser> loginUser(@ModelAttribute RequestParams<OnlinemallUser> params){
        logger.info("{请求后台接口\'/onlinemall/loginUser\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallUser> baseResult = iUserService.checkUser(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }
}
