package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.ChapterTable;
import com.kgc.study.bean.ChapterTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChapterTableMapper {
    int countByExample(ChapterTableExample example);

    int deleteByExample(ChapterTableExample example);

    int deleteByPrimaryKey(Integer chapterTableId);

    int insert(ChapterTable record);

    int insertSelective(ChapterTable record);

    List<ChapterTable> selectByExample(ChapterTableExample example);

    ChapterTable selectByPrimaryKey(Integer chapterTableId);

    int updateByExampleSelective(@Param("record") ChapterTable record, @Param("example") ChapterTableExample example);

    int updateByExample(@Param("record") ChapterTable record, @Param("example") ChapterTableExample example);

    int updateByPrimaryKeySelective(ChapterTable record);

    int updateByPrimaryKey(ChapterTable record);
}