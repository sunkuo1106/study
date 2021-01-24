package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Learning;
import com.kgc.study.bean.LearningExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LearningMapper {
    int countByExample(LearningExample example);

    int deleteByExample(LearningExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Learning record);

    int insertSelective(Learning record);

    List<Learning> selectByExample(LearningExample example);

    Learning selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Learning record, @Param("example") LearningExample example);

    int updateByExample(@Param("record") Learning record, @Param("example") LearningExample example);

    int updateByPrimaryKeySelective(Learning record);

    int updateByPrimaryKey(Learning record);
}