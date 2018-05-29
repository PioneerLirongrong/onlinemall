package com.onlinemall.controller;


import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;
import com.onlinemall.springservice.interfaces.IShopGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.*;

/**
 * @author lrr
 * 主页商品搜索的的控制器
 */
@RestController
@RequestMapping("/shop")
public class ShopController {

    private static Logger logger = Logger.getLogger(ShopController.class);

    @Autowired
    private IShopGoodService iShopGoodService;

    @RequestMapping(value = "/listClothes",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsClothes> searchAndListClothes(@ModelAttribute RequestParams<OnlinemallGoodsClothes> params){
        logger.info("{请求后台接口\'/shop/listClothes\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsClothes> baseResult = iShopGoodService.searchAndListClothes(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listDrinking",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsDrinking> searchAndListShopDrinking(@ModelAttribute RequestParams<OnlinemallGoodsDrinking> params){
        logger.info("{请求后台接口\'/shop/listDrinking\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsDrinking> baseResult = iShopGoodService.searchAndListDrinkings(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listShoes",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsShoes> searchAndListShopShoes(@ModelAttribute RequestParams<OnlinemallGoodsShoes> params){
        logger.info("{请求后台接口\'/shop/listShoes\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsShoes> baseResult = iShopGoodService.searchAndListShoes(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listNecessities",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsDailyNecessities> searchAndListShopNecessities(@ModelAttribute RequestParams<OnlinemallGoodsDailyNecessities> params){
        logger.info("{请求后台接口\'/shop/listNecessities\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsDailyNecessities> baseResult = iShopGoodService.searchAndListNecessities(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listCookedFoods",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsCookedFood> searchAndListShopCookedFoods(@ModelAttribute RequestParams<OnlinemallGoodsCookedFood> params){
        logger.info("{请求后台接口\'/shop/listCookedFoods\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsCookedFood> baseResult = iShopGoodService.searchAndListCookedFoods(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listGoodsBags",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsBag> searchAndListShopGoodsBags(@ModelAttribute RequestParams<OnlinemallGoodsBag> params){
        logger.info("{请求后台接口\'/shop/listGoodsBags\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsBag> baseResult = iShopGoodService.searchAndListGoodsBags(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listGoodsFreshs",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsFreshs> searchAndListShopGoodsFreshs(@ModelAttribute RequestParams<OnlinemallGoodsFreshs> params){
        logger.info("{请求后台接口\'/shop/listGoodsFreshs\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsFreshs> baseResult = iShopGoodService.searchAndListGoodsFreshs(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listGoodsStationerys",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsStationery> searchAndListShopGoodsStationerys(@ModelAttribute RequestParams<OnlinemallGoodsStationery> params){
        logger.info("{请求后台接口\'/shop/listGoodsStationerys\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsStationery> baseResult = iShopGoodService.searchAndListGoodsStationerys(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }

    @RequestMapping(value = "/listGoodsKitchens",method = RequestMethod.POST)
    public BaseResult<OnlinemallGoodsKitchen> searchAndListShopGoodsKitchens(@ModelAttribute RequestParams<OnlinemallGoodsKitchen> params){
        logger.info("{请求后台接口\'/shop/listGoodsKitchens\'}");
        logger.info("{前台的请求参数" + params.toString() + "}");
        BaseResult<OnlinemallGoodsKitchen> baseResult = iShopGoodService.searchAndListGoodsKitchens(params);
        logger.info("{后台返给前台的结果" + baseResult.toString() + "}");
        return baseResult;
    }
}
