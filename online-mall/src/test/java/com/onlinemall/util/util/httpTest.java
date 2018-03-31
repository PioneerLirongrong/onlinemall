package com.onlinemall.util.util;

import com.onlinemall.utils.httpUtil.HttpClients;
import org.junit.Test;

public class httpTest {

    @Test
    public void httpTest() throws Exception {
        String url="http://127.0.0.1:20000";
        String encoding="utf-8";
        String  jsonString= "{\"data\":{\"passwd\":\"\",\"constellation\":\"\",\"phone\":\"\",\"sex\":\"\",\"birth\":\"\",\"uname\":\"\",\"hobby\":\"\",\"photo\":\"\",\"packet\":\"\",\"signature\":\"\"},\"flag\":\"showInfo\"}";
        String result=  HttpClients.send(url,jsonString,encoding);
        System.out.println(result);

    }
}
