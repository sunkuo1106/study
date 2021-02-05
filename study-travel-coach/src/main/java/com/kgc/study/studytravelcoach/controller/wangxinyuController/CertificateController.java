package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.CertificateTable;

import com.kgc.study.service.wangxinyuService.CertificateTableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.print.DocFlavor;
import javax.xml.transform.Source;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-02-04 16:56
 */
//证书管理器
@Controller
public class CertificateController {

    @Resource
    CertificateTableService certificateTableService;

    //查询证书页面
    @RequestMapping("certificate-list")
    public String certificateList(
            @RequestParam(value = "cerSumScore", required = false, defaultValue = "") Long cerSumScore,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "6") Integer pageSize,
            Model model){
        PageInfo<CertificateTable> myPageInfo = certificateTableService.selectCertificateTable(cerSumScore,pageNum,pageSize);
        model.addAttribute("myPageInfo", myPageInfo);
        model.addAttribute("cerSumScore",cerSumScore);
        return "certificate-list";
    }
    //跳转修改证书页面
    @RequestMapping("certificate-edit")
    public String certificateEdit(Integer id,Model model) {
        CertificateTable certificateTable = certificateTableService.getCertificateTable(id);
        model.addAttribute("list",certificateTable);
        return "certificate-edit";
    }

    //修改证书数据
    @RequestMapping("/doupdCertificateTable")
    public String doupdCertificateTable(CertificateTable certificateTable,Model model){
        certificateTable.setGmtModified(new Date());
        int i = certificateTableService.updCertificateTable(certificateTable);
        if(i>0){
            model.addAttribute("msg","修改成功！！！");
            return "redirect:certificate-list";
        }else {
            model.addAttribute("msg", "修改失败！！！");
            return "redirect:certificate-list";
        }
    }
    //跳转添加证书页面
    @RequestMapping("certificate-add")
    public String certificateAdd(){
        return "certificate-add";
    }

    //添加证书
    @RequestMapping("doCertificateAdd")
    public String doCertificateAdd(CertificateTable certificateTable,Model model){
        certificateTable.setGmtCreate(new Date());
        certificateTable.setGmtModified(new Date());
        int i = certificateTableService.add(certificateTable);
        if(i>0){
            model.addAttribute("msg","添加成功！！！");
            return "redirect:certificate-list";
        }else {
            model.addAttribute("msg","添加失败！！！");
            return "redirect:certificate-list";
        }
    }
    //对证书进行假删除
    @RequestMapping("/jiaDelete")
    public String jiaDelete(CertificateTable certificateTable,Model model){
        certificateTable.setLogicDelete(1);
        certificateTableService.updCertificateTable(certificateTable);
        return "redirect:certificate-list";
    }
    //批量删除
    @RequestMapping("/moreDelete")
    @ResponseBody
    public Map<String,Object> delete(String ids){
        Map<String,Object>map=new HashMap<>();

        String[] split = ids.split(",");
        Integer[] ids2=new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            ids2[i] = Integer.valueOf(split[i]);
        }
        int i = certificateTableService.deleteAll(ids2,new Date());
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
}
