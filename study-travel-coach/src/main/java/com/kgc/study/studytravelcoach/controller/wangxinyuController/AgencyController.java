package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.service.wangxinyuService.AgencyAddressService;
import com.kgc.study.service.wangxinyuService.AgencyService;
import org.apache.http.protocol.HTTP;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

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
    @GetMapping("/toagency")
    public String toAgency(){
        return "agency";
    }
    @PostMapping("/doagency")
    @ResponseBody
    public Map<String,Object> toAgency(Model model, HttpSession session,String agencyName,@RequestParam(value = "pageNum",required = false) Integer pageNum,
                           @RequestParam(value = "pageSize",required = false) Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        //获取登录的管理员对应的机构Id
        Integer agencyId = (Integer) session.getAttribute("AgencyId");
        PageInfo<AgencyInfo> agencyInfos = agencyService.selectAgency(agencyId,agencyName,pageNum,pageSize);
        map.put("agencyInfo",agencyInfos);
        return map;
    }
    @GetMapping("/toagencyaddress")
    public String toagencyaddress(){
        return "agencyaddress";
    }
    @RequestMapping("/agencyId")
    @ResponseBody
    public Map<String,Object> agencyId(Integer id, String agencyName, HttpSession session){
        Map<String,Object> map=new HashMap<>();
        //查看机构的上课点时获取的当前机构的Id和名字
        session.setAttribute("agencyAddressId",id);
        session.setAttribute("agencyName",agencyName);
        return map;
    }
    @PostMapping("/doagencyaddress")
    @ResponseBody
    public Map<String,Object> toagencyaddress(Model model, HttpSession session,String agencyAddress,@RequestParam(value = "pageNum",required = false) Integer pageNum,
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
    @GetMapping("/toagencyadd")
    public String toagencyadd(){
        return "agency-add";
    }
    @PostMapping("/doagencyadd")
    @ResponseBody
    public Map<String,Object> doagencyadd(AgencyInfo agencyInfo){
        Map<String,Object> map=new HashMap<>();
        agencyInfo.setGmtCreate(new Date());
        agencyInfo.setGmtModified(new Date());
        agencyInfo.setLogicDelete(0);
        int i = agencyService.addAgency(agencyInfo);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @PostMapping("/doagencydel")
    @ResponseBody
    public Map<String,Object> doagencydel(AgencyInfo agencyInfo){
        Map<String,Object> map=new HashMap<>();
        agencyInfo.setGmtModified(new Date());
        agencyInfo.setLogicDelete(1);
        int i = agencyService.delAgency(agencyInfo);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }

    @GetMapping("/toagencyupd")
    public String toagencyupd(HttpSession session){
        return "agency-upd";
    }
    @PostMapping("/cunagency")
    @ResponseBody
    public Map<String,Object> cunagency(Integer id,HttpSession session){
        Map<String,Object>map=new HashMap<>();
        AgencyInfo agencyInfo = agencyService.selectAgencyById(id);
        session.setAttribute("agencyInfo",agencyInfo);
        return map;
    }
    @PostMapping("/quagency")
    @ResponseBody
    public Map<String,Object> quagency(HttpSession session){
        Map<String,Object>map=new HashMap<>();
        AgencyInfo agencyInfo = (AgencyInfo) session.getAttribute("agencyInfo");
        map.put("agencyInfo",agencyInfo);
        return map;
    }
    @PostMapping("/doagencyupd")
    @ResponseBody
    public Map<String,Object> doagencyupd(AgencyInfo agencyInfo){
        Map<String,Object>map=new HashMap<>();
        agencyInfo.setGmtModified(new Date());
        int i = agencyService.updAgency(agencyInfo);
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }
    @PostMapping("/doagencydelall")
    @ResponseBody
    public Map<String,Object> doagencydelall(String ids){
        Map<String,Object>map=new HashMap<>();

        String[] split = ids.split(",");
        Integer[] ids2=new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            ids2[i] = Integer.valueOf(split[i]);
        }
         int i = agencyService.delAllAgency(ids2,new Date());
        if(i>0){
            map.put("status","true");
        }else{
            map.put("status","false");
        }
        return map;
    }

}
