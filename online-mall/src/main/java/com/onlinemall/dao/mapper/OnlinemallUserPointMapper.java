package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserPoint;
import com.onlinemall.dao.model.OnlinemallUserPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserPointMapper {
    int countByExample(OnlinemallUserPointExample example);

    int deleteByExample(OnlinemallUserPointExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserPoint record);

    int insertSelective(OnlinemallUserPoint record);

    List<OnlinemallUserPoint> selectByExample(OnlinemallUserPointExample example, PageBounds rowBounds);

    List<OnlinemallUserPoint> selectByExample(OnlinemallUserPointExample example);

    OnlinemallUserPoint selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserPoint record, @Param("example") OnlinemallUserPointExample example);

    int updateByExample(@Param("record") OnlinemallUserPoint record, @Param("example") OnlinemallUserPointExample example);

    int updateByPrimaryKeySelective(OnlinemallUserPoint record);

    int updateByPrimaryKey(OnlinemallUserPoint record);
}