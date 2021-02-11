package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.GradeInfo;
import com.kgc.study.bean.TestInfo;
import com.kgc.study.service.zhoujiahaoService.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "题目管理中心",description = "提供题目信息管理")
public class TestController {

    @Resource
    TestService testService;

    @ApiOperation("显示题目信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testCourseTitle",value="根据科目名称查询",required = false),
            @ApiImplicitParam(name = "testType",value="根据题目类型查询（1:多选 、2:单选）",required = false),
            @ApiImplicitParam(name = "pageNum",value="页码",required = false),
    })
    @GetMapping("/testList")
    public String testList(Model model,
                           @RequestParam(value = "testCourseTitle",required = false,defaultValue = "")String testCourseTitle,
                           @RequestParam(value = "testType",required = false,defaultValue = "0")Integer testType,
                           @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        Integer pageSize=6;
        PageHelper.startPage(pageNum,pageSize);
        List<TestInfo> testInfos = testService.selectAll(testCourseTitle,testType);
        PageInfo pageInfo=new PageInfo(testInfos);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("testType",testType);
        return "test";
    }

    @ApiOperation("逻辑删除题目")
    @PutMapping("/TestDel")
    @ResponseBody
    @ApiImplicitParam(name = "testId",value = "题目的id")
    public Map<String,Object> delete(Integer testId){
        System.out.println(testId);
        Map<String,Object> map=new HashMap<>();
        TestInfo testInfo=new TestInfo();
        testInfo.setId((long)testId);
        testInfo.setLogicDelete(1);
        int update = testService.updateDelete(testInfo);
        if(update>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("批量逻辑删除题目")
    @PutMapping("/TestDelAll")
    @ResponseBody
    @ApiImplicitParam(name = "TestIdList",value = "前端传来的id字符串格式：1,2,3")
    public Map<String,Object> delAll(String TestIdList){
        Map<String,Object> map=new HashMap<>();
        int i = testService.updateList(TestIdList);
        if(i>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("查询题目的详细信息")
    @GetMapping("testcha")
    @ApiImplicitParam(name = "TestId",required = false,value = "题目的id")
    public String testupdate(Integer TestId,Model model){
        TestInfo testInfo = testService.selectTestInfo(TestId);
        model.addAttribute("testInfo",testInfo);
        return "test-update";
    }

    @ApiOperation("修改题目信息")
    @PostMapping("testupdate")
    @ApiImplicitParam(name = "testInfo",value = "填写题目信息")
    public String testupdate(TestInfo testInfo){
        int i = testService.updateDelete(testInfo);
        return "redirect:/testList";
    }

    @ApiOperation("跳转添加页面")
    @GetMapping("/addTest")
    public String addTest(){
        return "test-insert";
    }

    @PostMapping("testinsert")
    @ApiOperation("添加题目")
    @ApiImplicitParam(name = "testInfo",value = "添加题目所需的信息")
    public String testinsert(TestInfo testInfo){
        int insert = testService.insert(testInfo);
        return "redirect:/testList";
    }
}
