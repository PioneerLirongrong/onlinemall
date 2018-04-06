package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallAcquireAdvice;
import com.onlinemall.dao.model.OnlinemallAcquireAdviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallAcquireAdviceMapper {
    int countByExample(OnlinemallAcquireAdviceExample example);

    int deleteByExample(OnlinemallAcquireAdviceExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallAcquireAdvice record);

    int insertSelective(OnlinemallAcquireAdvice record);

    List<OnlinemallAcquireAdvice> selectByExample(OnlinemallAcquireAdviceExample example, PageBounds rowBounds);

    List<OnlinemallAcquireAdvice> selectByExample(OnlinemallAcquireAdviceExample example);

    OnlinemallAcquireAdvice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallAcquireAdvice record, @Param("example") OnlinemallAcquireAdviceExample example);

    int updateByExample(@Param("record") OnlinemallAcquireAdvice record, @Param("example") OnlinemallAcquireAdviceExample example);

    int updateByPrimaryKeySelective(OnlinemallAcquireAdvice record);

    int updateByPrimaryKey(OnlinemallAcquireAdvice record);
}