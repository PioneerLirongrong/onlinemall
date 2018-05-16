package com.onlinemall.controller;

import com.onlinemall.dao.model.OnlinemallUserPoint;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IPointService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 * 积分
 */
@RestController
@RequestMapping("/point")
public class PointCrontroller {

    private static Logger logger = Logger.getLogger(PointCrontroller.class);

    @Autowired
    private IPointService iPointService;

    @RequestMapping(value = "/addPoint",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserPoint> addPoint(@ModelAttribute RequestParams<OnlinemallUserPoint> params){
        logger.info("{请求后台接口\'/point/addPoint\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserPoint> baseResult = iPointService.addPoint(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listPoint",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserPoint> listPoint(@ModelAttribute RequestParams<OnlinemallUserPoint> params){
        logger.info("{请求后台接口\'/point/listPointt\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserPoint> baseResult = iPointService.listPoint(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/cacluPoint",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserPoint> cacluPoint(@ModelAttribute RequestParams<OnlinemallUserPoint> params){
        logger.info("{请求后台接口\'/point/cacluPoint\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserPoint> baseResult = iPointService.cacluPoint(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }


}
