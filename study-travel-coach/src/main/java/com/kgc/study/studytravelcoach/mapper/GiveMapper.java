package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Give;
import com.kgc.study.bean.GiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiveMapper {
    int countByExample(GiveExample example);

    int deleteByExample(GiveExample example);

    int deleteByPrimaryKey(Long giveId);

    int insert(Give record);

    int insertSelective(Give record);

    List<Give> selectByExample(GiveExample example);

    Give selectByPrimaryKey(Long giveId);

    int updateByExampleSelective(@Param("record") Give record, @Param("example") GiveExample example);

    int updateByExample(@Param("record") Give record, @Param("example") GiveExample example);

    int updateByPrimaryKeySelective(Give record);

    int updateByPrimaryKey(Give record);
}