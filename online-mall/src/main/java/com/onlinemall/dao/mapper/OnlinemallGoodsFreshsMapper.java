package com.onlinemall.dao.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.onlinemall.dao.model.OnlinemallGoodsFreshs;
import com.onlinemall.dao.model.OnlinemallGoodsFreshsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlinemallGoodsFreshsMapper {
    int countByExample(OnlinemallGoodsFreshsExample example);

    int deleteByExample(OnlinemallGoodsFreshsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OnlinemallGoodsFreshs record);

    int insertSelective(OnlinemallGoodsFreshs record);

    List<OnlinemallGoodsFreshs> selectByExample(OnlinemallGoodsFreshsExample example, PageBounds rowBounds);

    List<OnlinemallGoodsFreshs> selectByExample(OnlinemallGoodsFreshsExample example);

    OnlinemallGoodsFreshs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OnlinemallGoodsFreshs record, @Param("example") OnlinemallGoodsFreshsExample example);

    int updateByExample(@Param("record") OnlinemallGoodsFreshs record, @Param("example") OnlinemallGoodsFreshsExample example);

    int updateByPrimaryKeySelective(OnlinemallGoodsFreshs record);

    int updateByPrimaryKey(OnlinemallGoodsFreshs record);
}