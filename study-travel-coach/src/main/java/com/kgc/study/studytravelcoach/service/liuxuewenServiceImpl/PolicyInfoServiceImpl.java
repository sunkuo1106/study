package com.kgc.study.studytravelcoach.service.liuxuewenServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.PolicyInfo;
import com.kgc.study.bean.PolicyInfoExample;
import com.kgc.study.service.liuxuewenService.PolicyInfoService;
import com.kgc.study.studytravelcoach.mapper.PolicyInfoMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-06 11:39
 */
@Component
public class PolicyInfoServiceImpl implements PolicyInfoService {
    @Resource
    PolicyInfoMapper policyInfoMapper;

    @Override
    public PageInfo<PolicyInfo> selectPolicyInfo(String policyInfoKeyWord, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PolicyInfoExample policyInfoExample = new PolicyInfoExample();
        PolicyInfoExample.Criteria criteria = policyInfoExample.createCriteria();
        if (policyInfoKeyWord != null && policyInfoKeyWord != "") {
            criteria.andPolicyInfoKeyWordLike("%" + policyInfoKeyWord + "%");
        }
        criteria.andLogicDeleteNotEqualTo(1);
        List<PolicyInfo> policyInfos = policyInfoMapper.selectByExample(policyInfoExample);
        PageInfo<PolicyInfo> policyInfoPageInfo = new PageInfo<>(policyInfos);
        return policyInfoPageInfo;
    }

    @Override
    public int insertPolicyInfo(PolicyInfo policyInfo) {
        return policyInfoMapper.insertSelective(policyInfo);
    }

    @Override
    public PolicyInfo selectPolicyInfoById(Long id) {
        PolicyInfo policyInfo = policyInfoMapper.selectByPrimaryKey(id);
        return policyInfo;
    }

    @Override
    public int updatePolicyInfo(PolicyInfo policyInfo) {
        return policyInfoMapper.updateByPrimaryKeySelective(policyInfo);
    }

    @Override
    public int deletePolicyInfo(List<Integer> list) {
        int i = 0;
        for (Integer integer : list) {
            PolicyInfo policyInfo = new PolicyInfo();
            policyInfo.setId((long) integer);
            policyInfo.setLogicDelete(1);
            i = policyInfoMapper.updateByPrimaryKeySelective(policyInfo);
        }
        System.out.println(i);
        return i;
    }

    @Override
    public void deletePoolicyInfoById(Long id) {
        PolicyInfo policyInfo = new PolicyInfo();
        policyInfo.setId(id);
        policyInfo.setLogicDelete(1);
        policyInfoMapper.updateByPrimaryKeySelective(policyInfo);
    }
}
