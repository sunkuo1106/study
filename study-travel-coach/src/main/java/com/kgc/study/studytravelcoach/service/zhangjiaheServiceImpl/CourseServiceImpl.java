package com.kgc.study.studytravelcoach.service.zhangjiaheServiceImpl;

import com.kgc.study.bean.Course;
import com.kgc.study.bean.CourseExample;

import com.kgc.study.service.zhangjiaheService.CourseService;
import com.kgc.study.studytravelcoach.mapper.CourseMapper;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Component
public class CourseServiceImpl implements CourseService {

    @Resource
    CourseMapper courseMapper;


    @Override
    public List<Course> select(String coursename) {

        CourseExample example1=new CourseExample();
        CourseExample.Criteria criteria = example1.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if(coursename!=null&&coursename.isEmpty()==false){
            criteria.andCourseNameLike("%"+coursename+"%");
        }
        List<Course> select = courseMapper.selectByExample(example1);
        return select;

    }

    @Override
    public int add(Course Course) {
        return courseMapper.insertSelective(Course);
    }

    @Override
    public int delete(ArrayList list) {
        return  courseMapper.updatedeletelist(list);
    }

    @Override
    public Course Courseupdcha(Long id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int Courseupdate(Course Course) {
        return courseMapper.updateByPrimaryKeySelective(Course);

    }


}
