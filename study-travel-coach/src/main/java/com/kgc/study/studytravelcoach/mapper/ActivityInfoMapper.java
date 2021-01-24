package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ActivityInfo;
import com.kgc.study.bean.ActivityInfoExample;
import com.kgc.study.bean.ActivityInfoWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityInfoMapper {
    int countByExample(ActivityInfoExample example);

    int deleteByExample(ActivityInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ActivityInfoWithBLOBs record);

    int insertSelective(ActivityInfoWithBLOBs record);

    List<ActivityInfoWithBLOBs> selectByExampleWithBLOBs(ActivityInfoExample example);

    List<ActivityInfo> selectByExample(ActivityInfoExample example);

    ActivityInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ActivityInfoWithBLOBs record, @Param("example") ActivityInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityInfoWithBLOBs record, @Param("example") ActivityInfoExample example);

    int updateByExample(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByPrimaryKeySelective(ActivityInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityInfoWithBLOBs record);

    int updateByPrimaryKey(ActivityInfo record);
}