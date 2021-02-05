package com.kgc.study.studytravelcoach.service.zhangjiaheServiceImpl;

import com.kgc.study.bean.AdvertisementInfo;
import com.kgc.study.bean.AdvertisementInfoExample;
import com.kgc.study.service.zhangjiaheService.AdvertisementInfoService;
import com.kgc.study.studytravelcoach.mapper.AdvertisementInfoMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
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
        advertisementInfoExample.setOrderByClause("ad_sequence asc");
        AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if (adName!=null&&adName.isEmpty()==false){
            criteria.andAdNameLike("%"+adName+"%");
        }
        return  advertisementInfoMapper.selectByExample(advertisementInfoExample);
    }

    @Override
    public int updatedeletelist(String str) {
        ArrayList list=new ArrayList();
        String []idd=str.split(",");
        for(int i=0;i<idd.length;i++) {
            Long num=Long.parseLong(idd[i]);
            //删除后自动排序
            AdvertisementInfoExample advertisementInfoExample=new AdvertisementInfoExample();
            AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
            criteria.andLogicDeleteEqualTo(0);
            criteria.andAdSequenceIsNotNull();
            List<AdvertisementInfo> advertisementInfos = advertisementInfoMapper.selectByExample(advertisementInfoExample);
            AdvertisementInfo advertisementInfo2 = advertisementInfoMapper.selectByPrimaryKey(num);
            for (AdvertisementInfo info : advertisementInfos) {
                if (info.getAdSequence()>=advertisementInfo2.getAdSequence()){
                    AdvertisementInfo advertisementInfo1=new AdvertisementInfo();
                    advertisementInfo1.setAdId(info.getAdId());
                    advertisementInfo1.setAdSequence(info.getAdSequence()-1);
                    advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo1);
                }

            }
            list.add(num);

        }
        int delete = advertisementInfoMapper.updatedeletelist( list);
        return delete;
    }

    @Override
    public int updatedeleteID(Long adId) {
        AdvertisementInfo advertisementInfo=new AdvertisementInfo();
        advertisementInfo.setAdId(adId);
        advertisementInfo.setLogicDelete(1);

        //删除后自动排序
        AdvertisementInfoExample advertisementInfoExample=new AdvertisementInfoExample();
        AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        criteria.andAdSequenceIsNotNull();
        List<AdvertisementInfo> advertisementInfos = advertisementInfoMapper.selectByExample(advertisementInfoExample);
        AdvertisementInfo advertisementInfo2 = advertisementInfoMapper.selectByPrimaryKey(adId);

        for (AdvertisementInfo info : advertisementInfos) {
            if (info.getAdSequence()>=advertisementInfo2.getAdSequence()){

                AdvertisementInfo advertisementInfo1=new AdvertisementInfo();
                advertisementInfo1.setAdId(info.getAdId());
                advertisementInfo1.setAdSequence(info.getAdSequence()-1);
                advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo1);
            }

        }
        advertisementInfo.setAdSequence(advertisementInfo2.getAdSequence());
        return advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo);
    }

    @Override
    public int insertbanner(AdvertisementInfo advertisementInfo) {
        advertisementInfo.setLogicDelete(0);
        advertisementInfo.setAdGmtCreate(new Date());
        advertisementInfo.setAdGmtModified(new Date());
        int maxadSequence = advertisementInfoMapper.maxadSequence();
        System.out.println(maxadSequence);
        if (maxadSequence<4) {
            advertisementInfo.setAdSequence(maxadSequence + 1);
        }else {
            advertisementInfo.setAdSequence(null);
        }
        return advertisementInfoMapper.insertSelective(advertisementInfo);
    }

    @Override
    public AdvertisementInfo updatecha(Long adId) {
        return advertisementInfoMapper.selectByPrimaryKey(adId);
    }

    @Override
    public int updatebanner(AdvertisementInfo advertisementInfo) {
        Integer adSequence = advertisementInfo.getAdSequence();
        //删除后自动排序
        AdvertisementInfoExample advertisementInfoExample = new AdvertisementInfoExample();
        AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        criteria.andAdSequenceIsNotNull();
        List<AdvertisementInfo> advertisementInfos = advertisementInfoMapper.selectByExample(advertisementInfoExample);
        AdvertisementInfo advertisementInfo2 = advertisementInfoMapper.selectByPrimaryKey(advertisementInfo.getAdId());
        //如果等级相同
        if (advertisementInfo2.getAdSequence() == adSequence) {
            return advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo);
        }
        //小往大升
        else if (advertisementInfo2.getAdSequence() <=adSequence) {
            System.out.println("进入小往大升");
            List<AdvertisementInfo> smallbigsequence = advertisementInfoMapper.smallbigsequence(advertisementInfo2.getAdSequence());
            for (AdvertisementInfo info : smallbigsequence) {
                if (info.getAdSequence() <= adSequence) {
                    System.out.println("进入小往大升:" + info.getAdSequence());
                    System.out.println(info.getAdName());
                    AdvertisementInfo advertisementInfo3 = new AdvertisementInfo();
                    advertisementInfo3.setAdId(info.getAdId());
                    advertisementInfo3.setAdSequence(info.getAdSequence() - 1);
                    advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo3);
                }
            }


        }
        //大往小升
        else if (advertisementInfo2.getAdSequence() >= adSequence) {
            System.out.println("大往小升");
            List<AdvertisementInfo> smallbigsequence = advertisementInfoMapper.bigsmallsequence(advertisementInfo2.getAdSequence());
            for (AdvertisementInfo info : smallbigsequence) {
                if (info.getAdSequence() >= adSequence) {
                    AdvertisementInfo advertisementInfo1 = new AdvertisementInfo();
                    advertisementInfo1.setAdId(info.getAdId());
                    advertisementInfo1.setAdSequence(info.getAdSequence() + 1);
                    advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo1);

                }
            }


        }
        advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo);
        AdvertisementInfoExample advertisementInfoExample2 = new AdvertisementInfoExample();
        AdvertisementInfoExample.Criteria criteria2 = advertisementInfoExample2.createCriteria();
        criteria2.andLogicDeleteEqualTo(0);
        criteria2.andAdSequenceIsNotNull();
        List<AdvertisementInfo> advertisementInfos2 = advertisementInfoMapper.selectByExample(advertisementInfoExample2);
        for (AdvertisementInfo info : advertisementInfos2) {
            System.out.println("进入循环");
            AdvertisementInfoExample advertisementInfoExample3 = new AdvertisementInfoExample();
            AdvertisementInfoExample.Criteria criteria3 = advertisementInfoExample3.createCriteria();
            criteria3.andLogicDeleteEqualTo(0);
            criteria3.andAdSequenceIsNotNull();
            criteria3.andAdSequenceEqualTo(info.getAdSequence());
            List<AdvertisementInfo> advertisementInfos3 = advertisementInfoMapper.selectByExample(advertisementInfoExample3);
            if (advertisementInfos3.size() >= 2) {
                Long maxid = null;
                System.out.println("进入判断");
                for (AdvertisementInfo advertisementInfo1 : advertisementInfos3) {
                    Long adId = advertisementInfo1.getAdId();
                    System.out.println("adId"+adId);
                    maxid=advertisementInfo1.getAdId();
                    System.out.println("获取id"+maxid);
                }
                AdvertisementInfo advertisementInfo3 = advertisementInfoMapper.selectByPrimaryKey(maxid);
                AdvertisementInfo advertisementInfo4 = new AdvertisementInfo();
                advertisementInfo4.setAdId(maxid);
                advertisementInfo4.setAdSequence(advertisementInfo3.getAdSequence() + 1);
                advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo4);

            }

        }
        return 0;
    }

    @Override
    public int updatesequence(AdvertisementInfo advertisementInfo) {
        Integer adSequence = advertisementInfo.getAdSequence();
        AdvertisementInfoExample advertisementInfoExample=new AdvertisementInfoExample();
        AdvertisementInfoExample.Criteria criteria = advertisementInfoExample.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        criteria.andAdSequenceIsNotNull();
        List<AdvertisementInfo> advertisementInfos = advertisementInfoMapper.selectByExample(advertisementInfoExample);

        for (AdvertisementInfo info : advertisementInfos) {
            if (info.getAdSequence()>=adSequence){
                    AdvertisementInfo advertisementInfo1=new AdvertisementInfo();
                    advertisementInfo1.setAdId(info.getAdId());
                    advertisementInfo1.setAdSequence(info.getAdSequence()+1);
                advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo1);
            }

        }
        return advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo);
    }

}
