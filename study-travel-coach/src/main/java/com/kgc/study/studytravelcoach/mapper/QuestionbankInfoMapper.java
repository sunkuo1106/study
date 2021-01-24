package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.QuestionbankInfo;
import com.kgc.study.bean.QuestionbankInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionbankInfoMapper {
    int countByExample(QuestionbankInfoExample example);

    int deleteByExample(QuestionbankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuestionbankInfo record);

    int insertSelective(QuestionbankInfo record);

    List<QuestionbankInfo> selectByExample(QuestionbankInfoExample example);

    QuestionbankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuestionbankInfo record, @Param("example") QuestionbankInfoExample example);

    int updateByExample(@Param("record") QuestionbankInfo record, @Param("example") QuestionbankInfoExample example);

    int updateByPrimaryKeySelective(QuestionbankInfo record);

    int updateByPrimaryKey(QuestionbankInfo record);
}