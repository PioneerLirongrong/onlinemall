package com.onlinemall.util.util;

import com.onlinemall.utils.UUID.CommonUtils;

public class Test {

    @org.junit.Test
    public void test(){

        String uuid = CommonUtils.createUuid();
        System.out.println(uuid);

    }
}
