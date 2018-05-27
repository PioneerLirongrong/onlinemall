package com.onlinemall.controller;


import com.onlinemall.dao.model.OnlinemallShopcar;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopCarService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 * 用户购物车的控制器
 */
@RestController
@RequestMapping("/onlinemallShopCar")
public class UserShopCarController {

    private static Logger logger = Logger.getLogger(UserShopCarController.class);

    @Autowired
    private IShopCarService iShopCarService;

    @RequestMapping(value = "/addShopCarItem",method = RequestMethod.POST)
    public BaseResult<OnlinemallShopcar> addShopCarItem(@ModelAttribute RequestParams<OnlinemallShopcar> params){
        logger.info("{请求后台接口\'/onlinemallShopCar/addShopCarItem\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallShopcar> baseResult = iShopCarService.addShopCarItem(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/listShopCarItems",method = RequestMethod.POST)
    public BaseResult<OnlinemallShopcar> listShopCarItems(@ModelAttribute RequestParams<OnlinemallShopcar> params){
        logger.info("{请求后台接口\'/onlinemallShopCar/listShopCarItems\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallShopcar> baseResult = iShopCarService.listShopCarItems(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

    @RequestMapping(value = "/deleteShopCarItem",method = RequestMethod.POST)
    public BaseResult<OnlinemallShopcar> deleteShopCarItem(@ModelAttribute RequestParams<OnlinemallShopcar> params){
        logger.info("{请求后台接口\'/onlinemallShopCar/deleteShopCarItem\'}");
        logger.info("{前台的请求参数"+params.toString()+"}");
        BaseResult<OnlinemallShopcar> baseResult = iShopCarService.deleteShopCarItem(params);
        logger.info("{后台返给前台的结果"+baseResult.toString()+"}");
        return baseResult;
    }

}
