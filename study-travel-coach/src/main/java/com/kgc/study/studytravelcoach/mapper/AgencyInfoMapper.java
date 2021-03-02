package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.bean.AgencyInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AgencyInfoMapper {
    int countByExample(AgencyInfoExample example);

    int deleteByExample(AgencyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AgencyInfo record);

    int insertSelective(AgencyInfo record);

    List<AgencyInfo> selectByExample(AgencyInfoExample example);

    AgencyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AgencyInfo record, @Param("example") AgencyInfoExample example);

    int updateByExample(@Param("record") AgencyInfo record, @Param("example") AgencyInfoExample example);

    int updateByPrimaryKeySelective(AgencyInfo record);

    int updateByPrimaryKey(AgencyInfo record);

    int deleteAll(@Param("ids") Integer[] ids,@Param("modifieddate") Date modifieddate);
    List<AgencyInfo> selectByExample2(AgencyInfoExample example);

    List<AgencyInfo> selectByExample3(AgencyInfoExample example);
}