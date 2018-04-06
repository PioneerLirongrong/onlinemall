package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsDailyNecessities;
import com.onlinemall.dao.model.OnlinemallGoodsDailyNecessitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsDailyNecessitiesMapper {
    int countByExample(OnlinemallGoodsDailyNecessitiesExample example);

    int deleteByExample(OnlinemallGoodsDailyNecessitiesExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsDailyNecessities record);

    int insertSelective(OnlinemallGoodsDailyNecessities record);

    List<OnlinemallGoodsDailyNecessities> selectByExample(OnlinemallGoodsDailyNecessitiesExample example, PageBounds rowBounds);

    List<OnlinemallGoodsDailyNecessities> selectByExample(OnlinemallGoodsDailyNecessitiesExample example);

    OnlinemallGoodsDailyNecessities selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsDailyNecessities record, @Param("example") OnlinemallGoodsDailyNecessitiesExample example);

    int updateByExample(@Param("record") OnlinemallGoodsDailyNecessities record, @Param("example") OnlinemallGoodsDailyNecessitiesExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsDailyNecessities record);

    int updateByPrimaryKey(OnlinemallGoodsDailyNecessities record);
}