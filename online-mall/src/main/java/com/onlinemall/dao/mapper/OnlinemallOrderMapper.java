package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallOrder;
import com.onlinemall.dao.model.OnlinemallOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallOrderMapper {
    int countByExample(OnlinemallOrderExample example);

    int deleteByExample(OnlinemallOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallOrder record);

    int insertSelective(OnlinemallOrder record);

    List<OnlinemallOrder> selectByExample(OnlinemallOrderExample example, PageBounds rowBounds);

    List<OnlinemallOrder> selectByExample(OnlinemallOrderExample example);

    OnlinemallOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallOrder record, @Param("example") OnlinemallOrderExample example);

    int updateByExample(@Param("record") OnlinemallOrder record, @Param("example") OnlinemallOrderExample example);

    int updateByPrimaryKeySelective(OnlinemallOrder record);

    int updateByPrimaryKey(OnlinemallOrder record);
}