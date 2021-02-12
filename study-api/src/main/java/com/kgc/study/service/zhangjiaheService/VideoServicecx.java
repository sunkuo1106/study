package com.kgc.study.service.zhangjiaheService;

import com.kgc.study.bean.Teacher;
import com.kgc.study.bean.TeacherExample;
import com.kgc.study.bean.VideoTable;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface VideoServicecx {
    //查询视频 查询logic_delete字段为 "0" 的
    PageInfo<VideoTable> selectVideo(Integer logicDelete, Integer pageIndex, Integer pageSize, String videoTableName,Long chapterTableId);

    //添加视频
    int addVideo(VideoTable videoTable);

    //删除视频 逻辑删除,修改logic_delete字段为 "1"
    int logicDeleteVideo(VideoTable videoTable, Long videoTableId);

    //根据id查询视频对象
    VideoTable selectVideoById(Long videoTableId);

    //修改视频
    int updateVideo(VideoTable videoTable);

    //查询老师
    List<Teacher> selectTeacher();


}
