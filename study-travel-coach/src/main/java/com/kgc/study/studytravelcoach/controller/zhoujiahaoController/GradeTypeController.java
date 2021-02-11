package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.kgc.study.bean.GradeType;
import com.kgc.study.service.zhoujiahaoService.gradetypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "班级类型管理中心",description = "提供班级类型信息管理")
public class GradeTypeController {

    @Resource
    gradetypeService greadetypeService;

    @ApiOperation("查看班级类型列表")
    @GetMapping("/gradeType")
    public String grade_type(Model model){
        Integer logicDelete = 0;
        List<GradeType> gradeTypeList=greadetypeService.selectAll(logicDelete);
        model.addAttribute("gradeTypeList",gradeTypeList);
        return "grade-type";
    }

    @ApiOperation("跳转添加班级类型的页面")
    @GetMapping("/add")
    public String memberadd(){
        return "member-add";
    }

    @ApiOperation("添加班级类型")
    @GetMapping("/doadd")
    @ApiImplicitParam(name = "gradeType",value = "要添加的班级类型信息")
    public String domemberadd(GradeType gradeType){
        int i=greadetypeService.add(gradeType);
        if(i>0){
            return "redirect:/gradeType";
        }else {
            return "member-add";
        }
    }

    @ApiOperation("根据班级类型id查看详细信息")
    @GetMapping("/upd")
    @ApiImplicitParam(name = "id",value = "班级类型的id")
    public String toupd(Long id,Model model){
        GradeType gradeType=greadetypeService.selectById(id);
        model.addAttribute("gradeTypeList",gradeType);
        return "member-upd";
    }

    @ApiOperation("根据班级类型id查看详细信息")
    @GetMapping("/doupd")
    @ApiImplicitParam(name = "gradeType",value = "要修改的班级类型信息")
    public String doupd(GradeType gradeType){
        int i=greadetypeService.doupd(gradeType);
        if(i>0){
            return "redirect:/gradeType";
        }else {
            return "member-upd";
        }
    }

    @ApiOperation("逻辑删除")
    @GetMapping("/del")
    @ApiImplicitParam(name = "id",value = "班级类型id")
    public String del(Long id){
        GradeType gradeType=new GradeType();
        gradeType.setId(id);
        greadetypeService.dodel(gradeType);
        return "redirect:/gradeType";
    }
}
