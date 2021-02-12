package com.kgc.study.studytravelcoach.service.zhangjiaheServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.Teacher;
import com.kgc.study.bean.TeacherExample;
import com.kgc.study.bean.VideoTable;
import com.kgc.study.bean.VideoTableExample;
import com.kgc.study.service.zhangjiaheService.VideoServicecx;
import com.kgc.study.studytravelcoach.mapper.TeacherMapper;
import com.kgc.study.studytravelcoach.mapper.VideoTableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class VideoServicecxImpl implements VideoServicecx {
    @Resource
    VideoTableMapper videoTableMapper;
    @Resource
    TeacherMapper teacherMapper;


    @Override
    public PageInfo<VideoTable> selectVideo(Integer logicDelete, Integer pageIndex, Integer pageSize, String videoTableName,Long chapterTableId) {
        VideoTableExample videoTableExample=new VideoTableExample();
        VideoTableExample.Criteria criteria = videoTableExample.createCriteria();
        criteria.andLogicDeleteEqualTo(logicDelete);
        criteria.andChapterTableIdEqualTo(chapterTableId);
        if(videoTableName!=null&&videoTableName.isEmpty()==false){
            criteria.andVideoTableNameLike("%"+videoTableName+"%");
        }
        PageHelper.orderBy("video_table_id desc");
        PageHelper.startPage(pageIndex,pageSize);
        List<VideoTable> videoTables = videoTableMapper.selectByExample(videoTableExample);
        for (VideoTable videoTable : videoTables) {
            TeacherExample example1=new TeacherExample();
            TeacherExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andLogicDeleteEqualTo(0);
            criteria1.andIdEqualTo(videoTable.getTeacherId());
            List<Teacher> teachers = teacherMapper.selectByExample(example1);
            for (Teacher teacher : teachers) {
                videoTable.setTchName(teacher.getTchName());
            }
        }
        PageInfo<VideoTable> videoTablePageInfo=new PageInfo<>(videoTables);
        return videoTablePageInfo;
    }

    @Override
    public int addVideo(VideoTable videoTable) {
        videoTable.setGmtCreate(new Date());
        videoTable.setGmtModified(new Date());
        videoTable.setLogicDelete(0);
        return videoTableMapper.insert(videoTable);
    }

    @Override
    public int logicDeleteVideo(VideoTable videoTable,Long videoTableId) {
        VideoTableExample videoTableExample=new VideoTableExample();
        VideoTableExample.Criteria criteria = videoTableExample.createCriteria();
        criteria.andVideoTableIdEqualTo(videoTableId);
        return videoTableMapper.updateByExampleSelective(videoTable,videoTableExample);
    }

    @Override
    public VideoTable selectVideoById(Long videoTableId) {
        return videoTableMapper.selectByPrimaryKey(videoTableId);
    }

    @Override
    public int updateVideo(VideoTable videoTable) {
        videoTable.setGmtModified(new Date());
        return videoTableMapper.updateByPrimaryKeySelective(videoTable);
    }

    @Override
    public List<Teacher> selectTeacher() {
        TeacherExample example=new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        return teacherMapper.selectByExample(example);
    }

}
