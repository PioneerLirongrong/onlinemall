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

import java.util.ArrayList;
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
        String head = env.getPropertyValue("shopGoods.clothesHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsClothes> onlinemallGoodsClothes = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsClothes>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsClothes);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsClothes>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 酒类
     */
    public BaseResult<OnlinemallGoodsDrinking> searchAndListDrinkings(RequestParams<OnlinemallGoodsDrinking> params) {
        logger.info("{调用增加用户的服务,由nettyservice的clothesHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsDrinking> baseResult = new BaseResult<OnlinemallGoodsDrinking>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.drinkingHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsDrinking> onlinemallGoodsDrinkings = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsDrinking>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsDrinkings);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsDrinking>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 鞋子类
     */
    public BaseResult<OnlinemallGoodsShoes> searchAndListShoes(RequestParams<OnlinemallGoodsShoes> params) {
        logger.info("{调用增加用户的服务,由nettyservice的clothesHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsShoes> baseResult = new BaseResult<OnlinemallGoodsShoes>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.shoesingHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsShoes> onlinemallGoodsShoes = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsShoes>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsShoes);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsShoes>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 日常生活类
     */
    public BaseResult<OnlinemallGoodsDailyNecessities> searchAndListNecessities(RequestParams<OnlinemallGoodsDailyNecessities> params) {
        logger.info("{调用增加用户的服务,由nettyservice的clothesHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsDailyNecessities> baseResult = new BaseResult<OnlinemallGoodsDailyNecessities>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.dailyNecessitiesingHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsDailyNecessities> onlinemallGoodsDailyNecessitiesList = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsDailyNecessities>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsDailyNecessitiesList);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsDailyNecessities>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 熟食类
     */
    public BaseResult<OnlinemallGoodsCookedFood> searchAndListCookedFoods(RequestParams<OnlinemallGoodsCookedFood> params) {
        logger.info("{调用增加用户的服务,由nettyservice的cookedFoodsHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsCookedFood> baseResult = new BaseResult<OnlinemallGoodsCookedFood>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.cookedFoodsHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsCookedFood> onlinemallGoodsCookedFoodList = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsCookedFood>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsCookedFoodList);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsCookedFood>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 包类
     */
    public BaseResult<OnlinemallGoodsBag> searchAndListGoodsBags(RequestParams<OnlinemallGoodsBag> params) {
        logger.info("{调用增加用户的服务,由nettyservice的goodsBagHandlerResponse方法提供服务}");
        BaseResult<OnlinemallGoodsBag> baseResult = new BaseResult<OnlinemallGoodsBag>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.goodsBagHandlerResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsBag> onlinemallGoodsBags = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsBag>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsBags);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsBag>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 生鲜类
     */
    public BaseResult<OnlinemallGoodsFreshs> searchAndListGoodsFreshs(RequestParams<OnlinemallGoodsFreshs> params) {
        logger.info("{调用增加用户的服务,由nettyservice的goodsFreshsResponse方法提供服务}");
        BaseResult<OnlinemallGoodsFreshs> baseResult = new BaseResult<OnlinemallGoodsFreshs>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.goodsFreshsResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsFreshs> onlinemallGoodsFreshs = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsFreshs>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsFreshs);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsFreshs>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 文具类
     */
    public BaseResult<OnlinemallGoodsStationery> searchAndListGoodsStationerys(RequestParams<OnlinemallGoodsStationery> params) {
        logger.info("{调用增加用户的服务,由nettyservice的goodsStationeryResponse方法提供服务}");
        BaseResult<OnlinemallGoodsStationery> baseResult = new BaseResult<OnlinemallGoodsStationery>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.goodsStationeryResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsStationery> onlinemallGoodsStationeries = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsStationery>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsStationeries);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsStationery>());
            return baseResult;
        }
        return baseResult;
    }

    /**
     * 厨房用品类
     */
    public BaseResult<OnlinemallGoodsKitchen> searchAndListGoodsKitchens(RequestParams<OnlinemallGoodsKitchen> params) {
        logger.info("{调用增加用户的服务,由nettyservice的goodsStationeryResponse方法提供服务}");
        BaseResult<OnlinemallGoodsKitchen> baseResult = new BaseResult<OnlinemallGoodsKitchen>();
        baseResult.setCode(BaseResult.FAIL);
        String head = env.getPropertyValue("shopGoods.goodsKitchenResponse");
        String body = MessageJsonUtil.makeBody(params);
        String message = MessageJsonUtil.convertJsonMessage(head, body);
        try {
            data = HttpClients.send(env.getPropertyValue("NETTY_SERVER_URL"), message, "UTF-8");
            List<OnlinemallGoodsKitchen> onlinemallGoodsKitchens = JSON.parseObject(data, new TypeReference<List<OnlinemallGoodsKitchen>>() {});
            baseResult.setCode(BaseResult.SUCCESS);
            baseResult.setDataList(onlinemallGoodsKitchens);
        } catch (Exception e) {
            logger.error("{后台服务异常"+e.getMessage()+"}");
            baseResult.setDataList(new ArrayList<OnlinemallGoodsKitchen>());
            return baseResult;
        }
        return baseResult;
    }
}
