package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ExamInfo;
import com.kgc.study.bean.ExamInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamInfoMapper {
    int countByExample(ExamInfoExample example);

    int deleteByExample(ExamInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExamInfo record);

    int insertSelective(ExamInfo record);

    List<ExamInfo> selectByExample(ExamInfoExample example);

    ExamInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByExample(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByPrimaryKeySelective(ExamInfo record);

    int updateByPrimaryKey(ExamInfo record);
}