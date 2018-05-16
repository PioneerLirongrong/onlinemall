package com.onlinemall.springservice.service;

import com.onlinemall.constants.Params;
import com.onlinemall.dao.mapper.OnlinemallUserBankMapper;
import com.onlinemall.dao.model.OnlinemallUserBank;
import com.onlinemall.dao.model.OnlinemallUserBankExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserBankCardsService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.onlinemall.constants.Params.BANK_NUMBER;
import static com.onlinemall.constants.Params.USERID;

/**
 * @author lrr
 * 用户绑卡的service
 */
@Service
public class UserBankCardsServiceImp implements IUserBankCardsService {

    private static Logger logger = Logger.getLogger(UserBankCardsServiceImp.class);

    @Autowired
    private OnlinemallUserBankMapper onlinemallUserBankMapper;

    public BaseResult<OnlinemallUserBank> addBankCard(RequestParams<OnlinemallUserBank> params) {
        logger.info("{调用获取用户绑卡详细信息服务,由springservice中的方法addBankCard提供服务}");
        BaseResult<OnlinemallUserBank> baseResult = new BaseResult<OnlinemallUserBank>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserBankExample onlinemallUserBankExample = new OnlinemallUserBankExample();
        OnlinemallUserBankExample.Criteria criteria = onlinemallUserBankExample.createCriteria();
        if(StringUtils.isNotBlank((CharSequence) params.getParams().get(BANK_NUMBER))){
            criteria.andUseridEqualTo((String) params.getParams().get(BANK_NUMBER));
        }
        //先验证改卡是否被绑定
        List<OnlinemallUserBank> onlinemallUserBanks = onlinemallUserBankMapper.selectByExample(onlinemallUserBankExample);
        if(0 != onlinemallUserBanks.size()){
            baseResult.setErrors(Errors.USER_BANK_CARD_ALREADY_BIND);
            return baseResult;
        }
        OnlinemallUserBank onlinemallUserBank = new RequestParamConvertBeanUtil<OnlinemallUserBank>().convertBean(params, new OnlinemallUserBank());
        onlinemallUserBank.setId(CommonUtils.createUuid());
        onlinemallUserBank.setBankbindstatus("1");
        baseResult.setCode(BaseResult.SUCCESS);
        onlinemallUserBankMapper.insert(onlinemallUserBank);
        baseResult.setDataObj(onlinemallUserBank);
        return baseResult;
    }

    public BaseResult<OnlinemallUserBank> listBankCard(RequestParams<OnlinemallUserBank> params) {
        logger.info("{调用获取用户绑卡绑卡详细信息服务,由springservice中的方法listBankCard提供服务}");
        BaseResult<OnlinemallUserBank> baseResult = new BaseResult<OnlinemallUserBank>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserBankExample onlinemallUserBankExample = new OnlinemallUserBankExample();
        OnlinemallUserBankExample.Criteria criteria = onlinemallUserBankExample.createCriteria();
        if(StringUtils.isNotBlank((String) params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String )params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<OnlinemallUserBank>());
            return baseResult;
        }
        List<OnlinemallUserBank> onlinemallUserBanks = onlinemallUserBankMapper.selectByExample(onlinemallUserBankExample);
        logger.info("{onlinemallUserBanks"+onlinemallUserBanks.toString() +"}");
        baseResult.setCode(BaseResult.SUCCESS);
        baseResult.setDataList(onlinemallUserBanks);
        return baseResult;
    }

    /**
     * 此接口基本不用，银行卡信基本会不变
     * @param params
     * @return
     */
    public BaseResult<OnlinemallUserBank> updateBankCard(RequestParams<OnlinemallUserBank> params) {
        logger.info("{调用获取用户绑卡详细信息服务,由springservice中的方法updateBankCard提供服务}");
        BaseResult<OnlinemallUserBank> baseResult = new BaseResult<OnlinemallUserBank>();
        baseResult.setCode(BaseResult.FAIL);
        return baseResult;
    }

    public BaseResult<OnlinemallUserBank> deleteBankCard(RequestParams<OnlinemallUserBank> params) {
        logger.info("{调用获取用户绑卡详细信息服务,由springservice中的方法deleteBankCard提供服务}");
        BaseResult<OnlinemallUserBank> baseResult = new BaseResult<OnlinemallUserBank>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserBankExample onlinemallUserBankExample = new OnlinemallUserBankExample();
        OnlinemallUserBankExample.Criteria criteria = onlinemallUserBankExample.createCriteria();
        if(StringUtils.isNotBlank((String) params.getParams().get(Params.BANK_NUMBER))){
            criteria.andBanknumberEqualTo((String) params.getParams().get(Params.BANK_NUMBER));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        List<OnlinemallUserBank> onlinemallUserBanks = onlinemallUserBankMapper.selectByExample(onlinemallUserBankExample);
        baseResult.setDataObj(onlinemallUserBanks.get(0));
        onlinemallUserBankMapper.deleteByExample(onlinemallUserBankExample);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }
}
