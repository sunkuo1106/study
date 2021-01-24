package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ActivityType;
import com.kgc.study.bean.ActivityTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityTypeMapper {
    int countByExample(ActivityTypeExample example);

    int deleteByExample(ActivityTypeExample example);

    int insert(ActivityType record);

    int insertSelective(ActivityType record);

    List<ActivityType> selectByExample(ActivityTypeExample example);

    int updateByExampleSelective(@Param("record") ActivityType record, @Param("example") ActivityTypeExample example);

    int updateByExample(@Param("record") ActivityType record, @Param("example") ActivityTypeExample example);
}