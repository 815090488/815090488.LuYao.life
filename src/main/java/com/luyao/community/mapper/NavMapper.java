package com.luyao.community.mapper;

import com.luyao.community.model.Nav;
import com.luyao.community.model.NavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NavMapper {
    long countByExample(NavExample example);

    int deleteByExample(NavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nav record);

    int insertSelective(Nav record);

    List<Nav> selectByExampleWithRowbounds(NavExample example, RowBounds rowBounds);

    List<Nav> selectByExample(NavExample example);

    Nav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByExample(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByPrimaryKeySelective(Nav record);

    int updateByPrimaryKey(Nav record);
}