package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Agency;
import com.kgc.study.bean.AgencyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgencyMapper {
    int countByExample(AgencyExample example);

    int deleteByExample(AgencyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Agency record);

    int insertSelective(Agency record);

    List<Agency> selectByExample(AgencyExample example);

    Agency selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByExample(@Param("record") Agency record, @Param("example") AgencyExample example);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}