package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Answer;
import com.kgc.study.bean.AnswerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnswerMapper {
    int countByExample(AnswerExample example);

    int deleteByExample(AnswerExample example);

    int deleteByPrimaryKey(Long answerId);

    int insert(Answer record);

    int insertSelective(Answer record);

    List<Answer> selectByExampleWithBLOBs(AnswerExample example);

    List<Answer> selectByExample(AnswerExample example);

    Answer selectByPrimaryKey(Long answerId);

    int updateByExampleSelective(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKeyWithBLOBs(Answer record);

    int updateByPrimaryKey(Answer record);
}