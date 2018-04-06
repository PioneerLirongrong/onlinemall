package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserBalance;
import com.onlinemall.dao.model.OnlinemallUserBalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserBalanceMapper {
    int countByExample(OnlinemallUserBalanceExample example);

    int deleteByExample(OnlinemallUserBalanceExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserBalance record);

    int insertSelective(OnlinemallUserBalance record);

    List<OnlinemallUserBalance> selectByExample(OnlinemallUserBalanceExample example, PageBounds rowBounds);

    List<OnlinemallUserBalance> selectByExample(OnlinemallUserBalanceExample example);

    OnlinemallUserBalance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserBalance record, @Param("example") OnlinemallUserBalanceExample example);

    int updateByExample(@Param("record") OnlinemallUserBalance record, @Param("example") OnlinemallUserBalanceExample example);

    int updateByPrimaryKeySelective(OnlinemallUserBalance record);

    int updateByPrimaryKey(OnlinemallUserBalance record);
}