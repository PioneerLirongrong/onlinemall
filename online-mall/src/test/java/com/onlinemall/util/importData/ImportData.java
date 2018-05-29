package com.onlinemall.util.importData;

import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.utils.UUID.CommonUtils;
import com.sun.jndi.cosnaming.CNCtx;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Random;

/**
 * @author lrr
 * 导数据程序
 */
@ContextConfiguration(locations = {"classpath:spring-all.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ImportData {

    @Autowired
    private OnlinemallGoodsClothesMapper onlinemallGoodsClothesMapper;

    @Autowired
    private OnlinemallGoodsDrinkingMapper onlinemallGoodsDrinkingMapper;

    @Autowired
    private OnlinemallGoodsDailyNecessitiesMapper onlinemallGoodsDailyNecessitiesMapper;


    @Autowired
    private OnlinemallGoodsFreshsMapper onlinemallGoodsFreshsMapper;

    @Autowired
    private OnlinemallGoodsStationeryMapper onlinemallGoodsStationeryMapper;

    String url = "/resource/";
    //公共属性
    Integer[] originalprice = new Integer[]{195,155,125,99,89,
                                        88,789,123,998,99,
                                        108,556,245,659,996,
                                        128,345,657,897,478};
    String[] colors = new String[]{"灰白色","米白色","黑色","纯白色","蓝色","粉红色","黄色","绿色"};
    int[] salesmonth = new int[]{200,180,300,301,309,45,32,12,18,99,100,25,88,66,120,78,98};
    int[] salescount = new int[]{3002,5990,7882,4567,3344,2233,8979,7532,9870,8883,4555,3344,2282,999};
    int[] evaluatecount = new int[]{78883,98889,4563,12442,4546,3242,56346,12333,98765,6543,234553,87553};
    String[] size = new String[]{"XL","M","L","XXL","XXXL"};
    String[] count = new String[]{"1000","998","888","222","9879","3434","1314","1666","7899","2343","200","180","300","966","88","89","32","12","18","99","100"};
    String[] mianliao = new String[]{"纯棉","涤纶","纯棉50%涤纶50%","麻料","棉织品","丝绸","呢料","棉料"};
    String[] company = new String[]{"湖北好品质有限公司","安徽魄力制品有限公司","天津红场有限公司","福建中心集团","福建恒大科技","湖北正大有限公司","北方有限公司","南方集团有限公司","千方科技","宜昌三宁有限公司","松滋龙有限公司","广工轻功有限公司","北方光大有限公司"};
    String[] place = new String[]{"天津","宜昌","松滋","阜阳","北京","武汉","泉州","荆州","山东","河北","河南","汕头","蛇口","香港","澳门","广州","贵州"};
    String[] brands = new String[]{"海澜之家","特步","耐克","鸿星尔克","李宁","潮我看","才子男装","花花公子"};
    String[] drinkBrands = new String[]{"国窖1973","白云边",
            "江小白","稻花香","牛南山","伏特加","威士忌"};
    String[] dailyBrand = new String[]{"海飞丝","飘柔","瑞发100年","康王","潘婷","霸王"};
    Random random = new Random();
    @Test
    public void importClothesData() {
        int price = originalprice[random.nextInt(originalprice.length)];
        OnlinemallGoodsClothes onlinemallGoodsClothes = new OnlinemallGoodsClothes();
        onlinemallGoodsClothes.setId(CommonUtils.createUuid());
        onlinemallGoodsClothes.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsClothes.setShop(CommonUtils.createUuid());
        onlinemallGoodsClothes.setGoodsname("毛呢外套");
        onlinemallGoodsClothes.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsClothes.setOriginalprice(price);
        onlinemallGoodsClothes.setDiscouuntprice((int)(price*0.9));
        onlinemallGoodsClothes.setSalesmonth(salesmonth[random.nextInt(salesmonth.length)]);
        onlinemallGoodsClothes.setSalescount(salescount[random.nextInt(salescount.length)]);
        onlinemallGoodsClothes.setEvaluatecount(evaluatecount[random.nextInt(evaluatecount.length)]);
        onlinemallGoodsClothes.setEvaluateprecent(random.nextInt(100)+"%");
        onlinemallGoodsClothes.setClothestype("1");
        onlinemallGoodsClothes.setClothessex("1");
        onlinemallGoodsClothes.setClothesperson("1");
        onlinemallGoodsClothes.setClothescolor(colors[random.nextInt(colors.length)]);
        onlinemallGoodsClothes.setClothessize(size[random.nextInt(size.length)]);
        onlinemallGoodsClothes.setClothesbrand(brands[random.nextInt(brands.length)]);
        onlinemallGoodsClothes.setClothescount(count[random.nextInt(count.length)]);
        onlinemallGoodsClothes.setClothesmianliao(mianliao[random.nextInt(mianliao.length)]);
        onlinemallGoodsClothes.setClothercode("CL"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsClothes.setClothesertime(new Date());
        onlinemallGoodsClothes.setProducttime(new Date());
        onlinemallGoodsClothes.setProductcompany(company[random.nextInt(company.length)]);
        onlinemallGoodsClothes.setProductid("CLPR"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsClothes.setProductplace(place[random.nextInt(place.length)]);
        onlinemallGoodsClothes.setProductallow("MSIAN"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsClothes.setPlace(place[random.nextInt(place.length)]);
        onlinemallGoodsClothes.setUrl(url+"clothes/clothes30.jpg");
        int insert = onlinemallGoodsClothesMapper.insert(onlinemallGoodsClothes);
        System.out.println(insert);
    }

    @Test
    public void importDrinkings(){
        int price = originalprice[random.nextInt(originalprice.length)];
        OnlinemallGoodsDrinking onlinemallGoodsDrinking = new OnlinemallGoodsDrinking();
        onlinemallGoodsDrinking.setId(CommonUtils.createUuid());
        onlinemallGoodsDrinking.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsDrinking.setShop(CommonUtils.createUuid());
        onlinemallGoodsDrinking.setGoodsname("洋酒");
        onlinemallGoodsDrinking.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsDrinking.setOriginalprice(price);
        onlinemallGoodsDrinking.setDiscouuntprice((int)(price*0.9));
        onlinemallGoodsDrinking.setSalesmonth(salesmonth[random.nextInt(salesmonth.length)]);
        onlinemallGoodsDrinking.setSalescount(salescount[random.nextInt(salescount.length)]);
        onlinemallGoodsDrinking.setEvaluatecount(evaluatecount[random.nextInt(evaluatecount.length)]);
        onlinemallGoodsDrinking.setEvaluateprecent(random.nextInt(100)+"%");
        onlinemallGoodsDrinking.setDrinkingtype("3");
        onlinemallGoodsDrinking.setDrinkbrand(drinkBrands[random.nextInt(drinkBrands.length)]);
        onlinemallGoodsDrinking.setDrinkingtsize(random.nextInt(100)+"");
        onlinemallGoodsDrinking.setAlcoholdegree(random.nextInt(100));
        onlinemallGoodsDrinking.setSaveway("酒窖");
        onlinemallGoodsDrinking.setDelinetime(100);
        onlinemallGoodsDrinking.setDrinkingcount(Integer.valueOf(count[random.nextInt(count.length)]));
        onlinemallGoodsDrinking.setPeiliao("高粱,枸杞");
        onlinemallGoodsDrinking.setProductid("CLPR"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsDrinking.setUseway("和其他汽水可以混合饮用");
        onlinemallGoodsDrinking.setProducttime(new Date());
        onlinemallGoodsDrinking.setProductcompany(company[random.nextInt(company.length)]);
        onlinemallGoodsDrinking.setProductplace(place[random.nextInt(place.length)]);
        onlinemallGoodsDrinking.setProductallow("MSIAN"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsDrinking.setPlace(place[random.nextInt(place.length)]);
        onlinemallGoodsDrinking.setUrl(url+"drinking/drinking30.jpg");
        int insert = onlinemallGoodsDrinkingMapper.insert(onlinemallGoodsDrinking);
        System.out.println(insert);
    }

    @Test
    public void importNecessities(){
        OnlinemallGoodsDailyNecessities onlinemallGoodsDailyNecessities = new OnlinemallGoodsDailyNecessities();
        int price = random.nextInt(500);
        onlinemallGoodsDailyNecessities.setId(CommonUtils.createUuid());
        onlinemallGoodsDailyNecessities.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsDailyNecessities.setShop(CommonUtils.createUuid());
        onlinemallGoodsDailyNecessities.setGoodsname("白猫洗洁精");
        onlinemallGoodsDailyNecessities.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsDailyNecessities.setOriginalprice(price);
        onlinemallGoodsDailyNecessities.setDiscouuntprice((int)(price*0.9));
        onlinemallGoodsDailyNecessities.setSalesmonth(salesmonth[random.nextInt(salesmonth.length)]);
        onlinemallGoodsDailyNecessities.setSalescount(salescount[random.nextInt(salescount.length)]);
        onlinemallGoodsDailyNecessities.setEvaluatecount(evaluatecount[random.nextInt(evaluatecount.length)]);
        onlinemallGoodsDailyNecessities.setEvaluateprecent(random.nextInt(100)+"%");
        onlinemallGoodsDailyNecessities.setDailynecessitiestype("28");
        onlinemallGoodsDailyNecessities.setDailynecessitiesbrand(dailyBrand[random.nextInt(dailyBrand.length)]);
        onlinemallGoodsDailyNecessities.setDailynecessitiescode("DAILY"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsDailyNecessities.setProducttime(new Date());
        onlinemallGoodsDailyNecessities.setProductcompany(company[random.nextInt(company.length)]);
        onlinemallGoodsDailyNecessities.setProductid("CLPR"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsDailyNecessities.setProductplace(place[random.nextInt(place.length)]);
        onlinemallGoodsDailyNecessities.setProductallow("MSIAN"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsDailyNecessities.setPlace(place[random.nextInt(place.length)]);
        onlinemallGoodsDailyNecessities.setUrl(url+"dailynecessities/dailynecessities30.jpg");
        int insert = onlinemallGoodsDailyNecessitiesMapper.insert(onlinemallGoodsDailyNecessities);
        System.out.println(insert);
    }

    @Test
    public void importFreshGoods(){
        OnlinemallGoodsFreshs onlinemallGoodsFreshs = new OnlinemallGoodsFreshs();
        int price = random.nextInt(300);
        onlinemallGoodsFreshs.setId(CommonUtils.createUuid());
        onlinemallGoodsFreshs.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsFreshs.setShop(CommonUtils.createUuid());
        onlinemallGoodsFreshs.setGoodsname("卤肉-鸡翅");
        onlinemallGoodsFreshs.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsFreshs.setOriginalprice(price);
        onlinemallGoodsFreshs.setDiscouuntprice((int)(price*0.9));
        onlinemallGoodsFreshs.setSalesmonth(salesmonth[random.nextInt(salesmonth.length)]);
        onlinemallGoodsFreshs.setSalescount(salescount[random.nextInt(salescount.length)]);
        onlinemallGoodsFreshs.setEvaluatecount(evaluatecount[random.nextInt(evaluatecount.length)]);
        onlinemallGoodsFreshs.setEvaluateprecent(random.nextInt(100)+"%");
        onlinemallGoodsFreshs.setFreshstype("22");
        onlinemallGoodsFreshs.setFreshsbrand(brands[random.nextInt(brands.length)]);
        onlinemallGoodsFreshs.setSaveway("低温");
        onlinemallGoodsFreshs.setDelinetime(7);
        onlinemallGoodsFreshs.setFreshscount(Integer.valueOf(count[random.nextInt(count.length)]));
        onlinemallGoodsFreshs.setProducttime(new Date());
        onlinemallGoodsFreshs.setProductcompany(company[random.nextInt(company.length)]);
        onlinemallGoodsFreshs.setProductid("CLPR"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsFreshs.setProductplace(place[random.nextInt(place.length)]);
        onlinemallGoodsFreshs.setProductallow("MSIAN"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsFreshs.setPlace(place[random.nextInt(place.length)]);
        onlinemallGoodsFreshs.setUrl(url+"freshs/freshs30.jpg");
        onlinemallGoodsFreshs.setUseway("直接食用");
        int insert = onlinemallGoodsFreshsMapper.insert(onlinemallGoodsFreshs);
        System.out.println(insert);
    }

    @Test
    public void importStationery(){
        OnlinemallGoodsStationery onlinemallGoodsStationery = new OnlinemallGoodsStationery();
        int price = random.nextInt(100);
        onlinemallGoodsStationery.setId(CommonUtils.createUuid());
        onlinemallGoodsStationery.setGoodsid(CommonUtils.createUuid());
        onlinemallGoodsStationery.setShop(CommonUtils.createUuid());
        onlinemallGoodsStationery.setGoodsname("得力牌记号笔");
        onlinemallGoodsStationery.setDiscountid(CommonUtils.createUuid());
        onlinemallGoodsStationery.setOriginalprice(price);
        onlinemallGoodsStationery.setDiscouuntprice((int)(price*0.9));
        onlinemallGoodsStationery.setSalesmonth(salesmonth[random.nextInt(salesmonth.length)]);
        onlinemallGoodsStationery.setSalescount(salescount[random.nextInt(salescount.length)]);
        onlinemallGoodsStationery.setEvaluatecount(evaluatecount[random.nextInt(evaluatecount.length)]);
        onlinemallGoodsStationery.setEvaluateprecent(random.nextInt(100)+"%");
        onlinemallGoodsStationery.setStationerytype("");
        onlinemallGoodsStationery.setStationerycount(count[random.nextInt(count.length)]);
        onlinemallGoodsStationery.setStationerycode("STATIONERY"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsStationery.setStationerytime(new Date());
        onlinemallGoodsStationery.setStationeryperson("2");
        onlinemallGoodsStationery.setProducttime(new Date());
        onlinemallGoodsStationery.setProductcompany(company[random.nextInt(company.length)]);
        onlinemallGoodsStationery.setProductid("CLPR"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsStationery.setProductplace(place[random.nextInt(place.length)]);
        onlinemallGoodsStationery.setProductallow("MSIAN"+String.format(random.nextInt(1000)+"","%03d"));
        onlinemallGoodsStationery.setPlace(place[random.nextInt(place.length)]);
        onlinemallGoodsStationery.setUrl(url+"stationery/stationery28.jpg");
        int insert = onlinemallGoodsStationeryMapper.insert(onlinemallGoodsStationery);
        System.out.println(insert);
    }
}
