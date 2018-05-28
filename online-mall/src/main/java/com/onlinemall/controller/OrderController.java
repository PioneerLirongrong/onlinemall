package com.onlinemall.controller;


import com.onlinemall.dao.model.OnlinemallOrder;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private static Logger logger = Logger.getLogger(OrderController.class);

    @Autowired
    private IOrderService iOrderService;

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public BaseResult<OnlinemallOrder> addOrder(@ModelAttribute RequestParams<OnlinemallOrder> params){
        logger.info("{请求后台接口\'/order/addOrder\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallOrder> baseResult = iOrderService.addOrder(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listOrder",method = RequestMethod.POST)
    public BaseResult<OnlinemallOrder> listOrder(@ModelAttribute RequestParams<OnlinemallOrder> params){
        logger.info("{请求后台接口\'/order/listOrder\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallOrder> baseResult = iOrderService.listOrder(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

}
