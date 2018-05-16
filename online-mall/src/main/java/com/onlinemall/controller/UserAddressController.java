package com.onlinemall.controller;


import com.onlinemall.dao.model.OnlinemallUserAddress;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserAddressService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author lrr
  用户地址控制器
 */
@RestController
@RequestMapping("/userAddress")
public class UserAddressController {

    private static Logger logger = Logger.getLogger(UserAddressController.class);

    @Autowired
    private IUserAddressService iUserAddressService;

    @RequestMapping(value = "/addAddress" ,method = RequestMethod.POST)
    public BaseResult addAddress(@ModelAttribute RequestParams<OnlinemallUserAddress> params){
        logger.info("{请求后台接口\'/userAddress/addAddress\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult baseResult = iUserAddressService.addAddress(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listAddress" ,method = RequestMethod.POST)
    public BaseResult listAddress(@ModelAttribute RequestParams<OnlinemallUserAddress> params){
        logger.info("{请求后台接口\'/userAddress/listAddress\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult baseResult = iUserAddressService.listAddress(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/updateAddress" ,method = RequestMethod.POST)
    public BaseResult updateAddress(@ModelAttribute RequestParams<OnlinemallUserAddress> params){
        logger.info("{请求后台接口\'/userAddress/updateAddress\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult baseResult = iUserAddressService.updateAddress(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/deleteAddress" ,method = RequestMethod.POST)
    public BaseResult deleteAddress(@ModelAttribute RequestParams<OnlinemallUserAddress> params){
        logger.info("{请求后台接口\'/userAddress/deleteAddress\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult baseResult = iUserAddressService.deleteAddress(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }
}
