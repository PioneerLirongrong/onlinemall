package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsClothes;
import com.onlinemall.dao.model.OnlinemallGoodsClothesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsClothesMapper {
    int countByExample(OnlinemallGoodsClothesExample example);

    int deleteByExample(OnlinemallGoodsClothesExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsClothes record);

    int insertSelective(OnlinemallGoodsClothes record);

    List<OnlinemallGoodsClothes> selectByExample(OnlinemallGoodsClothesExample example, PageBounds rowBounds);

    List<OnlinemallGoodsClothes> selectByExample(OnlinemallGoodsClothesExample example);

    OnlinemallGoodsClothes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsClothes record, @Param("example") OnlinemallGoodsClothesExample example);

    int updateByExample(@Param("record") OnlinemallGoodsClothes record, @Param("example") OnlinemallGoodsClothesExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsClothes record);

    int updateByPrimaryKey(OnlinemallGoodsClothes record);
}