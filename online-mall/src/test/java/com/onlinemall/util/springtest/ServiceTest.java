package com.onlinemall.util.springtest;


import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@ContextConfiguration(locations = {"classpath:spring-all.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest {
    /**
     * 测试公共模块
     */
    RequestParams params;
    BaseResult baseResult;

    @Autowired
   private IUserService iUserService;

    @Autowired
    private JdbcTemplate onlineMallJdbcTemplate;
    /**
     * 用户模块的测试
     */
    @Test
    public void testUser(){
        params = new RequestParams();
        params.getParams().put("userid","9f8171eca7b14dd59c1fb65200e78432");
        BaseResult onlineMallUserById = iUserService.findOnlineMallUserById(params);
        System.out.println(onlineMallUserById.getDataObj().toString());
    }


    @Test
    public void jdbcTemplateTest(){
        String sql = "select * from onlinemall_user";
        List<Map<String, Object>> onlinemallUsers = onlineMallJdbcTemplate.queryForList(sql);
        for(Map map:onlinemallUsers){
            System.out.println(map.toString());
        }
    }
}
