package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdvertisementClickRecord;
import com.kgc.study.bean.AdvertisementClickRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertisementClickRecordMapper {
    int countByExample(AdvertisementClickRecordExample example);

    int deleteByExample(AdvertisementClickRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdvertisementClickRecord record);

    int insertSelective(AdvertisementClickRecord record);

    List<AdvertisementClickRecord> selectByExample(AdvertisementClickRecordExample example);

    AdvertisementClickRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdvertisementClickRecord record, @Param("example") AdvertisementClickRecordExample example);

    int updateByExample(@Param("record") AdvertisementClickRecord record, @Param("example") AdvertisementClickRecordExample example);

    int updateByPrimaryKeySelective(AdvertisementClickRecord record);

    int updateByPrimaryKey(AdvertisementClickRecord record);
}