package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserBank;
import com.onlinemall.dao.model.OnlinemallUserBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserBankMapper {
    int countByExample(OnlinemallUserBankExample example);

    int deleteByExample(OnlinemallUserBankExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserBank record);

    int insertSelective(OnlinemallUserBank record);

    List<OnlinemallUserBank> selectByExample(OnlinemallUserBankExample example, PageBounds rowBounds);

    List<OnlinemallUserBank> selectByExample(OnlinemallUserBankExample example);

    OnlinemallUserBank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserBank record, @Param("example") OnlinemallUserBankExample example);

    int updateByExample(@Param("record") OnlinemallUserBank record, @Param("example") OnlinemallUserBankExample example);

    int updateByPrimaryKeySelective(OnlinemallUserBank record);

    int updateByPrimaryKey(OnlinemallUserBank record);
}