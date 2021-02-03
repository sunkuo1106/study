package com.kgc.study.service.wangxinyuService;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyInfo;

import java.util.List;

/**
 * @author 孙阔
 * @date 2021/2/2 14:39
 */
public interface AgencyService {

    //查询代理机构信息方法;
    List<AgencyInfo> selectAgency(Long AgencyId);
    //查询机构的所有上课地点信息方法
    List<AgencyAddress> selectAllAgency(Long AgencyId);
}
