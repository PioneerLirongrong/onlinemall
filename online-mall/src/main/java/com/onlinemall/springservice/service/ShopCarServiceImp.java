package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallShopcarMapper;
import com.onlinemall.dao.model.OnlinemallShopcar;
import com.onlinemall.dao.model.OnlinemallShopcarExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopCarService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.USERID;
import static com.onlinemall.constants.Params.USER_SHOP_CAR_ID;

@Service
public class ShopCarServiceImp implements IShopCarService {


    private static Logger logger = Logger.getLogger(ShopCarServiceImp.class);

    @Autowired
    private OnlinemallShopcarMapper onlinemallShopcarMapper;

    public BaseResult<OnlinemallShopcar> addShopCarItem(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的addShopCarItem方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallShopcar onlinemallShopcar = new RequestParamConvertBeanUtil<OnlinemallShopcar>().convertBean(params, new OnlinemallShopcar());
        onlinemallShopcar.setId(CommonUtils.createUuid());
        onlinemallShopcar.setRegistertime(new Date());
        int insert = onlinemallShopcarMapper.insert(onlinemallShopcar);
        if(0 == insert){
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        baseResult.setCode(BaseResult.SUCCESS);
        baseResult.setDataObj(onlinemallShopcar);
        return baseResult;
    }

    public BaseResult<OnlinemallShopcar> listShopCarItems(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的listShopCarItems方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallShopcarExample onlinemallShopcarExample = new OnlinemallShopcarExample();
        OnlinemallShopcarExample.Criteria criteria = onlinemallShopcarExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        List<OnlinemallShopcar> onlinemallShopcars = onlinemallShopcarMapper.selectByExample(onlinemallShopcarExample);
        baseResult.setDataList(onlinemallShopcars);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    public BaseResult<OnlinemallShopcar> deleteShopCarItem(RequestParams<OnlinemallShopcar> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteShopCarItem方法提供服务}");
        BaseResult<OnlinemallShopcar> baseResult = new BaseResult<OnlinemallShopcar>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallShopcarExample onlinemallShopcarExample = new OnlinemallShopcarExample();
        OnlinemallShopcarExample.Criteria criteria = onlinemallShopcarExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USER_SHOP_CAR_ID))){
            criteria.andIdEqualTo((String)params.getParams().get(USER_SHOP_CAR_ID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        int delete = onlinemallShopcarMapper.deleteByExample(onlinemallShopcarExample);
        if(0 == delete){
            baseResult.setErrors(Errors.SERVICE_DELETE_ERROR);
            return baseResult;
        }
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }
}
