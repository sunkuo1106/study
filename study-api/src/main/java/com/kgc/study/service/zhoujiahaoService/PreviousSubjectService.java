package com.kgc.study.service.zhoujiahaoService;

import com.kgc.study.bean.PastExamPaper;

import java.util.List;

public interface PreviousSubjectService {
    List<PastExamPaper> selectAll();

    void update(PastExamPaper pastExamPaper);

    PastExamPaper selectPEP(Integer id);
}
