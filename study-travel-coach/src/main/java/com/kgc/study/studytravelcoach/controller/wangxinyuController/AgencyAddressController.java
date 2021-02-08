package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.service.wangxinyuService.AgencyAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-02-08 12:56
 */
@Controller
public class AgencyAddressController {
    @Resource
    AgencyAddressService agencyAddressService;
    @PostMapping("/doagencyaddress")
    @ResponseBody
    public Map<String,Object> toagencyaddress(Model model, HttpSession session, String agencyAddress, @RequestParam(value = "pageNum",required = false) Integer pageNum,
                                              @RequestParam(value = "pageSize",required = false) Integer pageSize) {
        Map<String,Object> map=new HashMap<>();
        //拿到查看机构的上课点时的当前机构的Id和名字
        Integer agencyAddressId = (Integer) session.getAttribute("agencyAddressId");
        String agencyName = (String) session.getAttribute("agencyName");
        PageInfo<AgencyAddress> agencyAddresses = agencyAddressService.selectAllAgency(agencyAddressId, agencyAddress, pageNum, pageSize);
        map.put("agencyAddresses", agencyAddresses);
        map.put("agencyName",agencyName);
        return map;
    }
    @GetMapping("/toagencyaddressadd")
    public String toagencyaddressadd(){
        return "agencyaddress-add";
    }
    @PostMapping("/doagencyaddressadd")
    @ResponseBody
    public Map<String,Object> doagencyaddressadd(AgencyAddress agencyAddress,HttpSession session){
        Map<String,Object> map=new HashMap<>();
        Integer agencyId = (Integer) session.getAttribute("AgencyId");
        agencyAddress.setAgencyId(Long.valueOf(agencyId));
        agencyAddress.setGmtCreate(new Date());
        agencyAddress.setGmtModified(new Date());
        agencyAddress.setLogicDelete(0);
        int i = agencyAddressService.addAgencyAddress(agencyAddress);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @PostMapping("/doagencyaddressdel")
    @ResponseBody
    public Map<String,Object> doagencyaddressdel(AgencyAddress agencyAddress){
        Map<String,Object> map=new HashMap<>();
        agencyAddress.setGmtModified(new Date());
        agencyAddress.setLogicDelete(1);
        int i = agencyAddressService.delAgencyAddress(agencyAddress);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @GetMapping("/toagencyaddressupd")
    public String toagencyaddressupd(){
        return "agencyaddress-upd";
    }
    @PostMapping("/cunagencyaddress")
    @ResponseBody
    public Map<String,Object> cunagencyaddress(Integer id,HttpSession session){
        Map<String,Object>map=new HashMap<>();
        AgencyAddress agencyAddress = agencyAddressService.selectAgencyAddressById(id);
        session.setAttribute("agencyAddress",agencyAddress);
        return map;
    }
    @PostMapping("/quagencyaddress")
    @ResponseBody
    public Map<String,Object> quagencyaddress(HttpSession session){
        Map<String,Object>map=new HashMap<>();
        AgencyAddress agencyAddress = (AgencyAddress) session.getAttribute("agencyAddress");
        map.put("agencyAddress",agencyAddress);
        return map;
    }
    @PostMapping("/doagencyaddressupd")
    @ResponseBody
    public Map<String,Object> doagencyaddressupd(AgencyAddress agencyAddress){
        Map<String,Object>map=new HashMap<>();
        agencyAddress.setGmtModified(new Date());
        int i = agencyAddressService.updAgencyAddress(agencyAddress);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @PostMapping("/doagencyaddressdelall")
    @ResponseBody
    public Map<String,Object> doagencyaddressdelall(String ids){
        Map<String,Object>map=new HashMap<>();
        System.out.println(ids);
        String[] split = ids.split(",");
        Integer[] ids2=new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            ids2[i] = Integer.valueOf(split[i]);
        }
        int i = agencyAddressService.delAllAgencyAddress(ids2,new Date());
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
}
