package com.kgc.study.service.zhangjiaheService;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;

import java.util.List;

public interface AdvertisementInfoService {
    List<AdvertisementInfo> selectad(String adName);//查询广告
    int deletelist(String str);//批量删除广告
}
