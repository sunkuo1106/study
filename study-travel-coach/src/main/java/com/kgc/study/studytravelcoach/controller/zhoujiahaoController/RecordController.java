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
                        if(keys.length()==testKeys.length()){
                            if(keys.length()==1 && testKeys.length()==1){
                                if(keys.equals(testKeys)){
                                    num+=5;
                                    continue;
                                }
                            }
                            if(keys.length()==3 && testKeys.length()==3){
                                List AB=new ArrayList();
                                AB.add("A,B");
                                AB.add("B,A");
                                if(AB.contains(keys) && AB.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List AC=new ArrayList();
                                AC.add("A,C");
                                AC.add("C,A");
                                if(AC.contains(keys) && AC.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List AD=new ArrayList();
                                AD.add("A,D");
                                AD.add("D,A");
                                if(AD.contains(keys) && AD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List BC=new ArrayList();
                                BC.add("C,B");
                                BC.add("B,C");
                                if(BC.contains(keys) && BC.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List BD=new ArrayList();
                                BD.add("D,B");
                                BD.add("B,D");
                                if(BD.contains(keys) && BD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List CD=new ArrayList();
                                CD.add("D,C");
                                CD.add("C,D");
                                if(CD.contains(keys) && CD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                            }
                            if(keys.length()==5 && testKeys.length()==5){
                                List ABC=new ArrayList();
                                ABC.add("A,B,C");
                                ABC.add("A,C,B");
                                ABC.add("B,A,C");
                                ABC.add("B,C,A");
                                ABC.add("C,A,B");
                                ABC.add("C,B,A");
                                if(ABC.contains(keys) && ABC.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List ABD=new ArrayList();
                                ABD.add("A,B,D");
                                ABD.add("A,D,B");
                                ABD.add("B,A,D");
                                ABD.add("B,D,A");
                                ABD.add("D,A,B");
                                ABD.add("D,B,A");
                                if(ABD.contains(keys) && ABD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List ACD=new ArrayList();
                                ACD.add("A,C,D");
                                ACD.add("A,D,C");
                                ACD.add("C,A,D");
                                ACD.add("C,D,A");
                                ACD.add("D,A,C");
                                ACD.add("D,C,A");
                                if(ACD.contains(keys) && ACD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                                List BCD=new ArrayList();
                                BCD.add("B,C,D");
                                BCD.add("B,D,C");
                                BCD.add("C,B,D");
                                BCD.add("C,D,B");
                                BCD.add("D,B,C");
                                BCD.add("D,C,B");
                                if(BCD.contains(keys) && BCD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                            }
                            if(keys.length()==7 && testKeys.length()==7){
                                List ABCD=new ArrayList();
                                ABCD.add("A,B,C,D");
                                ABCD.add("A,B,D,C");
                                ABCD.add("A,C,B,D");
                                ABCD.add("A,C,D,B");
                                ABCD.add("A,D,C,B");
                                ABCD.add("A,D,B,C");
                                ABCD.add("B,A,C,D");
                                ABCD.add("B,A,D,C");
                                ABCD.add("B,C,A,D");
                                ABCD.add("B,C,D,A");
                                ABCD.add("B,D,C,A");
                                ABCD.add("B,D,A,C");
                                ABCD.add("C,A,B,D");
                                ABCD.add("C,A,D,B");
                                ABCD.add("C,B,D,A");
                                ABCD.add("C,B,A,D");
                                ABCD.add("C,D,A,B");
                                ABCD.add("C,D,B,A");
                                ABCD.add("D,C,B,A");
                                ABCD.add("D,C,A,B");
                                ABCD.add("D,B,A,C");
                                ABCD.add("D,B,C,A");
                                ABCD.add("D,A,C,B");
                                ABCD.add("D,A,B,C");
                                if(ABCD.contains(keys) && ABCD.contains(testKeys)){
                                    num+=5;
                                    continue;
                                }
                            }
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
