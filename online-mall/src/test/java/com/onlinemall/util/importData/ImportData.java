package com.onlinemall.util.importData;

import com.onlinemall.dao.mapper.OnlinemallGoodsClothesMapper;
import com.onlinemall.dao.model.OnlinemallGoodsClothes;
import com.onlinemall.utils.UUID.CommonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @author lrr
 * 导数据程序
 */
@ContextConfiguration(locations = {"classpath:spring-all.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ImportData {

    @Autowired
    private OnlinemallGoodsClothesMapper onlinemallGoodsClothesMapper;

    @Test
    public void importData() {
        OnlinemallGoodsClothes onlinemallGoodsClothes = new OnlinemallGoodsClothes();
        onlinemallGoodsClothes.setId(CommonUtils.createUuid());
        onlinemallGoodsClothes.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsClothes.setShop(CommonUtils.createUuid());
        onlinemallGoodsClothes.setGoodsname("超薄羽绒服");
        onlinemallGoodsClothes.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsClothes.setOriginalprice(2000);
        onlinemallGoodsClothes.setDiscouuntprice(1800);
        onlinemallGoodsClothes.setSalesmonth(200);
        onlinemallGoodsClothes.setSalescount(300000);
        onlinemallGoodsClothes.setEvaluatecount(5000000);
        onlinemallGoodsClothes.setEvaluateprecent("99%");
        onlinemallGoodsClothes.setClothestype("0");
        onlinemallGoodsClothes.setClothessex("1");
        onlinemallGoodsClothes.setClothesperson("1");
        onlinemallGoodsClothes.setClothescolor("灰白色");
        onlinemallGoodsClothes.setClothessize("XL");
        onlinemallGoodsClothes.setClothesbrand("李宁");
        onlinemallGoodsClothes.setClothescount("10000");
        onlinemallGoodsClothes.setClothesmianliao("涤纶");
        onlinemallGoodsClothes.setClothercode("CL0001");
        onlinemallGoodsClothes.setClothesertime(new Date());
        onlinemallGoodsClothes.setProducttime(new Date());
        onlinemallGoodsClothes.setProductcompany("天津一架构");
        onlinemallGoodsClothes.setProductid("CLPRO0001");
        onlinemallGoodsClothes.setProductplace("天津");
        onlinemallGoodsClothes.setProductallow("MSIAN111111");
        onlinemallGoodsClothes.setPlace("广州");
        onlinemallGoodsClothes.setUrl("ssssssssss");
        int insert = onlinemallGoodsClothesMapper.insert(onlinemallGoodsClothes);
        System.out.println(insert);
    }
}
