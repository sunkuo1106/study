package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.RecordInfo;
import com.kgc.study.bean.RecordInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordInfoMapper {
    int countByExample(RecordInfoExample example);

    int deleteByExample(RecordInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RecordInfo record);

    int insertSelective(RecordInfo record);

    List<RecordInfo> selectByExample(RecordInfoExample example);

    RecordInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RecordInfo record, @Param("example") RecordInfoExample example);

    int updateByExample(@Param("record") RecordInfo record, @Param("example") RecordInfoExample example);

    int updateByPrimaryKeySelective(RecordInfo record);

    int updateByPrimaryKey(RecordInfo record);
}