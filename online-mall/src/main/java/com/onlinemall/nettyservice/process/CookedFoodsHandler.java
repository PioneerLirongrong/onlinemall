package com.onlinemall.nettyservice.process;

import com.alibaba.fastjson.JSON;
import com.onlinemall.dao.model.OnlinemallGoodsClothes;
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
 * 熟食类接口
 */
public class CookedFoodsHandler extends BaseDaoImpl<OnlinemallGoodsCookedFood> {

    private static Logger logger = Logger.getLogger(CookedFoodsHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");


    public String cookedFoodsHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");
        String sql = env.getPropertyValue("OnlinemallGoodsCookedFood");
        String selectSql = SqlUtil.MakeSql(sql, data);
        logger.info("{查询的sql"+selectSql+"}");
        List<OnlinemallGoodsCookedFood> search = search(selectSql, new Object(), new String[]{});
        logger.info("{查询的结果"+search.toString()+"}");
        String jsonString = JSON.toJSONString(search);
        logger.info("{查询的结果"+jsonString+"}");
        return jsonString;
    }


    public List<OnlinemallGoodsCookedFood> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");
        List<OnlinemallGoodsCookedFood> onlinemallGoodsCookedFoodList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(OnlinemallGoodsCookedFood.class));
        logger.info("{jdbcTemplate查询的结果"+onlinemallGoodsCookedFoodList.toString()+"}");
        return onlinemallGoodsCookedFoodList;
    }
}
