package com.onlinemall.util.util;


import com.onlinemall.utils.cache.CacheUtil;
import org.junit.Test;

public class CacheTest {

    @Test
    public void testCache(){

        boolean result = CacheUtil.exists("aaaa");
        System.out.println(result);

    }

}
