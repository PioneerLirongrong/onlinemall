package com.onlinemall.controller;


import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.model.OnlinemallUserCollect;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.ICollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.*;
/**
 * @author lrr
 * 收藏接口控制器
 */
@RestController
@RequestMapping("/collect")
public class CollectController {

    private static Logger logger = Logger.getLogger(ConsultController.class);

    @Autowired
    private ICollectionService iCollectionService;

    @RequestMapping(value = "/addCollect",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserCollect> addCollect(@ModelAttribute RequestParams<OnlinemallUserCollect> params){
        logger.info("{请求后台接口\'/collect/addCollect\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserCollect> baseResult = iCollectionService.addCollect(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listCollect",method = RequestMethod.POST)
    public BaseResult<PageCollectFootBean> listCollect(@ModelAttribute RequestParams<OnlinemallUserCollect> params){
        logger.info("{请求后台接口\'/collect/listCollect\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<PageCollectFootBean> baseResult = iCollectionService.listCollect(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }


    @RequestMapping(value = "/deleteCollect",method = RequestMethod.POST)
    public BaseResult<OnlinemallUserCollect> deleteCollect(@ModelAttribute RequestParams<OnlinemallUserCollect> params){
        logger.info("{请求后台接口\'/collect/deleteCollect\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserCollect> baseResult = iCollectionService.deleteCollect(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }


}
