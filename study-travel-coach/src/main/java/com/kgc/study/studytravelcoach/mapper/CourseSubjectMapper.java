package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.CourseSubject;
import com.kgc.study.bean.CourseSubjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseSubjectMapper {
    int countByExample(CourseSubjectExample example);

    int deleteByExample(CourseSubjectExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(CourseSubject record);

    int insertSelective(CourseSubject record);

    List<CourseSubject> selectByExample(CourseSubjectExample example);

    CourseSubject selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") CourseSubject record, @Param("example") CourseSubjectExample example);

    int updateByExample(@Param("record") CourseSubject record, @Param("example") CourseSubjectExample example);

    int updateByPrimaryKeySelective(CourseSubject record);

    int updateByPrimaryKey(CourseSubject record);
}