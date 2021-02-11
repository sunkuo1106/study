package com.kgc.study.studytravelcoach.service.zhoujiahaoServiceImpl;

import com.kgc.study.bean.TestInfo;
import com.kgc.study.bean.TestInfoExample;
import com.kgc.study.service.zhoujiahaoService.TestService;
import com.kgc.study.studytravelcoach.mapper.TestInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    TestInfoMapper testInfoMapper;

    @Override
    public List<TestInfo> selectAll(String testCourseTitle,Integer testType) {
        TestInfoExample example=new TestInfoExample();
        TestInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if(testCourseTitle!=null && testCourseTitle!=""){
            criteria.andTestCourseTitleLike("%"+testCourseTitle+"%");
        }
        if(testType!=null && testType!=0){
            criteria.andTestTypeEqualTo(testType);
        }
        return testInfoMapper.selectByExample(example);
    }

    @Override
    public int updateDelete(TestInfo testInfo) {
        testInfo.setGmtModified(new Date());
        return testInfoMapper.updateByPrimaryKeySelective(testInfo);
    }

    @Override
    public int updateList(String testIdList) {
        List list=new ArrayList();
        String[] split = testIdList.split(",");
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }
        return testInfoMapper.updateList(list);
    }

    @Override
    public TestInfo selectTestInfo(Integer testId) {
        return testInfoMapper.selectByPrimaryKey((long)testId);
    }

    @Override
    public int insert(TestInfo testInfo) {
        testInfo.setGmtCreate(new Date());
        testInfo.setGmtModified(new Date());
        testInfo.setLogicDelete(0);
        return testInfoMapper.insertSelective(testInfo);
    }
}
