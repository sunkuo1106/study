package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.PolicyInfo;
import com.kgc.study.bean.PolicyInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PolicyInfoMapper {
    int countByExample(PolicyInfoExample example);

    int deleteByExample(PolicyInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PolicyInfo record);

    int insertSelective(PolicyInfo record);

    List<PolicyInfo> selectByExampleWithBLOBs(PolicyInfoExample example);

    List<PolicyInfo> selectByExample(PolicyInfoExample example);

    PolicyInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PolicyInfo record, @Param("example") PolicyInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PolicyInfo record, @Param("example") PolicyInfoExample example);

    int updateByExample(@Param("record") PolicyInfo record, @Param("example") PolicyInfoExample example);

    int updateByPrimaryKeySelective(PolicyInfo record);

    int updateByPrimaryKeyWithBLOBs(PolicyInfo record);

    int updateByPrimaryKey(PolicyInfo record);

}