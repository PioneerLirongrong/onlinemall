package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.dao.model.OnlinemallGoodsDrinking;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;
import java.util.Map;

/**
 * @author lrr
 * 酒品类的netty
 */
public class DrinkingHandler extends BaseDaoImpl<OnlinemallGoodsDrinking> {

    private static Logger logger = Logger.getLogger(DrinkingHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");

    public String drinkingHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("onlinemallgoodsdrinking");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql"+selectSql+"}");
        List<OnlinemallGoodsDrinking> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }

    public List<OnlinemallGoodsDrinking> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsDrinking> onlinemallGoodsDrinkings = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsDrinking.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsDrinkings.toString()+"}");
        return onlinemallGoodsDrinkings;
    }
}
