package com.kgc.study.studytravelcoach.service.lxlServiceImpl.jijunshuoService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.ActivityInfo;
import com.kgc.study.bean.ActivityInfoExample;
import com.kgc.study.service.lixiliangService.jijunshuoService.ActivityInfoService;
import com.kgc.study.studytravelcoach.mapper.ActivityInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {
    @Resource
    ActivityInfoMapper activityInfoMapper;

    @Override
    public PageInfo<ActivityInfo> selectAll(Date start, Date end, String acInfoTitle, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ActivityInfoExample example = new ActivityInfoExample();
        ActivityInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if (start != null && end != null) {
            criteria.andGmtCreateBetween(start, end);
        }
        if (acInfoTitle.isEmpty() == false && acInfoTitle.equals(null) == false) {
            criteria.andAcInfoTitleLike("%" + acInfoTitle + "%");
        }
        List<ActivityInfo> activityInfos = activityInfoMapper.selectByExample(example);
        PageInfo<ActivityInfo> pageInfo = new PageInfo<>(activityInfos);
        return pageInfo;
    }

    @Override
    public ActivityInfo selectById(Long id) {
        ActivityInfo activityInfo = activityInfoMapper.selectByPrimaryKey(id);
        return activityInfo;
    }

    @Override
    public int update(ActivityInfo activityInfo) {
        int i = activityInfoMapper.updateByPrimaryKeySelective(activityInfo);
        return i;
    }

    @Override
    public int insert(ActivityInfo activityInfo) {
        activityInfo.setLogicDelete(0);
        int insert = activityInfoMapper.insert(activityInfo);
        return insert;
    }

    @Override
    public int delete(ActivityInfo activityInfo) {
        int i = activityInfoMapper.updateByPrimaryKeySelective(activityInfo);
        return i;
    }

    @Override
    public int delactivityList(String gpId) {
        ArrayList arrayList = new ArrayList();
        String[] gpIds = gpId.split(",");
        for (int i = 0; i < gpIds.length; i++) {
            Long num = Long.parseLong(gpIds[i]);
            arrayList.add(num);
        }
        int i = activityInfoMapper.updateByLogicDeleteList(arrayList);
        return i;
    }
}
