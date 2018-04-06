package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallShop;
import com.onlinemall.dao.model.OnlinemallShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallShopMapper {
    int countByExample(OnlinemallShopExample example);

    int deleteByExample(OnlinemallShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallShop record);

    int insertSelective(OnlinemallShop record);

    List<OnlinemallShop> selectByExample(OnlinemallShopExample example, PageBounds rowBounds);

    List<OnlinemallShop> selectByExample(OnlinemallShopExample example);

    OnlinemallShop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallShop record, @Param("example") OnlinemallShopExample example);

    int updateByExample(@Param("record") OnlinemallShop record, @Param("example") OnlinemallShopExample example);

    int updateByPrimaryKeySelective(OnlinemallShop record);

    int updateByPrimaryKey(OnlinemallShop record);
}