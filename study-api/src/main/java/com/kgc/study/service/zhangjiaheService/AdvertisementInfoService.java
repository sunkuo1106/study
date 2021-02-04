package com.kgc.study.service.zhangjiaheService;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;

import java.util.List;

public interface AdvertisementInfoService {
    List<AdvertisementInfo> selectad(String adName);//查询广告
    int updatedeletelist(String str);//批量删除广告 逻辑删除
    int updatedeleteID(Long adId);//删除单条广告 逻辑删除
    int insertbanner(AdvertisementInfo advertisementInfo);//添加广告
    AdvertisementInfo updatecha(Long adId);//修改广告进行查询
    int updatebanner(AdvertisementInfo advertisementInfo);//修改广告
    int updatesequence(AdvertisementInfo advertisementInfo);//设置广告显示等级

}
