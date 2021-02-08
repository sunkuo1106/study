package com.kgc.study.service.wangxinyuService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;

import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-03 11:38
 */
public interface AgencyAddressService {
    //查询机构的所有上课地点信息方法
    PageInfo<AgencyAddress> selectAllAgency(Integer AgencyId, String agencyAddress, Integer pageNum, Integer pageSize);
    int updAgencyAddress(AgencyAddress agencyAddress);
    int addAgencyAddress(AgencyAddress agencyAddress);
    int delAgencyAddress(AgencyAddress agencyAddress);
    AgencyAddress selectAgencyAddressById(Integer id);
    int delAllAgencyAddress(Integer[] ids, Date modifieddate);
}
