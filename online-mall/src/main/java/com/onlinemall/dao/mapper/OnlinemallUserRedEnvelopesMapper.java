package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallUserRedEnvelopes;
import com.onlinemall.dao.model.OnlinemallUserRedEnvelopesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallUserRedEnvelopesMapper {
    int countByExample(OnlinemallUserRedEnvelopesExample example);

    int deleteByExample(OnlinemallUserRedEnvelopesExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallUserRedEnvelopes record);

    int insertSelective(OnlinemallUserRedEnvelopes record);

    List<OnlinemallUserRedEnvelopes> selectByExample(OnlinemallUserRedEnvelopesExample example, PageBounds rowBounds);

    List<OnlinemallUserRedEnvelopes> selectByExample(OnlinemallUserRedEnvelopesExample example);

    OnlinemallUserRedEnvelopes selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallUserRedEnvelopes record, @Param("example") OnlinemallUserRedEnvelopesExample example);

    int updateByExample(@Param("record") OnlinemallUserRedEnvelopes record, @Param("example") OnlinemallUserRedEnvelopesExample example);

    int updateByPrimaryKeySelective(OnlinemallUserRedEnvelopes record);

    int updateByPrimaryKey(OnlinemallUserRedEnvelopes record);
}