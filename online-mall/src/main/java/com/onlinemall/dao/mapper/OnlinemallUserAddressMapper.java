package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserAddress;
import com.onlinemall.dao.model.OnlinemallUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserAddressMapper {
    int countByExample(OnlinemallUserAddressExample example);

    int deleteByExample(OnlinemallUserAddressExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserAddress record);

    int insertSelective(OnlinemallUserAddress record);

    List<OnlinemallUserAddress> selectByExample(OnlinemallUserAddressExample example, PageBounds rowBounds);

    List<OnlinemallUserAddress> selectByExample(OnlinemallUserAddressExample example);

    OnlinemallUserAddress selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserAddress record, @Param("example") OnlinemallUserAddressExample example);

    int updateByExample(@Param("record") OnlinemallUserAddress record, @Param("example") OnlinemallUserAddressExample example);

    int updateByPrimaryKeySelective(OnlinemallUserAddress record);

    int updateByPrimaryKey(OnlinemallUserAddress record);
}