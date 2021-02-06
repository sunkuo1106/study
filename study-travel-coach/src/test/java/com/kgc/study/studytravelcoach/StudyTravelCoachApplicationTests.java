package com.kgc.study.studytravelcoach;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.NewsInfo;
import com.kgc.study.service.lixiliangService.NewsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StudyTravelCoachApplicationTests {

    @Resource
    NewsService newsService;

    @Test
    void contextLoads() {
        PageInfo<NewsInfo> pageInfo = newsService.selNewsAndCreateAndmodifiedOrtitle(2, 1, null, null, null);
        for (NewsInfo o : pageInfo.getList()) {
            System.out.println(o);
        }
    }

}
