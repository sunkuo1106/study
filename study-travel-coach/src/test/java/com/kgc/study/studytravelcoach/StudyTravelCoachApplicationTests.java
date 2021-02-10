package com.kgc.study.studytravelcoach;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.NewsInfo;
import com.kgc.study.service.lixiliangService.NewsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class StudyTravelCoachApplicationTests {

    @Resource
    NewsService newsService;

    @Test
    void contextLoads() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        Date date2 = null;
        try {
             date = format.parse("2021-02-06");
             date2 = format.parse("2021-02-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        PageInfo<NewsInfo> pageInfo = newsService.selNewsAndCreateAndmodifiedOrtitle(5, 1, null,date , date2);
        for (NewsInfo o : pageInfo.getList()) {
            System.out.println(o);
        }
    }

}
