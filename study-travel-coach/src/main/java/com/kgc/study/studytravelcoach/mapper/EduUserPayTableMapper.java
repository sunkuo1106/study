package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.EduUserPayTable;
import com.kgc.study.bean.EduUserPayTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduUserPayTableMapper {
    int countByExample(EduUserPayTableExample example);

    int deleteByExample(EduUserPayTableExample example);

    int insert(EduUserPayTable record);

    int insertSelective(EduUserPayTable record);

    List<EduUserPayTable> selectByExample(EduUserPayTableExample example);

    int updateByExampleSelective(@Param("record") EduUserPayTable record, @Param("example") EduUserPayTableExample example);

    int updateByExample(@Param("record") EduUserPayTable record, @Param("example") EduUserPayTableExample example);
}