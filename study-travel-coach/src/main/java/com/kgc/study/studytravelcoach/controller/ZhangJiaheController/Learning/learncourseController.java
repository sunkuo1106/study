package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.Learning;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.Course;
import com.kgc.study.service.zhangjiaheService.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
@Api(tags = "研学旅行后台学习中心",description = "学习中心课程中心")
public class learncourseController {
    //学习中心页面
    @Resource
    CourseService courseService;



    @ApiOperation("模糊查询课程表及其分页")
    @RequestMapping("/learncenter")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum",value="页码",required = false),
            @ApiImplicitParam(name = "pageSize",value="页面行数",required = false),
            @ApiImplicitParam(name = "coursename",value="课程名称",required = false),
            @ApiImplicitParam(name = "coursename",value = "如果查询课程名称不为空进行查询",required = true)
    })
    public String selct(
            String coursename,
            @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "3")Integer pageSize, Model model){
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("id desc");
        List<Course> select = courseService.select(coursename);
        PageInfo<Course> coursePageInfo = new PageInfo<>(select);
        model.addAttribute("select", coursePageInfo);
        model.addAttribute("coursename",coursename);
        return "learncenter.html";
    }
    @ApiOperation("新增课程表跳转")
    @GetMapping("/course-add")
    public String toNewsEdit(){
        return "course-add.html";
    }
    @ApiOperation("新增课程表接口")
    @PostMapping(value = "/courseadd",produces = "application/json;charset=UTF-8")
    @ApiImplicitParam(name = "course",value = "课程表",required = true)
    /*@RequestMapping("/courseadd")*/
    public String courseadd(Course Course){
        Course.setGmtCreate(new Date());
        Course.setGmtModified(new Date());
        Course.setLogicDelete(0);
        int add = courseService.add(Course);
        return "redirect:/learncenter";
    }

    @ApiOperation("根据id批量删除")
    @PostMapping("/courseupdatedeletelist")
    @ApiImplicitParam(name = "str",value = "课程id",required = true)
    public  String courseupdatedeletelist(Model model,String str){
        ArrayList list=new ArrayList();
        String []idd=str.split(",");
        for(int i=0;i<idd.length;i++) {
            int num=Integer.parseInt(idd[i]);
            list.add(num);
        }
        int delete = courseService.delete(list);
        if (delete>0){
            return "redirect:/learncenter";
        }else {
            return "redirect:/learncenter";
        }
    }

    @ApiOperation("修改根据id查")
    @GetMapping("/course-updcha")
    @ApiImplicitParam(name = "id",value = "课程表id",required = true)
    public  String courseupdcha(Model model,Long id){
        Course courseupdcha = courseService.Courseupdcha(id);
        model.addAttribute("cha",courseupdcha);
        return "course-upd.html";
    }
    @ApiOperation("修改课程")
    @PostMapping("course-upd")
    public  String courseupd(Course course){
        course.setGmtModified(new Date());
        int courseupdate = courseService.Courseupdate(course);
        return "redirect:/learncenter";
    }
    @ApiOperation("删除课程")
    @GetMapping("/course-dele/{id}")
    @ApiImplicitParam(name = "id",value = "课程id",required = true)
    public  String coursedele(@PathVariable("id")Long id){
        ArrayList list=new ArrayList();
        list.add(id);
        int delete = courseService.delete(list);
        return "redirect:/learncenter";
    }
}
