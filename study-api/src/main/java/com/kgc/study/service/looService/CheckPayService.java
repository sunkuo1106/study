package com.kgc.study.service.looService;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.bean.EduUserOrderItem;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author wangyifan
 * @create 2021-02-04 13:38
 */
public interface CheckPayService {

    //根据学生身份证查询学生是否支付完成
    List<EduUserOrderItem> selectAll(HttpSession session);

    //查询所有机构名称
    List<AgencyInfo> selectAllAgencyInfo(HttpSession session);
    //查询所有机构地址
    List<AgencyAddress> selectAllAgencyAddress(HttpSession session);

    List<EduUserOrderItem> selectByCondition(Integer agencyAddressId, Integer agencyId, Integer eduOrderType);

}
