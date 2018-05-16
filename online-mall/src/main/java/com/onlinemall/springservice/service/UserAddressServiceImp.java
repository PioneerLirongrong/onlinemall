package com.onlinemall.springservice.service;


import com.onlinemall.constants.Params;
import com.onlinemall.dao.mapper.OnlinemallUserAddressMapper;
import com.onlinemall.dao.model.OnlinemallUserAddress;
import com.onlinemall.dao.model.OnlinemallUserAddressExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserAddressService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lrr
 */
@Service
public class UserAddressServiceImp implements IUserAddressService {

    private static Logger logger = Logger.getLogger(UserAddressServiceImp.class);

    @Autowired
    private OnlinemallUserAddressMapper onlinemallUserAddressMapper;

    public BaseResult addAddress(RequestParams<OnlinemallUserAddress> params) {
        logger.info("{调用增加用户的服务,由springservice的addAddress方法提供服务}");
        BaseResult<OnlinemallUserAddress> baseResult = new BaseResult<OnlinemallUserAddress>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserAddress onlinemallUserAddress = new RequestParamConvertBeanUtil<OnlinemallUserAddress>().convertBean(params, new OnlinemallUserAddress());
        onlinemallUserAddress.setId(CommonUtils.createUuid());
        int insert = onlinemallUserAddressMapper.insert(onlinemallUserAddress);
        if (0 != insert) {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUserAddress);
            logger.info("{添加成功" + params.getParams().get(Params.USERID) + "\t" + onlinemallUserAddress.toString() + "}");
        }
        return baseResult;
    }

    public BaseResult listAddress(RequestParams<OnlinemallUserAddress> params) {
        logger.info("{调用增加用户的服务,由springservice的listAddress方法提供服务}");
        BaseResult<OnlinemallUserAddress> baseResult = new BaseResult<OnlinemallUserAddress>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserAddressExample onlinemallUserAddressExample = new OnlinemallUserAddressExample();
        OnlinemallUserAddressExample.Criteria criteria = onlinemallUserAddressExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(Params.USERID));
        }else {
            baseResult.setDataList(new ArrayList<OnlinemallUserAddress>());
            return baseResult;
        }
        List<OnlinemallUserAddress> onlinemallUserAddresses = onlinemallUserAddressMapper.selectByExample(onlinemallUserAddressExample);
        logger.info("{查到的地址为"+onlinemallUserAddresses.toString()+"}");
        baseResult.setCode(BaseResult.SUCCESS);
        baseResult.setDataList(onlinemallUserAddresses);
        return baseResult;
    }

    public BaseResult updateAddress(RequestParams<OnlinemallUserAddress> params) {
        logger.info("{调用增加用户的服务,由springservice的updateAddress方法提供服务}");
        BaseResult<OnlinemallUserAddress> baseResult = new BaseResult<OnlinemallUserAddress>();
        OnlinemallUserAddressExample onlinemallUserAddressExample = new OnlinemallUserAddressExample();
        OnlinemallUserAddressExample.Criteria criteria = onlinemallUserAddressExample.createCriteria();
        if(StringUtils.isBlank((String) params.getParams().get(Params.ADDRESS_ID))) {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_PROVINCE))){
            criteria.andProvinceEqualTo((String)params.getParams().get(Params.ADDRESS_PROVINCE));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_CITY))){
            criteria.andCityEqualTo((String)params.getParams().get(Params.ADDRESS_CITY));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_COUNTY))){
            criteria.andCountyEqualTo((String)params.getParams().get(Params.ADDRESS_COUNTY));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_PHONENUMBER))){
            criteria.andPhonenumberEqualTo((String)params.getParams().get(Params.ADDRESS_PHONENUMBER));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_USERNAME))){
            criteria.andUsernameEqualTo((String)params.getParams().get(Params.ADDRESS_USERNAME));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(Params.ADDRESS_USERADDRESS))){
            criteria.andUseraddressEqualTo((String)params.getParams().get(Params.ADDRESS_USERADDRESS));
        }
        OnlinemallUserAddress onlinemallUserAddress = onlinemallUserAddressMapper.selectByPrimaryKey((String) params.getParams().get(Params.ADDRESS_ID));
        if(null == onlinemallUserAddress){
            return baseResult;
        }
        int update = onlinemallUserAddressMapper.updateByExample(onlinemallUserAddress, onlinemallUserAddressExample);
        if(0 == update){
            baseResult.setErrors(Errors.USER_ADDRESS_NOT_EXITS);
            return baseResult;
        }
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    public BaseResult deleteAddress(RequestParams<OnlinemallUserAddress> params) {
        logger.info("{调用增加用户的服务,由springservice的deleteAddress方法提供服务}");
        BaseResult<OnlinemallUserAddress> baseResult = new BaseResult<OnlinemallUserAddress>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserAddressExample onlinemallUserAddressExample = new OnlinemallUserAddressExample();
        OnlinemallUserAddressExample.Criteria criteria = onlinemallUserAddressExample.createCriteria();
        if (StringUtils.isNotBlank((String) params.getParams().get(Params.ADDRESS_ID))) {
            criteria.andIdEqualTo((String) params.getParams().get(Params.ADDRESS_ID));
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        if (StringUtils.isNotBlank((String) params.getParams().get(Params.USERID))) {
            criteria.andUseridEqualTo((String) params.getParams().get(Params.USERID));
        } else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            return baseResult;
        }
        int delete = onlinemallUserAddressMapper.deleteByExample(onlinemallUserAddressExample);
        if(0 == delete){
            baseResult.setErrors(Errors.SERVICE_DELETE_ERROR);
            return baseResult;
        }
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }
}
