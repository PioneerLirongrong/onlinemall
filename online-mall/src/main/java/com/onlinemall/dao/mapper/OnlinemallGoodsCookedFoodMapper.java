package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsCookedFood;
import com.onlinemall.dao.model.OnlinemallGoodsCookedFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsCookedFoodMapper {
    int countByExample(OnlinemallGoodsCookedFoodExample example);

    int deleteByExample(OnlinemallGoodsCookedFoodExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsCookedFood record);

    int insertSelective(OnlinemallGoodsCookedFood record);

    List<OnlinemallGoodsCookedFood> selectByExample(OnlinemallGoodsCookedFoodExample example, PageBounds rowBounds);

    List<OnlinemallGoodsCookedFood> selectByExample(OnlinemallGoodsCookedFoodExample example);

    OnlinemallGoodsCookedFood selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsCookedFood record, @Param("example") OnlinemallGoodsCookedFoodExample example);

    int updateByExample(@Param("record") OnlinemallGoodsCookedFood record, @Param("example") OnlinemallGoodsCookedFoodExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsCookedFood record);

    int updateByPrimaryKey(OnlinemallGoodsCookedFood record);
}