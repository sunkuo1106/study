package com.kgc.study.service.wangxinyuService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;

import java.util.Date;
import java.util.List;

/**
 * @author 孙阔
 * @date 2021/2/2 14:39
 */
public interface AgencyService {

    //查询代理机构信息方法;
    PageInfo<AgencyInfo> selectAgency(Integer AgencyId, String agencyName,Integer pageNum, Integer pageSize);
    int updAgency(AgencyInfo agencyInfo);
    int addAgency(AgencyInfo agencyInfo);
    int delAgency(AgencyInfo agencyInfo);
    AgencyInfo selectAgencyById(Integer id);
    int delAllAgency(Integer[] ids, Date modifieddate);

}
