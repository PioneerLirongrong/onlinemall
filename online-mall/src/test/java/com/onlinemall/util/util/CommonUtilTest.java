package com.onlinemall.util.util;

import com.onlinemall.utils.UUID.CommonUtils;
import com.onlinemall.utils.cache.CacheUtil;
import org.junit.Test;

public class CommonUtilTest {

    @Test
    public void test(){
//        for(int i=0;i<5;i++){
//            System.out.println(CommonUtils.getMD5("123456"+"MD5"));
//       }
        CacheUtil.set("13545640028@qq.com",CommonUtils.getMD5("haihai"+"MD5"));
        System.out.println(CacheUtil.get("13545640028@qq.com"));
    }
}
