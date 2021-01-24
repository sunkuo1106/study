package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ClasstoinformInfo;
import com.kgc.study.bean.ClasstoinformInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClasstoinformInfoMapper {
    int countByExample(ClasstoinformInfoExample example);

    int deleteByExample(ClasstoinformInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClasstoinformInfo record);

    int insertSelective(ClasstoinformInfo record);

    List<ClasstoinformInfo> selectByExample(ClasstoinformInfoExample example);

    ClasstoinformInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClasstoinformInfo record, @Param("example") ClasstoinformInfoExample example);

    int updateByExample(@Param("record") ClasstoinformInfo record, @Param("example") ClasstoinformInfoExample example);

    int updateByPrimaryKeySelective(ClasstoinformInfo record);

    int updateByPrimaryKey(ClasstoinformInfo record);
}