package com.kgc.study.service.zhangjiaheService;

import com.kgc.study.bean.ChapterTable;
import com.kgc.study.bean.ChapterTableExample;

import java.awt.print.Book;
import java.util.List;

public interface ChapterTableService {
    //根据课程id查询章节
    List<ChapterTable> selectChapterTable(String chapterName,Long courseId);
    //添加章节
    int ChapterTableInsert(ChapterTable record);
    //单条删除章节 逻辑删除
    int ChapterTableupdatedeleteID(Long chapterTableId);
//批量删除 逻辑删除
    int Chapterupdatedeletelist(String str);
    //修改查询
    ChapterTable chapterupdatecha(Long chapterTableId);
    //修改章节
    int ChapterTableupdate(ChapterTable chapterTable);
}
