package com.onlinemall.utils.invoke;

import org.apache.log4j.Logger;

import java.lang.reflect.Method;


/**
 * 反射的工具类
 * @author lr
 */
public class RefMethodTool {
    private static Logger Log = Logger.getLogger(RefMethodTool.class);
    private static String result ;
    private static Class c ;
    private static Method method;
    public static String methodIvoke(String data,String classinfo, String methodname) {
        try{
            c = Class.forName(classinfo);
            Log.info("{Class c is "+c+"}");

            Object object = c.newInstance();
            Log.info("{Object is "+object+"}");

            method = c.getDeclaredMethod(methodname,String.class);
            Log.info("{method "+method+"}");

            result= (String) method.invoke(object, data);
            Log.info("{result "+result+"}");

        }catch (Exception e){
            Log.info("{system error "+e+"}");
        }
       return result;
    }
}
