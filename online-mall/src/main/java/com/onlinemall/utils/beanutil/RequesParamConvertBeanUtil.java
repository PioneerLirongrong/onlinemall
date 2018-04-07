package com.onlinemall.utils.beanutil;

import com.onlinemall.param.request.RequestParams;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 请求参数到bean的转换
 * @param <T>
 */
public class RequesParamConvertBeanUtil<T> {
    public static Logger logger = Logger.getLogger(RequestParams.class);

    public  T convertBean(RequestParams<T> params,T cls){
        T object = null;
        Class<T> ac = (Class<T>) cls.getClass();
        try {
            object = ac.newInstance();
        } catch (Exception e) {
            logger.error("{对象创建失败}");
        }
        Map<String, Object> equal = params.getEqual();
        Field[] fields = ac.getFields();
        Set<String> keySet = equal.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            for(Field field:fields){
                if(text.equals(field.getName())){
                    String txt = field.getName();
                    String methodName = "set"+txt.substring(0,1).toUpperCase()+txt.substring(1);
                    try {
                        Method method = ac.getDeclaredMethod(methodName);
                        method.invoke(object,equal.get(text));
                    } catch (Exception e) {
                        logger.error("{没有该方法}");
                    }
                }
            }
        }
        return object;
    }
}
