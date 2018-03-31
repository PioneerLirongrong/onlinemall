package com.onlinemall.util.util;

import com.onlinemall.utils.json.JsonUtil;
import org.junit.Test;

public class JsonTest {

    @Test
    public void testJson(){
        String text = "{\"name\":\"lirongrong\"}";
        System.out.println(JsonUtil.isJson(text));
    }
}
