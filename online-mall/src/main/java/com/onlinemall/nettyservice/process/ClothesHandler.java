package com.onlinemall.nettyservice.process;

import com.onlinemall.JdbcTemplateDao.BaseDaoImpl;
import com.onlinemall.dao.model.OnlinemallGoodsClothes;
import com.onlinemall.utils.json.JsonUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * @author lrr
 * 衣服类搜索的netty处理程序
 */
public class ClothesHandler extends BaseDaoImpl<OnlinemallGoodsClothes> {

    private static Logger logger = Logger.getLogger(ClothesHandler.class);
    private static EnvironmentUtil env = new EnvironmentUtil("sql.properties");


    public String clothesHandlerResponse(Map<String,Object> data){
        logger.info("{前台的请求的参数"+data.toString()+"}");

        return null;
    }

    @Override
    public List<OnlinemallGoodsClothes> search(String sql, Object obj, String... args) {
        logger.info("{查询的sql为"+sql+"}");

        return null;
    }
}
