package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsShoes;
import com.onlinemall.dao.model.OnlinemallGoodsShoesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsShoesMapper {
    int countByExample(OnlinemallGoodsShoesExample example);

    int deleteByExample(OnlinemallGoodsShoesExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsShoes record);

    int insertSelective(OnlinemallGoodsShoes record);

    List<OnlinemallGoodsShoes> selectByExample(OnlinemallGoodsShoesExample example, PageBounds rowBounds);

    List<OnlinemallGoodsShoes> selectByExample(OnlinemallGoodsShoesExample example);

    OnlinemallGoodsShoes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsShoes record, @Param("example") OnlinemallGoodsShoesExample example);

    int updateByExample(@Param("record") OnlinemallGoodsShoes record, @Param("example") OnlinemallGoodsShoesExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsShoes record);

    int updateByPrimaryKey(OnlinemallGoodsShoes record);
}