package com.kgc.study.service.wangxinyuService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyInfo;

/**
 * @author 孙阔
 * @date 2021/2/2 14:39
 */
public interface AgencyService {

    //查询代理机构信息方法;
    PageInfo<AgencyInfo> selectAgency(Long AgencyId, String agencyAddress, Integer pageNum, Integer pageSize);

}
