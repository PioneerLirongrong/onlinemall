package com.onlinemall.util.springtest;


import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopGoodService;
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

    @Autowired
    private IShopGoodService iShopGoodService;

    /**
     * 用户模块的测试
     */
    @Test
    public void testUser() {
        params = new RequestParams();
//        params.getParams().put("userid", "9f8171eca7b14dd59c1fb65200e78432");
//        BaseResult onlineMallUserById = iUserService.findOnlineMallUserById(params);
//        System.out.println(onlineMallUserById.getDataObj().toString());
        params.getParams().put("password1","123456");
        params.getParams().put("password2","123456");
        params.getParams().put("phonenumber","13821633038");
        BaseResult result = iUserService.addUser(params);
        System.out.println(result.toString());
    }


    @Test
    public void jdbcTemplateTest() {
        String sql = "select * from onlinemall_user";
        List<Map<String, Object>> onlinemallUsers = onlineMallJdbcTemplate.queryForList(sql);
        for (Map map : onlinemallUsers) {
            System.out.println(map.toString());
        }
    }


    @Test
    public void update() {
        params = new RequestParams();
        params.getParams().put("userid","4906fb9502344ad99aba3eaf5dd5fe0d");
        params.getParams().put("accout","750136676@qq.com用户");
        params.getParams().put("name","name");
        params.getParams().put("sex","1");
        params.getParams().put("birthday","1995-11");
        params.getParams().put("phonenumber","13545640028");
        params.getParams().put("mail","750136676@qq.com");
        BaseResult result = iUserService.updateOnlineMallUserByUserId(params);
        System.out.println(result.toString());
    }

    @Test
    public void listClothes(){
        params = new RequestParams();
        params.getParams().put("clothestype","羽绒服");
        iShopGoodService.searchAndListClothes(params);
//        iShopGoodService.searchAndListCookedFoods(params);
//        iShopGoodService.searchAndListDrinkings(params);
//        iShopGoodService.searchAndListGoodsBags(params);
//        iShopGoodService.searchAndListGoodsFreshs(params);
//        iShopGoodService.searchAndListGoodsKitchens(params);
//        iShopGoodService.searchAndListGoodsStationerys(params);
//        iShopGoodService.searchAndListShoes(params);
//        iShopGoodService.searchAndListNecessities(params);
    }
}
