package com.onlinemall.util.springtest;


import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    /**
     * 用户模块的测试
     */
    @Test
    public void testUser(){
        params = new RequestParams();
        params.getParams().put("phonenumber","13535689239");
        params.getParams().put("password1","123456");
        params.getParams().put("password2","123456");
        BaseResult result = iUserService.findPassByMailOrPhone(params);
        System.out.printf(result.toString());
    }
}
