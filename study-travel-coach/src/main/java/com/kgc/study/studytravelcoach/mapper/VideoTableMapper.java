package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.VideoTable;
import com.kgc.study.bean.VideoTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoTableMapper {
    int countByExample(VideoTableExample example);

    int deleteByExample(VideoTableExample example);

    int deleteByPrimaryKey(Long videoTableId);

    int insert(VideoTable record);

    int insertSelective(VideoTable record);

    List<VideoTable> selectByExample(VideoTableExample example);

    VideoTable selectByPrimaryKey(Long videoTableId);

    int updateByExampleSelective(@Param("record") VideoTable record, @Param("example") VideoTableExample example);

    int updateByExample(@Param("record") VideoTable record, @Param("example") VideoTableExample example);

    int updateByPrimaryKeySelective(VideoTable record);

    int updateByPrimaryKey(VideoTable record);
}