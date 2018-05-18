package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.dao.model.OnlinemallGoodsDailyNecessities;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;
import java.util.Map;

public class DailyNecessitiesHandler extends BaseDaoImpl<OnlinemallGoodsDailyNecessities> {

    private static Logger logger = Logger.getLogger(DailyNecessitiesHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");

    public String dailyNecessitiesingHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsDailyNecessities");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql "+selectSql+"}");
        List<OnlinemallGoodsDailyNecessities> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }

    public List<OnlinemallGoodsDailyNecessities> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsDailyNecessities> onlinemallGoodsDailyNecessitiesList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsDailyNecessities.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsDailyNecessitiesList.toString()+"}");
        return onlinemallGoodsDailyNecessitiesList;
    }
}
