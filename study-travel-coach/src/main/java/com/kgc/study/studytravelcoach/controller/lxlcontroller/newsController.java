package com.kgc.study.studytravelcoach.controller.lxlcontroller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.NewsInfo;
import com.kgc.study.service.lixiliangService.NewsService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2021-01-31 15:30
 */
@Controller
@Api(tags = "研学旅行后台新闻中心",description = "提供新闻信息管理")
public class newsController {

    @Resource
    NewsService newsService;

    /**
     * 查询新闻
     * @param pageSize
     * @param pageIndex
     * @param title
     * @param gmtCreate1
     * @param gmtCreate2
     * @return
     */
    @ApiOperation("查询新闻")
    @GetMapping("/news-list")
    @ApiImplicitParam(name = "NewsInfo",value = "NewsInfo实体类",required = true)
    public String doNewsList(Model model,@RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize,
                                         @RequestParam(value = "pageIndex",required = false,defaultValue = "1") int pageIndex,
                                         @RequestParam(value = "title",required = false) String title,
                                         @RequestParam(value = "gmtCreate1",required = false) String gmtCreate1,
                                         @RequestParam(value = "gmtCreate2",required = false) String gmtCreate2) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        if (gmtCreate1!=null){
            date1 = format.parse(gmtCreate1);
        }
        Date date2 = null;
        if (gmtCreate2!=null){
            date2 = format.parse(gmtCreate2);
        }
        PageInfo<NewsInfo> pageInfo = newsService.selNewsAndCreateAndmodifiedOrtitle(pageSize, pageIndex, title, date1, date2);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("gmtCreate1",date1);
        model.addAttribute("gmtCreate2",date2);
        model.addAttribute("title",title);
        return "news-list";
    }

    /**
     * 跳转新闻添加页面
     * @return
     */
    @RequestMapping("/news-add")
    public String toNewsAdd(){
        return "news-add";
    }

    @lombok.SneakyThrows
    @ApiOperation("添加图片")
    @PostMapping(value = "saveImg")
    @ResponseBody
    public JSONObject doNewsprojectheadpic(@RequestParam("projectheadpic") MultipartFile multipartFile){
        JSONObject jsonObject=new JSONObject();
        InputStream stream = multipartFile.getInputStream();
        String oldFileName = multipartFile.getOriginalFilename();
        String imgURL = Aliyun.upload(stream, oldFileName);
        // 返回图片的URL地址
        JSONArray jsonArray=new JSONArray();
        jsonArray.add(imgURL);
        jsonObject.put("errno",0);
        jsonObject.put("data",jsonArray);
        return jsonObject;
    }


    /**
     * 新闻的添加
     * @param newsInfo
     * @return
     */
    @lombok.SneakyThrows
    @ApiOperation("添加新闻")
    @PostMapping("/news-add-ins")
    @ResponseBody
    @ApiImplicitParam(name = "NewsInfo",value = "NewsInfo实体类",required = true)
    public Map<String,Object> doNewsAdd(NewsInfo newsInfo){
        Integer a = 0;
        Map<String,Object> map = new HashMap<>();
        newsInfo.setGmtCreate(new Date());
        Integer newsInfoClickCount = newsInfo.getNewsInfoClickCount();
        newsInfo.setNewsInfoClickCount(0);
        System.out.println(newsInfoClickCount);
        newsInfo.setLogicDelete(0);
        int i = newsService.insNews(newsInfo);
        if (i>0){
            map.put("status", "true");
        }else{
            map.put("status", "false");
        }
        return map;
    }

    /**
     * 根据id查询出新闻当前点击的新闻的所有详细信息，跳转到新闻修改页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/news-edit")
    public String toNewsEdit(Long id,Model model){
        NewsInfo newsInfo = newsService.selNewsId(id);
        model.addAttribute("newsInfo",newsInfo);
        return "news-edit";
    }


    /**
     * 新闻修改
     * @param newsInfo
     * @return
     */
    @ApiOperation("修改新闻")
    @PostMapping("/news-edit-upd")
    @ResponseBody
    @ApiImplicitParam(name = "NewsInfo",value = "NewsInfo实体类",required = true)
    public Map<String,Object> doNewsUpd(NewsInfo newsInfo){
        Map<String,Object> map = new HashMap<>();
        newsInfo.setGmtModified(new Date());
        int i = newsService.updNewsAll(newsInfo);
        if (i>0){
            map.put("status", "true");
        }else{
            map.put("status", "false");
        }
        return map;
    }

    /**
     * 逻辑删除
     * @param id
     * @param logicDelete
     * @return
     */
    @ApiOperation("删除新闻")
    @GetMapping("/news-edit-del")
    @ApiImplicitParam(name = "NewsInfo",value = "NewsInfo实体类",required = true)
    public String doNewsdel(Long id,Integer logicDelete){
        newsService.delNews(id,1);
        return "redirect:/news-list";
    }

    /**
     * 逻辑删除,批量修改
     * @param gpId
     * @return
     */
    @ApiOperation("批量修改新闻")
    @PostMapping("/doNewsdelList")
    @ApiImplicitParam(name = "str",value = "数组",required = true)
    @ResponseBody
    public Map doNewsdelList(String gpId){
        Map map = new HashMap();
        int i = newsService.delNewsList(gpId);
        if (i>0){
            map.put("status", "true");
        }else {
            map.put("status", "false");
        }

        return map;
    }

}
