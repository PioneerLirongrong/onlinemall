package com.onlinemall.util.util;

import com.onlinemall.utils.UUID.CommonUtils;
import org.junit.Test;

public class CommonUtilTest {

    @Test
    public void test(){
        System.out.println(CommonUtils.getMD5("123456"+"MD5"));
    }
}
