package com.kgc.study.studytravelcoach.service.lxlServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.NewsInfo;
import com.kgc.study.bean.NewsInfoExample;
import com.kgc.study.service.lixiliangService.NewsService;
import com.kgc.study.studytravelcoach.mapper.NewsInfoMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 李锡良
 * @create 2021-02-05 10:12
 */
@Service
@Component
public class NewsServiceImpl implements NewsService {

    @Resource
    NewsInfoMapper newsInfoMapper;

    @Override
    public int insNews(NewsInfo newsInfo) {
        return newsInfoMapper.insertSelective(newsInfo);
    }

    @Override
    public PageInfo<NewsInfo> selNewsAndCreateAndmodifiedOrtitle(int pageSize,int pageIndex,String title, Date gmtCreate1, Date gmtCreate2) {
        NewsInfoExample example = new NewsInfoExample();
        NewsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        if (title!=null&&gmtCreate1!=null&&gmtCreate2!=null){
            criteria.andGmtCreateBetween(gmtCreate1,gmtCreate2);
            criteria.andNewsInfoTitleLike("%"+title+"%");
        }else if (title!=null&&gmtCreate1==null&&gmtCreate2==null){
            criteria.andNewsInfoTitleLike("%"+title+"%");
        }else if (title==null&&gmtCreate1!=null&&gmtCreate2!=null){
            criteria.andGmtCreateBetween(gmtCreate1,gmtCreate2);
        }else{
            newsInfoMapper.selectByExample(null);
        }
        PageHelper.startPage(pageIndex,pageSize);
        List<NewsInfo> newsInfos = newsInfoMapper.selectByExample(example);
        PageInfo<NewsInfo> pageInfo = new PageInfo<>(newsInfos);
        return pageInfo;
    }


    @Override
    public NewsInfo selNewsId(Long id) {
        NewsInfoExample example = new NewsInfoExample();
        NewsInfoExample.Criteria criteria = example.createCriteria();
        NewsInfo newsInfo = newsInfoMapper.selectByPrimaryKey(id);
        return newsInfo;
    }

    @Override
    public int updNewsAll(NewsInfo newsInfo) {
        return newsInfoMapper.updateByPrimaryKeySelective(newsInfo);
    }

    @Override
    public int delNews(Long id,Integer logicDelete) {
        NewsInfoExample example = new NewsInfoExample();
        NewsInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andLogicDeleteEqualTo(logicDelete);
        int i = newsInfoMapper.updateByLogicDelete(id, logicDelete);
        return i;
    }

    @Override
    public int delNewsList(String gpId) {
        ArrayList arrayList = new ArrayList();
        String[] gpIds = gpId.split(",");
        for (int i = 0; i < gpIds.length; i++) {
            Long num = Long.parseLong(gpIds[i]);
            arrayList.add(num);
        }
        int i = newsInfoMapper.updateByLogicDeleteList(arrayList);
        return i;
    }


}
