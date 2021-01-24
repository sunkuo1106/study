package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdClickRecord;
import com.kgc.study.bean.AdClickRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdClickRecordMapper {
    int countByExample(AdClickRecordExample example);

    int deleteByExample(AdClickRecordExample example);

    int deleteByPrimaryKey(Long adClickId);

    int insert(AdClickRecord record);

    int insertSelective(AdClickRecord record);

    List<AdClickRecord> selectByExample(AdClickRecordExample example);

    AdClickRecord selectByPrimaryKey(Long adClickId);

    int updateByExampleSelective(@Param("record") AdClickRecord record, @Param("example") AdClickRecordExample example);

    int updateByExample(@Param("record") AdClickRecord record, @Param("example") AdClickRecordExample example);

    int updateByPrimaryKeySelective(AdClickRecord record);

    int updateByPrimaryKey(AdClickRecord record);
}