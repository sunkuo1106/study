package com.kgc.study.service.lixiliangService.jijunshuoService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.ActivityInfo;

import java.util.Date;
import java.util.List;

public interface ActivityInfoService {
    //查询全部
    PageInfo<ActivityInfo> selectAll(Date start, Date end, String acInfoTitle, Integer pageNum, Integer pageSize);

    //根据id查询
    ActivityInfo selectById(Long id);


    //修改
    int update(ActivityInfo activityInfo);


    //添加
    int insert(ActivityInfo activityInfo);

    //假删除
    int delete(ActivityInfo activityInfo);


    int delactivityList(String gpId);
}
