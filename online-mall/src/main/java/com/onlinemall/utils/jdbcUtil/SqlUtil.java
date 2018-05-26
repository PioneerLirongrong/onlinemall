package com.onlinemall.utils.jdbcUtil;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author lrr
 * 拼装sql的的工具类
 */
public class SqlUtil {

    private static Logger logger = Logger.getLogger(SqlUtil.class);

    public static String MakeSql(String sql, Map<String, Object> param){
        logger.info("{查询条件为" + param.toString() + "}");
        StringBuffer sqlBuf = new StringBuffer();
        List<String> sqlList = new ArrayList<String>();
        sqlBuf.append(sql);
        if (param.size() != 0) {
            Iterator<Map.Entry<String, Object>> entries = param.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry<String, Object> entry = entries.next();
                String key = entry.getKey();
                Object value = entry.getValue();
                if(key.contains("type")){
                    sqlList.add(key+" LIKE "+ "\'%"+(String)value+"%\'");
                }else if (key.contains("goodsname")){
                    sqlList.add(key+" LIKE "+ "\'%"+(String)value+"%\'");
                }else {
                    sqlList.add(key+" LIKE "+ "\'%"+(String)value+"%\'");
                }
            }
        }
        int i =0;
        for(String text:sqlList){
            if(i == 0){
                sql = sql+" where "+text;
                i++;
            }else {
                sql = sql+" OR "+text;
            }
        }
        logger.info("{拼装的sql为"+sql+"}");
        return sql;
    }
}
