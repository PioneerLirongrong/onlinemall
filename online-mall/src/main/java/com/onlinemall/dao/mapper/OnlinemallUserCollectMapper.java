package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserCollect;
import com.onlinemall.dao.model.OnlinemallUserCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserCollectMapper {
    int countByExample(OnlinemallUserCollectExample example);

    int deleteByExample(OnlinemallUserCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserCollect record);

    int insertSelective(OnlinemallUserCollect record);

    List<OnlinemallUserCollect> selectByExample(OnlinemallUserCollectExample example, PageBounds rowBounds);

    List<OnlinemallUserCollect> selectByExample(OnlinemallUserCollectExample example);

    OnlinemallUserCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserCollect record, @Param("example") OnlinemallUserCollectExample example);

    int updateByExample(@Param("record") OnlinemallUserCollect record, @Param("example") OnlinemallUserCollectExample example);

    int updateByPrimaryKeySelective(OnlinemallUserCollect record);

    int updateByPrimaryKey(OnlinemallUserCollect record);
}