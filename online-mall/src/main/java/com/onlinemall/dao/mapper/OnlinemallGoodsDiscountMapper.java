package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsDiscount;
import com.onlinemall.dao.model.OnlinemallGoodsDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsDiscountMapper {
    int countByExample(OnlinemallGoodsDiscountExample example);

    int deleteByExample(OnlinemallGoodsDiscountExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsDiscount record);

    int insertSelective(OnlinemallGoodsDiscount record);

    List<OnlinemallGoodsDiscount> selectByExample(OnlinemallGoodsDiscountExample example, PageBounds rowBounds);

    List<OnlinemallGoodsDiscount> selectByExample(OnlinemallGoodsDiscountExample example);

    OnlinemallGoodsDiscount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsDiscount record, @Param("example") OnlinemallGoodsDiscountExample example);

    int updateByExample(@Param("record") OnlinemallGoodsDiscount record, @Param("example") OnlinemallGoodsDiscountExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsDiscount record);

    int updateByPrimaryKey(OnlinemallGoodsDiscount record);
}