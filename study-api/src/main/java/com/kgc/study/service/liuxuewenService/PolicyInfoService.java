package com.kgc.study.service.liuxuewenService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.PolicyInfo;

import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-06 11:16
 */
public interface PolicyInfoService {

    //分页查询政策
    PageInfo<PolicyInfo> selectPolicyInfo(String policyInfoKeyWord, int pageNum, int pageSize);

    //添加
    int insertPolicyInfo(PolicyInfo policyInfo);

    //根据id查询政策
    PolicyInfo selectPolicyInfoById(Long id);

    //修改政策
    int updatePolicyInfo(PolicyInfo policyInfo);

    //删除政策
    int deletePolicyInfo(List<Integer> list);

    //删除政策
    void deletePoolicyInfoById(Long id);

}
