package com.onlinemall.springservice.interfaces;

import com.onlinemall.beans.PageCollectFootBean;
import com.onlinemall.dao.model.OnlinemallUserCollect;
import com.onlinemall.param.request.RequestParams;
import com.onlinemall.param.response.BaseResult;

/**
 * @author lrr
 * 用户的收藏接口
 */
public interface ICollectionService {

    /**
     * 新增收藏
     */
    BaseResult<OnlinemallUserCollect> addCollect(RequestParams<OnlinemallUserCollect> params);

    /**
     * 查询所有的收藏
     */
    BaseResult<PageCollectFootBean> listCollect(RequestParams<OnlinemallUserCollect> params);

    /**
     * 删除所有的收藏
     */
    BaseResult<OnlinemallUserCollect> deleteCollect(RequestParams<OnlinemallUserCollect> params);

}
