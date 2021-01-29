package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AgencyAddressMapper {
    int countByExample(AgencyAddressExample example);

    int deleteByExample(AgencyAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AgencyAddress record);

    int insertSelective(AgencyAddress record);

    List<AgencyAddress> selectByExample(AgencyAddressExample example);

    AgencyAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AgencyAddress record, @Param("example") AgencyAddressExample example);

    int updateByExample(@Param("record") AgencyAddress record, @Param("example") AgencyAddressExample example);

    int updateByPrimaryKeySelective(AgencyAddress record);

    int updateByPrimaryKey(AgencyAddress record);
}