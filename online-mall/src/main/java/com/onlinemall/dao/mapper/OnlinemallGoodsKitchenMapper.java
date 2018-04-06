package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsKitchen;
import com.onlinemall.dao.model.OnlinemallGoodsKitchenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsKitchenMapper {
    int countByExample(OnlinemallGoodsKitchenExample example);

    int deleteByExample(OnlinemallGoodsKitchenExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsKitchen record);

    int insertSelective(OnlinemallGoodsKitchen record);

    List<OnlinemallGoodsKitchen> selectByExample(OnlinemallGoodsKitchenExample example, PageBounds rowBounds);

    List<OnlinemallGoodsKitchen> selectByExample(OnlinemallGoodsKitchenExample example);

    OnlinemallGoodsKitchen selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsKitchen record, @Param("example") OnlinemallGoodsKitchenExample example);

    int updateByExample(@Param("record") OnlinemallGoodsKitchen record, @Param("example") OnlinemallGoodsKitchenExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsKitchen record);

    int updateByPrimaryKey(OnlinemallGoodsKitchen record);
}