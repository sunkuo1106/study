package com.kgc.study.service.zhoujiahaoService;

import com.kgc.study.bean.RecordInfo;
import com.kgc.study.bean.TestInfo;

import java.util.List;

public interface RecordService {
    List<RecordInfo> selectAll(Integer score);

    int updateDelete(RecordInfo recordInfo);

    int updateList(String recordIdList);

    RecordInfo selectRecordAll(Integer recordid);

    void insert(RecordInfo recordInfo);
}
