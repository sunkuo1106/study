package com.kgc.study.studytravelcoach.service.zhangjiaheServiceImpl;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;
import com.kgc.study.service.zhangjiaheService.AdvertisementInfoService;
import com.kgc.study.studytravelcoach.mapper.AdvertisementInfoMapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Component
@Service
public class AdvertisementInfoServiceImpl implements AdvertisementInfoService {
    @Resource
    AdvertisementInfoMapper advertisementInfoMapper;
    @Override
    public List<AdvertisementInfo> selectad(String adName) {
        //显示广告列表 逻辑删除显示为0的
        System.out.println(adName);
        AdvertisementInfoExample advertisementInfoExample=new AdvertisementInfoExample();
        advertisementInfoExample.setOrderByClause("ad_id desc");
        AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if (adName!=null&&adName.isEmpty()==false){
            criteria.andAdNameLike("%"+adName+"%");
        }
        return  advertisementInfoMapper.selectByExample(advertisementInfoExample);
    }

    @Override
    public int deletelist(String str) {
        ArrayList list=new ArrayList();
        String []idd=str.split(",");
        for(int i=0;i<idd.length;i++) {
            int num=Integer.parseInt(idd[i]);
            list.add(num);
        }
        int delete = advertisementInfoMapper.deletelist( list);
        return delete;
    }

}
