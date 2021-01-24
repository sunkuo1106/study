package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.GradeInfo;
import com.kgc.study.bean.GradeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeInfoMapper {
    int countByExample(GradeInfoExample example);

    int deleteByExample(GradeInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GradeInfo record);

    int insertSelective(GradeInfo record);

    List<GradeInfo> selectByExample(GradeInfoExample example);

    GradeInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByExample(@Param("record") GradeInfo record, @Param("example") GradeInfoExample example);

    int updateByPrimaryKeySelective(GradeInfo record);

    int updateByPrimaryKey(GradeInfo record);
}