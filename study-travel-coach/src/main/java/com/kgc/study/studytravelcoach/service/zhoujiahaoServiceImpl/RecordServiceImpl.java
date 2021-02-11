package com.kgc.study.studytravelcoach.service.zhoujiahaoServiceImpl;

import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.RecordInfo;
import com.kgc.study.bean.RecordInfoExample;
import com.kgc.study.service.zhoujiahaoService.RecordService;
import com.kgc.study.studytravelcoach.mapper.EduUserMapper;
import com.kgc.study.studytravelcoach.mapper.RecordInfoMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class RecordServiceImpl implements RecordService {

    @Resource
    RecordInfoMapper recordInfoMapper;
    @Resource
    EduUserMapper eduUserMapper;

    @Override
    public List<RecordInfo> selectAll(Integer score) {
        RecordInfoExample example=new RecordInfoExample();
        RecordInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if(score!=null){
            criteria.andRecordTestScoreEqualTo(score);
        }
        List<RecordInfo> recordInfos = recordInfoMapper.selectByExample(example);
        for (RecordInfo recordInfo : recordInfos) {
            Integer userId = recordInfo.getUserId();
            EduUser eduUser = eduUserMapper.selectByPrimaryKey(userId);
            recordInfo.setUser(eduUser);
        }
        return recordInfos;
    }

    @Override
    public int updateDelete(RecordInfo recordInfo) {
        recordInfo.setGmtModified(new Date());
        return recordInfoMapper.updateByPrimaryKeySelective(recordInfo);
    }

    @Override
    public int updateList(String recordIdList) {
        List list=new ArrayList();
        String[] split = recordIdList.split(",");
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }
        return recordInfoMapper.updateList(list);
    }

    @Override
    public RecordInfo selectRecordAll(Integer recordid) {
        RecordInfo recordInfo = recordInfoMapper.selectByPrimaryKey((long) recordid);
        EduUser eduUser = eduUserMapper.selectByPrimaryKey(recordInfo.getUserId());
        recordInfo.setUser(eduUser);
        return recordInfo;
    }

    @Override
    public void insert(RecordInfo recordInfo) {
        recordInfoMapper.insertSelective(recordInfo);
    }
}
