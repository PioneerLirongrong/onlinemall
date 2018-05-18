package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.dao.model.OnlinemallGoodsFreshs;
import com.onlinemall.dao.model.OnlinemallGoodsStationery;
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
public class GoodsStationeryHandler extends BaseDaoImpl<OnlinemallGoodsStationery> {



    private static Logger logger = Logger.getLogger(GoodsStationeryHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");


    public String goodsStationeryResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsStationery");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql"+selectSql+"}");
        List<OnlinemallGoodsStationery> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }


    public List<OnlinemallGoodsStationery> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsStationery> onlinemallGoodsStationeries = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsStationery.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsStationeries.toString()+"}");
        return onlinemallGoodsStationeries;
    }
}
