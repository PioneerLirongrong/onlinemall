package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUser;
import com.onlinemall.dao.model.OnlinemallUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserMapper {
    int countByExample(OnlinemallUserExample example);

    int deleteByExample(OnlinemallUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(OnlinemallUser record);

    int insertSelective(OnlinemallUser record);

    List<OnlinemallUser> selectByExample(OnlinemallUserExample example, PageBounds rowBounds);

    List<OnlinemallUser> selectByExample(OnlinemallUserExample example);

    OnlinemallUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") OnlinemallUser record, @Param("example") OnlinemallUserExample example);

    int updateByExample(@Param("record") OnlinemallUser record, @Param("example") OnlinemallUserExample example);

    int updateByPrimaryKeySelective(OnlinemallUser record);

    int updateByPrimaryKey(OnlinemallUser record);
}