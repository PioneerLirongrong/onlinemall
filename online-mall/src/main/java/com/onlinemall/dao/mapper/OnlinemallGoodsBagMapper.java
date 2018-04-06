package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsBag;
import com.onlinemall.dao.model.OnlinemallGoodsBagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsBagMapper {
    int countByExample(OnlinemallGoodsBagExample example);

    int deleteByExample(OnlinemallGoodsBagExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsBag record);

    int insertSelective(OnlinemallGoodsBag record);

    List<OnlinemallGoodsBag> selectByExample(OnlinemallGoodsBagExample example, PageBounds rowBounds);

    List<OnlinemallGoodsBag> selectByExample(OnlinemallGoodsBagExample example);

    OnlinemallGoodsBag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsBag record, @Param("example") OnlinemallGoodsBagExample example);

    int updateByExample(@Param("record") OnlinemallGoodsBag record, @Param("example") OnlinemallGoodsBagExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsBag record);

    int updateByPrimaryKey(OnlinemallGoodsBag record);
}