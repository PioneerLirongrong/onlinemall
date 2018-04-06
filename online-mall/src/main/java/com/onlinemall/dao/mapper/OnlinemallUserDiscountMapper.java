package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserDiscount;
import com.onlinemall.dao.model.OnlinemallUserDiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserDiscountMapper {
    int countByExample(OnlinemallUserDiscountExample example);

    int deleteByExample(OnlinemallUserDiscountExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserDiscount record);

    int insertSelective(OnlinemallUserDiscount record);

    List<OnlinemallUserDiscount> selectByExample(OnlinemallUserDiscountExample example, PageBounds rowBounds);

    List<OnlinemallUserDiscount> selectByExample(OnlinemallUserDiscountExample example);

    OnlinemallUserDiscount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserDiscount record, @Param("example") OnlinemallUserDiscountExample example);

    int updateByExample(@Param("record") OnlinemallUserDiscount record, @Param("example") OnlinemallUserDiscountExample example);

    int updateByPrimaryKeySelective(OnlinemallUserDiscount record);

    int updateByPrimaryKey(OnlinemallUserDiscount record);
}