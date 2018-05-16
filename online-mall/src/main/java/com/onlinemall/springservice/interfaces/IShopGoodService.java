package com.onlinemall.springservice.interfaces;

import com.onlinemall.dao.model.*;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author 商品的接口
 */
public interface IShopGoodService {

    /**
     *　衣服搜索接口
     */
    BaseResult<OnlinemallGoodsClothes> searchAndListClothes(RequestParams<OnlinemallGoodsClothes> params);

    /**
     *　就品类搜索接口
     */
    BaseResult<OnlinemallGoodsDrinking> searchAndListDrinkings(RequestParams<OnlinemallGoodsDrinking> params);

    /**
     *  鞋子类搜索接口
     */
    BaseResult<OnlinemallGoodsShoes> searchAndListShoes(RequestParams<OnlinemallGoodsShoes> params);


    /**
     *  日常用品类搜索接口
     */
    BaseResult<OnlinemallGoodsDailyNecessities> searchAndListNecessities(RequestParams<OnlinemallGoodsDailyNecessities> params);


    /**
     *  熟食类搜索接口
     */
    BaseResult<OnlinemallGoodsCookedFood> searchAndListCookedFoods(RequestParams<OnlinemallGoodsCookedFood> params);

    /**
     *  包类搜索接口
     */
    BaseResult<OnlinemallGoodsBag> searchAndListGoodsBags(RequestParams<OnlinemallGoodsBag> params);


    /**
     *  生鲜类搜索接口
     */
    BaseResult<OnlinemallGoodsFreshs> searchAndListGoodsFreshs(RequestParams<OnlinemallGoodsFreshs> params);


    /**
     *  文具类搜索接口
     */
    BaseResult<OnlinemallGoodsStationery> searchAndListGoodsStationerys(RequestParams<OnlinemallGoodsStationery> params);


    /**
     * 厨房类
     */
    BaseResult<OnlinemallGoodsKitchen> searchAndListGoodsKitchens(RequestParams<OnlinemallGoodsKitchen> params);



}
