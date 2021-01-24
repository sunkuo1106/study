package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.CurriculumsTable;
import com.kgc.study.bean.CurriculumsTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CurriculumsTableMapper {
    int countByExample(CurriculumsTableExample example);

    int deleteByExample(CurriculumsTableExample example);

    int insert(CurriculumsTable record);

    int insertSelective(CurriculumsTable record);

    List<CurriculumsTable> selectByExample(CurriculumsTableExample example);

    int updateByExampleSelective(@Param("record") CurriculumsTable record, @Param("example") CurriculumsTableExample example);

    int updateByExample(@Param("record") CurriculumsTable record, @Param("example") CurriculumsTableExample example);
}