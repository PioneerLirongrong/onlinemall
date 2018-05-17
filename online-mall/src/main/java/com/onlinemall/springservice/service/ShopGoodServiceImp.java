package com.onlinemall.springservice.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.onlinemall.dao.mapper.*;
import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopGoodService;
import com.onlinemall.utils.httpUtil.HttpClients;
import com.onlinemall.utils.json.MessageJsonUtil;
import com.onlinemall.utils.properties.EnvironmentUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShopGoodServiceImp implements IShopGoodService {

    private static Logger logger = Logger.getLogger(ShopGoodServiceImp.class);
    public static EnvironmentUtil env = new EnvironmentUtil("process.properties");
    private static String data ;
    @Autowired
    private OnlinemallGoodsClothesMapper onlinemallGoodsClothesMapper;

    @Autowired
    private OnlinemallGoodsDrinkingMapper onlinemallGoodsDrinkingMapper;

    @Autowired
    private OnlinemallGoodsShoesMapper onlinemallGoodsShoesMapper;

    @Autowired
    private OnlinemallGoodsDailyNecessitiesMapper onlinemallGoodsDailyNecessitiesMapper;

    @Autowired
    private OnlinemallGoodsCookedFoodMapper onlinemallGoodsCookedFoodMapper;

    @Autowired
    private OnlinemallGoodsBagMapper onlinemallGoodsBagMapper;

    @Autowired
    private OnlinemallGoodsFreshsMapper onlinemallGoodsFreshsMapper;

    @Autowired
    private OnlinemallGoodsStationeryMapper onlinemallGoodsStationeryMapper;

    @Autowired
    private OnlinemallGoodsKitchenMapper onlinemallGoodsKitchenMapper;

    @Autowired
    private JdbcTemplate onlineMallJdbcTemplate;

    /**
     * 服装类
     */
    public BaseResult<OnlinemallGoodsClothes> searchAndListClothes(RequestParams<OnlinemallGoodsClothes> params){
        logger.info("{调用增加用户的服务,由nettyservice的clothesHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsClothes> baseResult = new BaseResult<OnlinemallGoodsClothes>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.response");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsClothes> onlinemallGoodsClothes = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsClothes>>() {});
            baseResult.setDataList(onlinemallGoodsClothes);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
        }

        return null;
    }

    /**
     * 酒类
     */
    public BaseResult<OnlinemallGoodsDrinking> searchAndListDrinkings(RequestParams<OnlinemallGoodsDrinking> params) {
        return null;
    }

    /**
     * 鞋子类
     */
    public BaseResult<OnlinemallGoodsShoes> searchAndListShoes(RequestParams<OnlinemallGoodsShoes> params) {
        return null;
    }

    /**
     * 日常生活类
     */
    public BaseResult<OnlinemallGoodsDailyNecessities> searchAndListNecessities(RequestParams<OnlinemallGoodsDailyNecessities> params) {
        return null;
    }

    /**
     * 熟食类
     */
    public BaseResult<OnlinemallGoodsCookedFood> searchAndListCookedFoods(RequestParams<OnlinemallGoodsCookedFood> params) {
        return null;
    }

    /**
     * 包类
     */
    public BaseResult<OnlinemallGoodsBag> searchAndListGoodsBags(RequestParams<OnlinemallGoodsBag> params) {
        return null;
    }

    /**
     * 生鲜类
     */
    public BaseResult<OnlinemallGoodsFreshs> searchAndListGoodsFreshs(RequestParams<OnlinemallGoodsFreshs> params) {
        return null;
    }

    /**
     * 文具类
     */
    public BaseResult<OnlinemallGoodsStationery> searchAndListGoodsStationerys(RequestParams<OnlinemallGoodsStationery> params) {
        return null;
    }

    /**
     * 厨房用品类
     */
    public BaseResult<OnlinemallGoodsKitchen> searchAndListGoodsKitchens(RequestParams<OnlinemallGoodsKitchen> params) {
        return null;
    }
}
