package com.kgc.study.studytravelcoach.service.zhoujiahaoServiceImpl;

import com.kgc.study.bean.PastExamPaper;
import com.kgc.study.bean.PastExamPaperExample;
import com.kgc.study.service.zhoujiahaoService.PreviousSubjectService;
import com.kgc.study.studytravelcoach.mapper.PastExamPaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PreviousSubjectServiceImpl implements PreviousSubjectService {

    @Resource
    PastExamPaperMapper pastExamPaperMapper;

    @Override
    public List<PastExamPaper> selectAll() {
        PastExamPaperExample example=new PastExamPaperExample();
        PastExamPaperExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        return pastExamPaperMapper.selectByExample(example);
    }

    @Override
    public void update(PastExamPaper pastExamPaper) {
        pastExamPaperMapper.updateByPrimaryKeySelective(pastExamPaper);
    }

    @Override
    public PastExamPaper selectPEP(Integer id) {
        return pastExamPaperMapper.selectByPrimaryKey((long)id);
    }


}
