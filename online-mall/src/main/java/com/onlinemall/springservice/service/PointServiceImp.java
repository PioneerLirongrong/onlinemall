package com.onlinemall.springservice.service;

import com.onlinemall.dao.mapper.OnlinemallUserPointMapper;
import com.onlinemall.dao.model.OnlinemallUserPoint;
import com.onlinemall.dao.model.OnlinemallUserPointExample;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IPointService;
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

import static com.onlinemall.constants.Params.*;

/**
 * @author lrr
 * 用户积分
 */
@Service
public class PointServiceImp implements IPointService {

    private Logger logger = Logger.getLogger(ConsultServiceImp.class);

    @Autowired
    private OnlinemallUserPointMapper onlinemallUserPointMapper;

    public BaseResult<OnlinemallUserPoint> addPoint(RequestParams<OnlinemallUserPoint> params) {
        logger.info("{调用增加用户的服务,由springservice的addPoint方法提供服务}");
        BaseResult<OnlinemallUserPoint> baseResult = new BaseResult<OnlinemallUserPoint>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserPoint onlinemallUserPoint = new RequestParamConvertBeanUtil<OnlinemallUserPoint>().convertBean(params, new OnlinemallUserPoint());
        onlinemallUserPoint.setId(CommonUtils.createUuid());
        onlinemallUserPoint.setPointtime(new Date());
        int insert = onlinemallUserPointMapper.insert(onlinemallUserPoint);
        if(0 != insert){
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataObj(onlinemallUserPoint);
        }
        return baseResult;
    }

    public BaseResult<OnlinemallUserPoint> listPoint(RequestParams<OnlinemallUserPoint> params) {
        logger.info("{调用增加用户的服务,由springservice的addPoint方法提供服务}");
        BaseResult<OnlinemallUserPoint> baseResult = new BaseResult<OnlinemallUserPoint>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserPointExample onlinemallUserPointExample = new OnlinemallUserPointExample();
        OnlinemallUserPointExample.Criteria criteria = onlinemallUserPointExample.createCriteria();
        if(StringUtils.isNotBlank((String)params.getParams().get(USERID))){
            criteria.andUseridEqualTo((String)params.getParams().get(USERID));
        }else {
            baseResult.setErrors(Errors.REQUEST_PARAM_ERROR);
            baseResult.setDataObj(new ArrayList<OnlinemallUserPoint>());
            return baseResult;
        }
        List<OnlinemallUserPoint> onlinemallUserPoints = onlinemallUserPointMapper.selectByExample(onlinemallUserPointExample);
        baseResult.setCode(BaseResult.SUCCESS);
        baseResult.setDataList(onlinemallUserPoints);
        return baseResult;
    }

    public BaseResult<OnlinemallUserPoint> cacluPoint(RequestParams<OnlinemallUserPoint> params) {
        logger.info("{调用增加用户的服务,由springservice的addPoint方法提供服务}");
        BaseResult<OnlinemallUserPoint> baseResult = new BaseResult<OnlinemallUserPoint>();
        baseResult.setCode(BaseResult.FAIL);
        OnlinemallUserPointExample onlinemallUserPointExample = new OnlinemallUserPointExample();
        OnlinemallUserPointExample.Criteria criteria = onlinemallUserPointExample.createCriteria();
        criteria.andPointtypeEqualTo(USER_POINT_INCR);
        List<OnlinemallUserPoint> onlinemallUserPoints = onlinemallUserPointMapper.selectByExample(onlinemallUserPointExample);
        int sumadd =0;
        for(OnlinemallUserPoint onlinemallUserPoint:onlinemallUserPoints){
            sumadd += Integer.valueOf(onlinemallUserPoint.getPointchange());
        }
        criteria.andPointtypeEqualTo(USER_POINT_UN_INCR);
        List<OnlinemallUserPoint> onlinemallUserPointsNew = onlinemallUserPointMapper.selectByExample(onlinemallUserPointExample);
        int sumsub =0;
        for(OnlinemallUserPoint onlinemallUserPoint:onlinemallUserPointsNew){
            sumsub += Integer.valueOf(onlinemallUserPoint.getPointchange());
        }
        if(sumadd > sumsub){
            baseResult.setDataObj(sumadd - sumsub);
        }else {
            baseResult.setDataObj(0);
        }
        baseResult.setCode(BaseResult.SUCCESS);
        return baseResult;
    }
}
