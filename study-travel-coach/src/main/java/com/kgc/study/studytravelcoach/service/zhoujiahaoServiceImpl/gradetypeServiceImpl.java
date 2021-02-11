
package com.kgc.study.studytravelcoach.service.zhoujiahaoServiceImpl;

import com.kgc.study.bean.GradeType;
import com.kgc.study.bean.GradeTypeExample;
import com.kgc.study.service.zhoujiahaoService.gradetypeService;
import com.kgc.study.studytravelcoach.mapper.GradeTypeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class gradetypeServiceImpl implements gradetypeService {

    @Resource
    GradeTypeMapper gradeTypeMapper;
    @Override
    public List<GradeType> selectAll(Integer logicDelete) {
        GradeTypeExample example=new GradeTypeExample();
        example.createCriteria().andLogicDeleteEqualTo(logicDelete);
        return gradeTypeMapper.selectByExample(example);
    }

    @Override
    public void dodel(GradeType gradeType) {
        gradeType.setLogicDelete(1);
        gradeTypeMapper.updateByPrimaryKeySelective(gradeType);
    }

    @Override
    public int add(GradeType gradeType) {
        int i = gradeTypeMapper.insertSelective(gradeType);
        return i;
    }

    @Override
    public GradeType selectById(Long id) {
        return gradeTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int doupd(GradeType gradeType) {

        int i = gradeTypeMapper.updateByPrimaryKeySelective(gradeType);
        return i;
    }



}
