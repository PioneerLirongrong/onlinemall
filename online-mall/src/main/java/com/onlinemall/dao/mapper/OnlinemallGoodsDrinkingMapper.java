package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsDrinking;
import com.onlinemall.dao.model.OnlinemallGoodsDrinkingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsDrinkingMapper {
    int countByExample(OnlinemallGoodsDrinkingExample example);

    int deleteByExample(OnlinemallGoodsDrinkingExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsDrinking record);

    int insertSelective(OnlinemallGoodsDrinking record);

    List<OnlinemallGoodsDrinking> selectByExample(OnlinemallGoodsDrinkingExample example, PageBounds rowBounds);

    List<OnlinemallGoodsDrinking> selectByExample(OnlinemallGoodsDrinkingExample example);

    OnlinemallGoodsDrinking selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsDrinking record, @Param("example") OnlinemallGoodsDrinkingExample example);

    int updateByExample(@Param("record") OnlinemallGoodsDrinking record, @Param("example") OnlinemallGoodsDrinkingExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsDrinking record);

    int updateByPrimaryKey(OnlinemallGoodsDrinking record);
}