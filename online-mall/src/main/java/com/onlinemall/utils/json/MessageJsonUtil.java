package com.onlinemall.utils.json;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

import static com.onlinemall.constants.Params.*;

/**
 * 拼装netty后台json格式消息的工具类
 * @author lrr
 */
public class MessageJsonUtil {
    /**
     * 拼装数据的格式为json发给netty后台处理
     * @param head classname,method
     * @param body key1:value1,key2:value2
     * @return
     */
    public static String convertJsonMessage(String head,String body){
        //消息的格式:{"HEAD":{"class":"","method":""},"BODY":{"key":"value"}}
        StringBuffer jsonBuffer = new StringBuffer();
        String[] arr1 = head.split(",");
        String classname = "\""+CLASSNAME+"\""+":"+"\""+arr1[0]+"\"";
        String methodname = "\""+METHODNAME+"\""+":"+"\""+arr1[1]+"\"";
        String mess1 = "\""+HEAD+"\""+":{"+classname+","+methodname+"}";
        String[] arr2 = body.split(",");
        StringBuffer jsonTemp = new StringBuffer();
        jsonTemp.append("{");
        int i = 0;
        for(String text:arr2){
            String[] KV = text.split(":");
            String json = "\""+KV[0]+"\""+":"+"\""+KV[1]+"\"";
            if(i == 0){
                jsonTemp.append(json);
                i++;
            }else {
                jsonTemp.append(","+json);
            }
        }
        jsonTemp.append("}");
        //拼装数据
        String message = "{"+mess1+","+"\""+BODY+"\""+":"+jsonTemp.toString()+"}";
        return message;
    }

    /**
     * 解析消息的里处理类
     * @param message
     * @return
     */
    public static String  analysisHead(String message,String context){
        JSONObject object = JsonUtil.convetJsonObject(message);
        String head = object.getString(HEAD);
        JSONObject object1 = JsonUtil.convetJsonObject(head);
        String className = object1.getString(context);
        return className;
    }
    /**
     * 解析消息的消息内容
     * @param message
     * @return
     */
    public static Map<String,Object> analysisBody(String message){
        JSONObject object = JsonUtil.convetJsonObject(message);
        String body = object.getString(BODY);
        Map<String, Object> map = JsonUtil.strToMap(body);
        return map;
    }
}
