package com.onlinemall.utils.invoke;

import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.util.Map;


/**
 * 反射的工具类
 * @author lr
 */
public class RefMethodTool {
    private static Logger Log = Logger.getLogger(RefMethodTool.class);
    private static String result ;
    private static Class c ;
    private static Method method;
    public static String methodIvoke(Map<String,Object> data, String classinfo, String methodname) {
        try{
            c = Class.forName(classinfo);
            Log.info("{Class c is "+c+"}");

            Object object = c.newInstance();
            Log.info("{Object is "+object+"}");

            method = c.getDeclaredMethod(methodname,Map.class);
            Log.info("{method "+method+"}");

            result= (String) method.invoke(object, data);
            Log.info("{result "+result+"}");

        }catch (Exception e){
            Log.info("{system error "+e+"}");
        }
       return result;
    }
}
