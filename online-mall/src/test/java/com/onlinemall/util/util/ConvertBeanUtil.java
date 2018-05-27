package com.onlinemall.util.util;

import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.utils.beanutil.RequestParamConvertBeanUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.onlinemall.constants.Params.MAIL;
import static com.onlinemall.constants.Params.PHONENUMBER;

public class ConvertBeanUtil {

    @Test
    public void test1(){
        RequestParams<OnlinemallUser> params = new RequestParams<OnlinemallUser>();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put(MAIL,"750136676@qq.com");
        map.put(PHONENUMBER,"13545640028");
        params.setParams(map);
        OnlinemallUser onlinemallUser = new OnlinemallUser();
        OnlinemallUser onlinemallUser1 = new RequestParamConvertBeanUtil<OnlinemallUser>().convertBean(params, onlinemallUser);
        System.out.println(onlinemallUser1.toString());

    }
}
