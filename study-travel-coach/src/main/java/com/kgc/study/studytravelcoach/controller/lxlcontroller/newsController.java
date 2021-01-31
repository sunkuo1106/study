package com.kgc.study.studytravelcoach.controller.lxlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李锡良
 * @create 2021-01-31 15:30
 */
@Controller
public class newsController {

    @RequestMapping("/news-list")
    public String toNewsList(){
        return "news-list";
    }

    @RequestMapping("/news-add")
    public String toNewsAdd(){
        return "news-add";
    }

    @RequestMapping("/news-edit")
    public String toNewsEdit(){
        return "news-edit";
    }
}
