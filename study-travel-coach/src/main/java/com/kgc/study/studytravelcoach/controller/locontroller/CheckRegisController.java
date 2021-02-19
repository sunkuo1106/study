package com.kgc.study.studytravelcoach.controller.locontroller;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.bean.EduUserOrderItem;
import com.kgc.study.service.looService.CheckPayService;
import com.kgc.study.studytravelcoach.mapper.EduUserOrderItemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author wangyifan
 * @create 2021-02-03 16:25
 */
@Controller
public class CheckRegisController {
    @Resource
    CheckPayService checkPayService;
    @Resource
    EduUserOrderItemMapper eduUserOrderItemMapper;



    @RequestMapping("CheckIfPay")//查询报名学生缴费清空（先查询全部）
    public String toCheckIfPay(Model model, HttpSession session) {
        List<EduUserOrderItem> eduUserOrderItems = null;
        List<AgencyAddress> agencyAddresses = null;
        //获取登录人员的权限id
    /*    AdministratorTable admin = (AdministratorTable) session.getAttribute("admin");
        Integer agencyId = admin.getAgencyId();*/
        Integer agencyId = 1;
        List<AgencyInfo> agencyInfos = null;
        if (agencyId == 1) {
            eduUserOrderItems = checkPayService.selectAll(session);
            model.addAttribute("eduUserOrderItems", eduUserOrderItems);
            //将上课地点查询出来
            agencyAddresses = checkPayService.selectAllAgencyAddress(session);
            model.addAttribute("agencyAddresses", agencyAddresses);
            //机构名称
            agencyInfos = checkPayService.selectAllAgencyInfo(session);
            model.addAttribute("agencyInfos", agencyInfos);
        } else {
            //不是超级管理员
            eduUserOrderItems = checkPayService.selectAll(session);
            model.addAttribute("eduUserOrderItems", eduUserOrderItems);
            agencyInfos = checkPayService.selectAllAgencyInfo(session);//根据机构名称id获取机构名称
            model.addAttribute("agencyInfos", agencyInfos);
            //获取机构地址
            agencyAddresses = checkPayService.selectAllAgencyAddress(session);
            model.addAttribute("agencyAddresses", agencyAddresses);
        }

        return "check-paystatus";
    }

    @RequestMapping("CheckIfPayCondition")//根据机构id和上课地点id，支付状态查询
    public String toCheckIfPayCondition(Model model, Integer agencyAddressId, Integer agencyId, Integer eduOrderType, HttpSession session) {
        List<EduUserOrderItem> eduUserOrderItems = checkPayService.selectByCondition(agencyAddressId, agencyId, eduOrderType);
        model.addAttribute("eduUserOrderItems", eduUserOrderItems);
        List<AgencyAddress> agencyAddresses = checkPayService.selectAllAgencyAddress(session);
        model.addAttribute("agencyAddresses", agencyAddresses);
        //机构名称
        List<AgencyInfo> agencyInfos = checkPayService.selectAllAgencyInfo(session);
        model.addAttribute("agencyInfos", agencyInfos);
        model.addAttribute("agencyAddressId", agencyAddressId);
        model.addAttribute("agencyId", agencyId);
        model.addAttribute("eduOrderType", eduOrderType);
        return "check-paystatus";
    }
}
