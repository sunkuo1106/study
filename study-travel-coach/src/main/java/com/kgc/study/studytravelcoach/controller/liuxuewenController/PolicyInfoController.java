package com.kgc.study.studytravelcoach.controller.liuxuewenController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.google.gson.JsonObject;
import com.kgc.study.bean.PolicyInfo;
import com.kgc.study.service.liuxuewenService.PolicyInfoService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun3;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.rmi.MarshalledObject;
import java.util.*;

/**
 * @author shkstart
 * @create 2021-02-06 11:18
 */
@Controller
@Api(tags = "研学旅行后台政策管理", description = "提供政策信息管理")
public class PolicyInfoController {

    @Resource
    PolicyInfoService policyInfoService;

    @ApiOperation("查询政策")
    @GetMapping("policy-list")
    @ApiImplicitParam(name = "PolicyInfo", value = "PolicyInfo实体类", required = true)
    public String policyList(Model model, @RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize,
                             @RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                             @RequestParam(value = "policyInfoKeyWord", required = false, defaultValue = "") String policyInfoKeyWord) {
        PageInfo<PolicyInfo> policyInfoPageInfo = policyInfoService.selectPolicyInfo(policyInfoKeyWord, pageIndex, pageSize);
        System.out.println(policyInfoPageInfo);
        model.addAttribute("policyInfoPageInfo", policyInfoPageInfo);
        return "policy-list";
    }

    /**
     * 根据id查询，并跳转传值到修改政策页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("policy-edit")
    public String policyEdit(Long id, Model model) {
        PolicyInfo policyInfo = policyInfoService.selectPolicyInfoById(id);
        model.addAttribute("policyInfo", policyInfo);
        return "policy-edit";
    }

    @ApiOperation("修改政策")
    @PostMapping("/dopolicy-edit")
    @ResponseBody
    @ApiImplicitParam(name = "PolicyInfo", value = "PolicyInfo实体类", required = true)
    public Map<String, Object> doPolicyEdit(PolicyInfo policyInfo, Model model) {
        int i = policyInfoService.updatePolicyInfo(policyInfo);
        Map<String, Object> map = new HashMap<>();
        if (i > 0) {
            map.put("status", "true");
        } else {
            map.put("status", "false");
        }
        return map;
    }

    @RequestMapping("policy-add")
    public String policyAdd() {
        return "policy-add";
    }

    @lombok.SneakyThrows
    @ApiOperation("添加政策")
    @PostMapping("dopolicy-add")
    @ResponseBody
    @ApiImplicitParam(name = "PolicyInfo", value = "PolicyInfo实体类", required = true)
    public Map<String, Object> doPolicyAdd(PolicyInfo policyInfo) {
        Map<String, Object> map = new HashMap<>();
        policyInfo.setGmtCreate(new Date());
        policyInfo.setLogicDelete(0);
        int i = 0;
        i = policyInfoService.insertPolicyInfo(policyInfo);
        if (i > 0) {
            map.put("status", true);
        } else {
            map.put("status", false);
        }
        return map;
    }

    @lombok.SneakyThrows
    @ApiOperation("添加图片")
    @PostMapping(value = "saveImages")
    @ResponseBody
    public JSONObject doNewsprojectheadpic(@RequestParam("projectheadpic") MultipartFile multipartFile) {
        JSONObject jsonObject = new JSONObject();
        InputStream stream = multipartFile.getInputStream();
        String oldFileName = multipartFile.getOriginalFilename();
        String imgURL = Aliyun3.upload(stream, oldFileName);
        // 返回图片的URL地址
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(imgURL);
        jsonObject.put("errno", 0);
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    @PostMapping("/policy-del")
    @ResponseBody
    @ApiImplicitParam(name = "PolicyInfo", value = "PolicyInfo实体类", required = true)
    public Map<String,Object> delPolicyInfo(String arr) {
        String[] arrs = arr.split(",");
        List<Integer> list = new ArrayList<>();
        for(String str:arrs){
            list.add(Integer.parseInt(str));
        }
        System.out.println(list.toString());
        int i = policyInfoService.deletePolicyInfo(list);
        Map<String,Object> map=new HashMap<>();
        System.out.println(i);
        if (i > 0) {
            map.put("status", true);
        } else {
            map.put("status", false);
        }
        System.out.println(map);
        return map;
    }

    @PostMapping("/policy-del-id")
    @ApiImplicitParam(name = "PolicyInfo", value = "PolicyInfo实体类", required = true)
    public String delPolicyInfoByid(Long id) {
        policyInfoService.deletePoolicyInfoById(id);
        return "redirect:/policy-list";
    }

}
