package com.kgc.study.service.zhoujiahaoService;

import com.kgc.study.bean.TestInfo;

import java.util.List;

public interface TestService {
    List<TestInfo> selectAll(String testCourseTitle,Integer testType);

    int updateDelete(TestInfo testInfo);

    int updateList(String testIdList);

    TestInfo selectTestInfo(Integer testId);

    int insert(TestInfo testInfo);
}
