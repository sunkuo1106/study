package com.kgc.study.service.zhoujiahaoService;

import com.kgc.study.bean.GradeType;

import java.util.List;

public interface gradetypeService {

    int add(GradeType gradeType);

    GradeType selectById(Long id);

    int doupd(GradeType gradeType);

    List<GradeType> selectAll(Integer logicDelete);

    void dodel(GradeType gradeType);
}
