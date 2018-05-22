package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallShopcar;
import com.onlinemall.dao.model.OnlinemallShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallShopcarMapper {
    int countByExample(OnlinemallShopcarExample example);

    int deleteByExample(OnlinemallShopcarExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallShopcar record);

    int insertSelective(OnlinemallShopcar record);

    List<OnlinemallShopcar> selectByExample(OnlinemallShopcarExample example, PageBounds rowBounds);

    List<OnlinemallShopcar> selectByExample(OnlinemallShopcarExample example);

    OnlinemallShopcar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallShopcar record, @Param("example") OnlinemallShopcarExample example);

    int updateByExample(@Param("record") OnlinemallShopcar record, @Param("example") OnlinemallShopcarExample example);

    int updateByPrimaryKeySelective(OnlinemallShopcar record);

    int updateByPrimaryKey(OnlinemallShopcar record);
}