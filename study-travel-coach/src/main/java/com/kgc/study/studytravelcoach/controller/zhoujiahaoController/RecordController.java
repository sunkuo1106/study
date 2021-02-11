package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.RecordInfo;
import com.kgc.study.bean.TestInfo;
import com.kgc.study.service.zhoujiahaoService.RecordService;
import com.kgc.study.service.zhoujiahaoService.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Api(tags = "测试记录管理中心",description = "提供测试记录信息管理")
public class RecordController {

    @Resource
    RecordService recordService;
    @Resource
    TestService testService;

    @ApiOperation("显示测试记录信息列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "testCourseTitle",value="根据测试分数查询",required = false),
            @ApiImplicitParam(name = "pageNum",value="页码",required = false),
    })
    @GetMapping("recordList")
    public String recordList(Model model,
                             @RequestParam(value = "recordTestScore",required = false,defaultValue = "")Integer recordTestScore,
                             @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        Integer pageSize=6;
        PageHelper.startPage(pageNum,pageSize);
        List<RecordInfo> recordInfos = recordService.selectAll(recordTestScore);
        PageInfo pageInfo=new PageInfo(recordInfos);
        model.addAttribute("recordInfo",pageInfo);
        return "record";
    }

    @ApiOperation("逻辑删除测试记录")
    @PutMapping("/RecordDel")
    @ResponseBody
    @ApiImplicitParam(name = "recordId",value = "测试记录的id")
    public Map<String,Object> delete(Integer recordId){
        System.out.println(recordId);
        Map<String,Object> map=new HashMap<>();
        RecordInfo recordInfo=new RecordInfo();
        recordInfo.setId((long)recordId);
        recordInfo.setLogicDelete(1);
        int update = recordService.updateDelete(recordInfo);
        if(update>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("批量逻辑删除测试记录")
    @PutMapping("/RecordDelAll")
    @ResponseBody
    @ApiImplicitParam(name = "RecordIdList",value = "前端传来的id字符串格式：1,2,3")
    public Map<String,Object> delAll(String RecordIdList){
        Map<String,Object> map=new HashMap<>();
        int i = recordService.updateList(RecordIdList);
        if(i>0){
            map.put("status",true);
        }else{
            map.put("status",false);
        }
        return map;
    }

    @ApiOperation("查看该用户做的测试题情况")
    @GetMapping("recordcha")
    @ApiImplicitParam(name = "recordId",value = "测试记录的id")
    public String recordcha(Model model,Integer recordId){
        RecordInfo recordInfo = recordService.selectRecordAll(recordId);
        Map maps = (Map) JSON.parse(recordInfo.getRecordTestKeysList());
        List<TestInfo> list=new ArrayList<>();
        int num=0;
        if(recordId!=null){
            String recordTestIdList = recordInfo.getRecordTestIdList();
            String[] split = recordTestIdList.split(",");
            for (int i = 0; i < split.length; i++) {
                Integer testId = Integer.parseInt(split[i]);
                TestInfo testInfo = testService.selectTestInfo(testId);
                for (Object o : maps.keySet()) {
                    //判断题目id和选的答案id是否对应
                    if(o==testId){
                        String keys = (String) maps.get(o);
                        testInfo.setKeys(keys);
                        //获取正确答案
                        String testKeys = testInfo.getTestKeys();
                        if(keys.equals(testKeys)){
                            num+=5;
                        }
                    }
                }
                list.add(testInfo);
            }
        }
        model.addAttribute("user",recordInfo.getUser().getEduUserName());
        model.addAttribute("num",num);
        model.addAttribute("TestInfo",list);
        return "test-record";
    }
}
