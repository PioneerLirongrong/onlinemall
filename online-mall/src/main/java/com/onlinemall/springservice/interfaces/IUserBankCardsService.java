package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.OnlinemallUserBank;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
   用户银行卡接口
 */
public interface IUserBankCardsService {

    /**
     * 绑定银行卡
     */
    BaseResult<OnlinemallUserBank> addBankCard(RequestParams<OnlinemallUserBank> params);

    /**
     * 查找银行卡
     */
    BaseResult<OnlinemallUserBank> listBankCard(RequestParams<OnlinemallUserBank> params);


    /**
     * 更细银行卡的信息
     */
    BaseResult<OnlinemallUserBank> updateBankCard(RequestParams<OnlinemallUserBank> params);

    /**
     * 删除银行卡
     */
    BaseResult<OnlinemallUserBank> deleteBankCard(RequestParams<OnlinemallUserBank> params);

}
