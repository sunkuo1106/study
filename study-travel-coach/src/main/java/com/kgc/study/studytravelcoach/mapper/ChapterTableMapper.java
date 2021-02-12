package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ChapterTable;
import com.kgc.study.bean.ChapterTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChapterTableMapper {
    int countByExample(ChapterTableExample example);

    int deleteByExample(ChapterTableExample example);

    int deleteByPrimaryKey(Long chapterTableId);

    int insert(ChapterTable record);

    int insertSelective(ChapterTable record);

    List<ChapterTable> selectByExample(ChapterTableExample example);

    ChapterTable selectByPrimaryKey(Long chapterTableId);

    int updateByExampleSelective(@Param("record") ChapterTable record, @Param("example") ChapterTableExample example);

    int updateByExample(@Param("record") ChapterTable record, @Param("example") ChapterTableExample example);

    int updateByPrimaryKeySelective(ChapterTable record);

    int updateByPrimaryKey(ChapterTable record);
    //批量删除  逻辑删除
    int Chapterupdatedeletelist(List chapterTableId);
}