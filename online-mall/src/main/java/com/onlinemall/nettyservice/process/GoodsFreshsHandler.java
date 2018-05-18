package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.dao.model.OnlinemallGoodsBag;
import com.onlinemall.dao.model.OnlinemallGoodsFreshs;
import com.onlinemall.mysqlbasedao.BaseDaoImpl;
import com.onlinemall.utils.jdbcUtil.SqlUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;
import java.util.Map;

public class GoodsFreshsHandler extends BaseDaoImpl<OnlinemallGoodsFreshs> {


    private static Logger logger = Logger.getLogger(GoodsFreshsHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");


    public String goodsFreshsResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsFreshs");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql"+selectSql+"}");
        List<OnlinemallGoodsFreshs> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }

    public List<OnlinemallGoodsFreshs> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsFreshs> onlinemallGoodsFreshs = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsFreshs.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsFreshs.toString()+"}");
        return onlinemallGoodsFreshs;
    }
}
