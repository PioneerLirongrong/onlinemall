package com.onlinemall.controller;

import com.onlinemall.dao.model.OnlinemallUserBank;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserBankCards;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lrr
 * @deprecated 用户绑卡的控制器
 */
@RestController
@RequestMapping("/userBanks")
public class UserBankCardController {

    private static Logger logger = Logger.getLogger(UserBankCardController.class);

    @Autowired
    private IUserBankCards iUserBankCards;

    @RequestMapping(value = "/addBankCards", method = RequestMethod.POST)
    public BaseResult<OnlinemallUserBank> addBankCards(@ModelAttribute RequestParams<OnlinemallUserBank> params) {
        logger.info("{请求后台接口\'/onlinemall/addBankCards\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserBank> baseResult = iUserBankCards.addBankCard(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listBankCards", method = RequestMethod.POST)
    public BaseResult<OnlinemallUserBank> listBankCards(@ModelAttribute RequestParams<OnlinemallUserBank> params) {
        logger.info("{请求后台接口\'/onlinemall/listBankCards\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserBank> baseResult = iUserBankCards.listBankCard(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/updateBankCards", method = RequestMethod.POST)
    public BaseResult<OnlinemallUserBank> updateBankCards(@ModelAttribute RequestParams<OnlinemallUserBank> params){
        logger.info("{请求后台接口\'/onlinemall/updateBankCards\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserBank> baseResult = iUserBankCards.updateBankCard(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/deleteBankCards", method = RequestMethod.POST)
    public BaseResult<OnlinemallUserBank> deleteBankCards(@ModelAttribute RequestParams<OnlinemallUserBank> params){
        logger.info("{请求后台接口\'/onlinemall/deleteBankCards\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallUserBank> baseResult = iUserBankCards.deleteBankCard(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }
}
