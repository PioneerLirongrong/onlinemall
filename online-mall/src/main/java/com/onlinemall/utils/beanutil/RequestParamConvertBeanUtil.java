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
 * @author
 */
public class RequestParamConvertBeanUtil<T> {
    public static Logger logger = Logger.getLogger(RequestParams.class);


    public T convertBean(RequestParams<T> params, T cls) {
        T object = null;
        Class<T> ac = (Class<T>) cls.getClass();
        try {
            object = ac.newInstance();
        } catch (Exception e) {
            logger.error("{对象创建失败}");
        }
        Map<String, Object> param = params.getParams();
        Field[] fields = ac.getDeclaredFields();
        Method[] methods = ac.getDeclaredMethods();
        Set<String> keySet = param.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            for (Field field : fields) {
                if (text.equals(field.getName())) {
                    String txt = field.getName();
                    String methodName = "set" + txt.substring(0, 1).toUpperCase() + txt.substring(1);
                    for (Method method : methods) {
                        if (methodName.equals(method.getName())) {
                            try {
                                method.invoke(object, param.get(text));
                            } catch (Exception e) {
                                logger.info("{" + ac.getName() + "\t" + method.getName() + "方法反射失败}");
                            }
                        }
                    }
                }
            }
        }
        return object;
    }
}
