package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.service.wangxinyuService.AgencyAddressService;
import com.kgc.study.service.wangxinyuService.AgencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 孙阔
 * @date 2021/2/2 14:32
 */

@Controller
public class AgencyController {
    @Resource
    AgencyService agencyService;
    @Resource
    AgencyAddressService agencyAddressService;
    /*
    *跳转机构管理页面
    * */
    @GetMapping("/agency")
    public String toAgency(Model model, HttpSession session,String agencyAddress,@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize",required = false,defaultValue = "6") Integer pageSize){
        Integer agencyId = (Integer) session.getAttribute("AgencyId");
        PageInfo<AgencyInfo> agencyInfos = agencyService.selectAgency(Long.valueOf(agencyId),agencyAddress,pageNum,pageSize);
        model.addAttribute("agencyInfo",agencyInfos);
        return "agency";
    }
//    @RequestMapping("/agencyId")
//    @ResponseBody
//    public Map<String,Object> agencyId(Integer id, String agencyName, HttpSession session){
//        Map<String,Object> map=new HashMap<>();
//        session.setAttribute("agencyAddressId",id);
//        session.setAttribute("agencyName",agencyName);
//        return map;
//    }
    @GetMapping("/agencyaddress")
    public String toagencyaddress(Model model, HttpSession session,Integer agencyAddressId,String agencyAddress,@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                @RequestParam(value = "pageSize",required = false,defaultValue = "6") Integer pageSize) {
             //    Integer agencyAddressId=0;
           // Integer agencyAddressId = (Integer) session.getAttribute("agencyAddressId");
//            if(agencyAddressId2!=null&&agencyAddressId2>0){
//                agencyAddressId=agencyAddressId2;
                PageInfo<AgencyAddress> agencyAddresses = agencyAddressService.selectAllAgency(agencyAddressId, agencyAddress, pageNum, pageSize);
                model.addAttribute("agencyAddresses", agencyAddresses);
            return "agencyaddress";
    }
}
