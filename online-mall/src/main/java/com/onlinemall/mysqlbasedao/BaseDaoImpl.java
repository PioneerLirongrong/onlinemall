package com.onlinemall.mysqlbasedao;

import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;


public abstract class BaseDaoImpl<T>{

    private static Logger logger = Logger.getLogger(BaseDaoImpl.class);
    public  JdbcTemplate jdbcTemplate;
    public DriverManagerDataSource dataSource;
    private static EnvironmentUtil env = new EnvironmentUtil("mysql-db.properties");

    public BaseDaoImpl(){
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getPropertyValue("mysql.driver"));
        dataSource.setUrl(env.getPropertyValue("mysql.live.url"));
        dataSource.setUsername(env.getPropertyValue("mysql.username"));
        dataSource.setPassword(env.getPropertyValue("mysql.password"));
        jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("{jdbc初始化成功!!!}");
    }


    /**
     *　自己封装抽象的查询方法
     */
    public abstract  List<T> search(String sql,Object obj,String ...args);


}
