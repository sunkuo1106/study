package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.TeaCourse;
import com.kgc.study.bean.TeaCourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeaCourseMapper {
    int countByExample(TeaCourseExample example);

    int deleteByExample(TeaCourseExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(TeaCourse record);

    int insertSelective(TeaCourse record);

    List<TeaCourse> selectByExample(TeaCourseExample example);

    TeaCourse selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") TeaCourse record, @Param("example") TeaCourseExample example);

    int updateByExample(@Param("record") TeaCourse record, @Param("example") TeaCourseExample example);

    int updateByPrimaryKeySelective(TeaCourse record);

    int updateByPrimaryKey(TeaCourse record);
}