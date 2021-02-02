package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.PastExamPaper;
import com.kgc.study.bean.PastExamPaperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PastExamPaperMapper {
    int countByExample(PastExamPaperExample example);

    int deleteByExample(PastExamPaperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PastExamPaper record);

    int insertSelective(PastExamPaper record);

    List<PastExamPaper> selectByExample(PastExamPaperExample example);

    PastExamPaper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PastExamPaper record, @Param("example") PastExamPaperExample example);

    int updateByExample(@Param("record") PastExamPaper record, @Param("example") PastExamPaperExample example);

    int updateByPrimaryKeySelective(PastExamPaper record);

    int updateByPrimaryKey(PastExamPaper record);
}