package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserRecord;
import com.onlinemall.dao.model.OnlinemallUserRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserRecordMapper {
    int countByExample(OnlinemallUserRecordExample example);

    int deleteByExample(OnlinemallUserRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserRecord record);

    int insertSelective(OnlinemallUserRecord record);

    List<OnlinemallUserRecord> selectByExample(OnlinemallUserRecordExample example, PageBounds rowBounds);

    List<OnlinemallUserRecord> selectByExample(OnlinemallUserRecordExample example);

    OnlinemallUserRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserRecord record, @Param("example") OnlinemallUserRecordExample example);

    int updateByExample(@Param("record") OnlinemallUserRecord record, @Param("example") OnlinemallUserRecordExample example);

    int updateByPrimaryKeySelective(OnlinemallUserRecord record);

    int updateByPrimaryKey(OnlinemallUserRecord record);
}