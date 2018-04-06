package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsStationery;
import com.onlinemall.dao.model.OnlinemallGoodsStationeryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsStationeryMapper {
    int countByExample(OnlinemallGoodsStationeryExample example);

    int deleteByExample(OnlinemallGoodsStationeryExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsStationery record);

    int insertSelective(OnlinemallGoodsStationery record);

    List<OnlinemallGoodsStationery> selectByExample(OnlinemallGoodsStationeryExample example, PageBounds rowBounds);

    List<OnlinemallGoodsStationery> selectByExample(OnlinemallGoodsStationeryExample example);

    OnlinemallGoodsStationery selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsStationery record, @Param("example") OnlinemallGoodsStationeryExample example);

    int updateByExample(@Param("record") OnlinemallGoodsStationery record, @Param("example") OnlinemallGoodsStationeryExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsStationery record);

    int updateByPrimaryKey(OnlinemallGoodsStationery record);
}