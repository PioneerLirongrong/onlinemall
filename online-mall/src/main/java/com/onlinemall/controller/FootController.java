package com.onlinemall.controller;


import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.model.OnlinemallUserRecord;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserFootService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 * 删除
 */
@RestController
@RequestMapping("/foot")
public class FootController {

    private static Logger logger = Logger.getLogger(ConsultController.class);

    @Autowired
    private IUserFootService iUserFootService;

    @RequestMapping(value = "/addRecord",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserRecord> addRecord(@ModelAttribute RequestParams<OnlinemallUserRecord> params){
        logger.info("{请求后台接口\'/foot/addRecord\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserRecord> baseResult = iUserFootService.addRecord(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listRecord",method = RequestMethod.POST)
    public BaseResult<PageCollectFootBean> listRecord(@ModelAttribute RequestParams<OnlinemallUserRecord> params){
        logger.info("{请求后台接口\'/foot/listRecord\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<PageCollectFootBean> baseResult = iUserFootService.listRecord(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/deleteRecord",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserRecord> deleteRecord(@ModelAttribute RequestParams<OnlinemallUserRecord> params){
        logger.info("{请求后台接口\'/consult/deleteRecord\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserRecord> baseResult = iUserFootService.deleteRecord(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }


}
