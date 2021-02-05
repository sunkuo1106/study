package com.kgc.study.service.wangxinyuService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;

/**
 * @author shkstart
 * @create 2021-02-03 11:38
 */
public interface AgencyAddressService {
    //查询机构的所有上课地点信息方法
    PageInfo<AgencyAddress> selectAllAgency(Integer AgencyId, String agencyAddress, Integer pageNum, Integer pageSize);
}
