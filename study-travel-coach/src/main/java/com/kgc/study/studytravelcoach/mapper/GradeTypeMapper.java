package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.GradeType;
import com.kgc.study.bean.GradeTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeTypeMapper {
    int countByExample(GradeTypeExample example);

    int deleteByExample(GradeTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GradeType record);

    int insertSelective(GradeType record);

    List<GradeType> selectByExample(GradeTypeExample example);

    GradeType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GradeType record, @Param("example") GradeTypeExample example);

    int updateByExample(@Param("record") GradeType record, @Param("example") GradeTypeExample example);

    int updateByPrimaryKeySelective(GradeType record);

    int updateByPrimaryKey(GradeType record);
}