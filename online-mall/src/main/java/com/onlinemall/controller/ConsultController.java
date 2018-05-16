package com.onlinemall.controller;

import com.onlinemall.dao.model.OnlinemallAcquireAdvice;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IConsultService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 * 用户咨询接口
 */
@RestController
@RequestMapping("/consult")
public class ConsultController {

    private static Logger logger = Logger.getLogger(ConsultController.class);

    @Autowired
    private IConsultService iConsultService;

    @RequestMapping(value = "/addAcquireAdvice",method = RequestMethod.POST)
    public BaseResult<OnlinemallAcquireAdvice> addAcquireAdvice(@ModelAttribute RequestParams<OnlinemallAcquireAdvice> params){
        logger.info("{请求后台接口\'/consult/addAcquireAdvice\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult baseResult = iConsultService.addOnlineMallAcquirAdvice(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

}
