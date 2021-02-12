package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.Learning;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.ChapterTable;
import com.kgc.study.service.zhangjiaheService.ChapterTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "研学旅行学习广告中心",description = "学习中心章节中心")
public class LearnchapterController {
    @Resource
    ChapterTableService chapterTableService;
    //查看章节页面chapter_table
    @ApiOperation("显示广告列表")
    @RequestMapping("/chapterSelect")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value="页码",required = false),
            @ApiImplicitParam(name = "pageSize",value="页面行数",required = false),
            @ApiImplicitParam(name = "chapterName",value="章节名称",required = false),
            @ApiImplicitParam(name = "courseId",value="课程ID",required = false),
            @ApiImplicitParam(name = "chapterName",value = "如果查询章节名称不为空进行查询",required = true)
    })
    /*@RequestMapping("/learncenter")*/
    public  String  learncenter(String chapterName, Long courseId, Model model,
                                @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize, HttpSession session){

        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("chapter_table_id desc");
        List<ChapterTable> chapterTables = chapterTableService.selectChapterTable(chapterName, courseId);
        PageInfo<ChapterTable> chapterTablePageInfo = new PageInfo<>(chapterTables);
        model.addAttribute("chapterTables",chapterTablePageInfo);
        model.addAttribute("chapterName",chapterName);
        session.setAttribute("courseId",courseId);
        model.addAttribute("courseId",courseId);
        System.out.println(courseId+"courseId");
        return "learncenter-chapter.html";
    }
    //跳转添加章节页面
    @ApiOperation("跳转添加章节页面")
    @GetMapping("/toChapterTableInsert")
   /* @RequestMapping("/toChapterTableInsert")*/
    public String toChapterTableInsert(){
     return "learncenter-chapter-insert.html";
    }
    //添加章节
    @ApiOperation("添加章节")
    @PostMapping("/doChapterTableInsert")
    @ApiImplicitParam(name = "ChapterTable",value = "ChapterTable章节表",required = true)
   /* @RequestMapping("/doChapterTableInsert")*/
    public String doChapterTableInsert(ChapterTable chapterTable,HttpSession session){
        Long courseId = (Long)session.getAttribute("courseId");
        System.out.println(courseId+"courseId");
        chapterTable.setCourseId(courseId);
        int chapterTableInsert = chapterTableService.ChapterTableInsert(chapterTable);
        if (chapterTableInsert>0){
            return "redirect:chapterSelect?courseId="+courseId;
        }else {
            return "redirect:chapterSelect?courseId="+courseId;
        }
    }
    //删除单条章节 逻辑删除
    @ApiOperation("删除单条章节 逻辑删除")
    @PostMapping("/ChapterupdatedeleteID")
    @ApiImplicitParam(name = "chapterTableId",value = "章节id",required = true)
  /*  @RequestMapping("/ChapterupdatedeleteID")*/
    @ResponseBody
    public Map  ChapterTableupdatedeleteID(Long chapterTableId){
        Map map=new HashMap();
        int chapterTableupdatedeleteID = chapterTableService.ChapterTableupdatedeleteID(chapterTableId);
        if (chapterTableupdatedeleteID>0){
            map.put("status", "true");
        }else {
            map.put("status", "false");
        }
        return map;
    }
    //批量删除 逻辑删除
    @ApiOperation("批量删除 逻辑删除")
    @PostMapping("/ChapterTableupdatedeletelist")
    @ApiImplicitParam(name = "str",value = "后台页面id数组",required = true)
   /* @RequestMapping("ChapterTableupdatedeletelist")*/
    @ResponseBody
    public Map ChapterTableupdatedeletelist (String str){
        Map map=new HashMap();
        int chapterTableupdatedeleteID = chapterTableService.Chapterupdatedeletelist(str);
        if (chapterTableupdatedeleteID>0){
            map.put("status", "true");
        }else {
            map.put("status", "false");
        }
        return map;
    }
    //跳转修改页面
    @ApiOperation("跳转修改页面")
    @GetMapping("/chapterupdatecha")
    @ApiImplicitParam(name = "chapterTableId",value = "章节表id进行修改查询",required = true)
   /* @RequestMapping("/chapterupdatecha")*/
public  String  chapterupdatecha(Long chapterTableId,Model model){
        ChapterTable chapterupdatecha = chapterTableService.chapterupdatecha(chapterTableId);
        model.addAttribute("chapterupdatecha",chapterupdatecha);
        return "learncenter-chapter-update.html";
    }
    //修改
    @ApiOperation("修改")
    @PostMapping("/doChapterTableupdate")
    @ApiImplicitParam(name = "ChapterTable",value = "章节表",required = true)
    /*@RequestMapping("/doChapterTableupdate")*/
    public String doChapterTableupdate(ChapterTable chapterTable,HttpSession session){
        Long courseId = (Long)session.getAttribute("courseId");
        int chapterTableInsert = chapterTableService.ChapterTableupdate(chapterTable);
        if (chapterTableInsert>0){
            return "redirect:chapterSelect?courseId="+courseId;
        }else {
            return "redirect:chapterSelect?courseId="+courseId;
        }
    }


}
