package com.kgc.study.service.lixiliangService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.NewsInfo;

import java.util.Date;

/**
 * @author 李锡良
 * @create 2021-02-05 9:54
 */
public interface NewsService {

    /**
     * 新增新闻数据
     */
    int insNews(NewsInfo newsInfo);

    /**
     * 查询新闻数据，条件查询根据发布时间做区间查询，根据标题模糊查询
     */
    PageInfo<NewsInfo> selNewsAndCreateAndmodifiedOrtitle(int pageSize,int pageIndex,String title, Date gmtCreate1, Date gmtCreate2);

    /**
     * 修改新闻数据，根据获取的当前点击id获取这条实体的所有信息
     */
    NewsInfo selNewsId(Long id);

    /**
     * 修改新闻信息
     */
    int updNewsAll(NewsInfo newsInfo);

    /**
     *  根据id删除新闻 逻辑删除
     */
    int delNews(Long id,Integer logicDelete);

}
