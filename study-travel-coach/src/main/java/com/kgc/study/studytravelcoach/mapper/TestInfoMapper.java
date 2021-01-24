package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.TestInfo;
import com.kgc.study.bean.TestInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestInfoMapper {
    int countByExample(TestInfoExample example);

    int deleteByExample(TestInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TestInfo record);

    int insertSelective(TestInfo record);

    List<TestInfo> selectByExample(TestInfoExample example);

    TestInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TestInfo record, @Param("example") TestInfoExample example);

    int updateByExample(@Param("record") TestInfo record, @Param("example") TestInfoExample example);

    int updateByPrimaryKeySelective(TestInfo record);

    int updateByPrimaryKey(TestInfo record);
}