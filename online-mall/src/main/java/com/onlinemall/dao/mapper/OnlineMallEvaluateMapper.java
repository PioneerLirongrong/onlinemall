package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlineMallEvaluate;
import com.onlinemall.dao.model.OnlineMallEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineMallEvaluateMapper {
    int countByExample(OnlineMallEvaluateExample example);

    int deleteByExample(OnlineMallEvaluateExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlineMallEvaluate record);

    int insertSelective(OnlineMallEvaluate record);

    List<OnlineMallEvaluate> selectByExample(OnlineMallEvaluateExample example, PageBounds rowBounds);

    List<OnlineMallEvaluate> selectByExample(OnlineMallEvaluateExample example);

    OnlineMallEvaluate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlineMallEvaluate record, @Param("example") OnlineMallEvaluateExample example);

    int updateByExample(@Param("record") OnlineMallEvaluate record, @Param("example") OnlineMallEvaluateExample example);

    int updateByPrimaryKeySelective(OnlineMallEvaluate record);

    int updateByPrimaryKey(OnlineMallEvaluate record);
}