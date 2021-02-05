package com.kgc.study.service.zhoujiahaoService;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.ClasstoinformInfo;
import com.kgc.study.bean.GradeInfo;
import com.kgc.study.bean.GradeType;

import java.util.Date;
import java.util.List;

public interface gradeService {
    List<GradeInfo> selectAll(String gradeName, Integer typeId,Integer adminId);

    List<GradeType> selectGradeType();

    List<AgencyAddress> selectAddress();

    void insert(GradeInfo gradeInfo);

    int update(GradeInfo gradeInfo);

    GradeInfo selectGrade(Integer gradeId);

    int updateList(String id);

    ClasstoinformInfo selectClasstoinformInfo(Integer gradeId,Integer adminId);

    GradeInfo selectGradeXinXi(Integer gradeId, Integer adminId);

    int update(ClasstoinformInfo classtoinformInfo);
}
