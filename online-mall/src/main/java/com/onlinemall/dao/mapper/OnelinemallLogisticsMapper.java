package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnelinemallLogistics;
import com.onlinemall.dao.model.OnelinemallLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnelinemallLogisticsMapper {
    int countByExample(OnelinemallLogisticsExample example);

    int deleteByExample(OnelinemallLogisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnelinemallLogistics record);

    int insertSelective(OnelinemallLogistics record);

    List<OnelinemallLogistics> selectByExample(OnelinemallLogisticsExample example, PageBounds rowBounds);

    List<OnelinemallLogistics> selectByExample(OnelinemallLogisticsExample example);

    OnelinemallLogistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnelinemallLogistics record, @Param("example") OnelinemallLogisticsExample example);

    int updateByExample(@Param("record") OnelinemallLogistics record, @Param("example") OnelinemallLogisticsExample example);

    int updateByPrimaryKeySelective(OnelinemallLogistics record);

    int updateByPrimaryKey(OnelinemallLogistics record);
}