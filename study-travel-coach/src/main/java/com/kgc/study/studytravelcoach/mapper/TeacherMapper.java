package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Teacher;
import com.kgc.study.bean.TeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Long teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExampleWithBLOBs(TeacherExample example);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Long teacherId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExampleWithBLOBs(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKeyWithBLOBs(Teacher record);

    int updateByPrimaryKey(Teacher record);
}