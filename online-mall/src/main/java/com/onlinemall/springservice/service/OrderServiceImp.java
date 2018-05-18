package com.onlinemall.springservice.service;

import com.onlinemall.constants.Params;
import com.onlinemall.dao.mapper.OnlinemallOrderMapper;
import com.onlinemall.dao.model.OnlinemallOrder;
import com.onlinemall.dao.model.OnlinemallOrderExample;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IOrderService;
import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import com.onlinemall.utils.error.Errors;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.onlinemall.constants.Params.ORDER_ID;
import static com.onlinemall.constants.Params.ORDER_STATUS;
import static com.onlinemall.constants.Params.USERID;

@Service
public class OrderServiceImp implements IOrderService {

    private Logger logger = Logger.getLogger(OrderServiceImp.class);

    @Autowired
    private OnlinemallOrderMapper onlinemallOrderMapper;


    public BaseResult<OnlinemallOrder> addOrder(RequestParams<OnlinemallOrder> params) {
        logger.info("{调用增加订单服务，由springservice的addOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallOrder onlinemallOrder = new RequestParamConvertBeanUtil<OnlinemallOrder>().convertBean(params, new OnlinemallOrder());
        onlinemallOrder.setId(CommonUtils.createUuid());
        onlinemallOrder.setOrdertime(new Date());
        onlinemallOrder.setOrderchengjiaotime(new Date());
        onlinemallOrder.setOrderstatus(Params.ORDER_START_STATUS);
        int insert = onlinemallOrderMapper.insert(onlinemallOrder);
        if(0 == insert){
            logger.info("{订单交易失败}");
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
        }else {
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallOrder);
        }
        return baseResult;
    }


    public BaseResult<OnlinemallOrder> listOrder(RequestParams<OnlinemallOrder> params) {
        logger.info("{调用查询订单服务,由springservice的addOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallOrderExample onlinemallOrderExample = new OnlinemallOrderExample();
        OnlinemallOrderExample.Criteria criteria = onlinemallOrderExample.createCriteria();
        onlinemallOrderExample.setOrderByClause("\'ordertime\' DESC");
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataList(new ArrayList<OnlinemallOrder>());
            return baseResult;
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_ID))){
            criteria.andIdEqualTo((String)params.getParams().get(ORDER_ID));
        }
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_STATUS))){
            criteria.andOrderstatusEqualTo((String)params.getParams().get(ORDER_STATUS));
        }
        List<OnlinemallOrder> onlinemallOrders = onlinemallOrderMapper.selectByExample(onlinemallOrderExample);
        baseResult.setDataList(onlinemallOrders);
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }

    public BaseResult<OnlinemallOrder> updateOrder(RequestParams<OnlinemallOrder> params) {
        logger.info("{调用查询订单服务,由springservice的updateOrder方法提供服务}");
        BaseResult<OnlinemallOrder> baseResult = new BaseResult<OnlinemallOrder>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallOrderExample onlinemallOrderExample = new OnlinemallOrderExample();
        OnlinemallOrderExample.Criteria criteria = onlinemallOrderExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(ORDER_ID))){
            criteria.andIdEqualTo((String)params.getParams().get(ORDER_ID));
        }

        return null;
    }
}
