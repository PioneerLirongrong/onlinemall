package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.dao.model.OnlinemallGoodsBag;
import com.onlinemall.dao.model.OnlinemallGoodsCookedFood;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;
import java.util.Map;

/**
 * @author lrr
 */
public class GoodsBagHandler extends BaseDaoImpl<OnlinemallGoodsBag> {



    private static Logger logger = Logger.getLogger(GoodsBagHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");


    public String goodsBagHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsBag");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql"+selectSql+"}");
        List<OnlinemallGoodsBag> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }



    public List<OnlinemallGoodsBag> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsBag> onlinemallGoodsBags = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsBag.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsBags.toString()+"}");
        return onlinemallGoodsBags;
    }
}
