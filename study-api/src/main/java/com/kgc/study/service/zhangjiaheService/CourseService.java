package com.kgc.study.service.zhangjiaheService;

import com.kgc.study.bean.Course;
import com.kgc.study.bean.CourseExample;
import java.util.ArrayList;
import java.util.List;

public interface CourseService {

    List<Course> select(String coursename);
    int add(Course Course);//添加课程表
    int delete(ArrayList list);//批量删除
    Course Courseupdcha(Long id);//修改查
    int Courseupdate(Course Course);//修改



}
