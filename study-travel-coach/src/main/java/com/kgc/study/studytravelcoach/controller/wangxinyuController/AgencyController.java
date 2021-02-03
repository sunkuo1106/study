package com.kgc.study.studytravelcoach.controller.wangxinyuController;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.service.wangxinyuService.AgencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 孙阔
 * @date 2021/2/2 14:32
 */

@Controller
public class AgencyController {
    @Resource
    AgencyService agencyService;
    /*
    *跳转机构管理页面
    * */
    @GetMapping("/agency")
    public String toAgency(Model model, HttpSession session){
        Integer agencyId = (Integer) session.getAttribute("AgencyId");
        System.out.println(agencyId);
        List<AgencyInfo> agencyInfos = agencyService.selectAgency(Long.valueOf(agencyId));
        model.addAttribute("agencyInfo",agencyInfos);
        List<AgencyAddress> agencyAddresses = agencyService.selectAllAgency(Long.valueOf(agencyId));
        model.addAttribute("agencyAddresses",agencyAddresses);
        return "agency";
    }
}
