package com.onlinemall.util.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.onlinemall.utils.json.JsonUtil;
import com.onlinemall.utils.json.MessageJsonUtil;
import org.junit.Test;

import java.util.Map;

import static com.onlinemall.constants.Params.*;

public class MessageJsonUtilTest {

    @Test
    public void testMessage(){
        String head = "com.onlinemall.utils.json.MessageJsonUtil,convertJsonMessage";
        String body = "";
//        String body = "na+me:tomcat,password:*******";
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        System.out.println(message);
//        boolean json = JsonUtil.isJson(message);
//        JSONObject object = JsonUtil.convetJsonObject(message);
//        System.out.println(objmakeBodyect.getString(HEAD));
//        System.out.println(object.getString(BODY));

//        String classname = MessageJsonUtil.analysisHead(message, CLASSNAME);
//        String methodname = MessageJsonUtil.analysisHead(message, METHODNAME);
//        Map<String, Object> map = MessageJsonUtil.analysisBody(message);
//        System.out.println(classname);
//        System.out.println(methodname);
//        System.out.println(map.toString());
//        System.out.println(map.get("name")+"\t"+map.get("password"));
    }
}
