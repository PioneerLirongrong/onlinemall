package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.dao.model.OnlinemallGoodsShoes;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;
import java.util.Map;

public class ShoesHandler extends BaseDaoImpl<OnlinemallGoodsShoes> {


    private static Logger logger = Logger.getLogger(ShoesHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");

    public String shoesingHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsShoes");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql "+selectSql+"}");
        List<OnlinemallGoodsShoes> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }

    public List<OnlinemallGoodsShoes> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsShoes> onlinemallGoodsShoes = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsShoes.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsShoes.toString()+"}");
        return onlinemallGoodsShoes;
    }
}
