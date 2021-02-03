package com.kgc.study.studytravelcoach.service.wangxinyuServiceImpl;

import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyAddressExample;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.bean.AgencyInfoExample;
import com.kgc.study.service.wangxinyuService.AgencyService;
import com.kgc.study.studytravelcoach.mapper.AgencyAddressMapper;
import com.kgc.study.studytravelcoach.mapper.AgencyInfoMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 孙阔
 * @date 2021/2/2 14:38
 */
@Component
public class AgencyServiceImpl implements AgencyService {
    @Resource
    AgencyInfoMapper agencyInfoMapper;
    @Resource
    AgencyAddressMapper agencyAddressMapper;

    //根据机构Id,查询当前机构总部信息
    @Override
    public  List<AgencyInfo> selectAgency(Long AgencyId) {
        AgencyInfoExample agencyInfoExample=new AgencyInfoExample();
        AgencyInfoExample.Criteria criteria = agencyInfoExample.createCriteria();
        if(AgencyId==1){
            return agencyInfoMapper.selectByExample(agencyInfoExample);
        }else{
            criteria.andIdEqualTo(AgencyId);
            return agencyInfoMapper.selectByExample(agencyInfoExample);
        }

    }
    //查询当前机构分部信息
    @Override
    public List<AgencyAddress> selectAllAgency(Long AgencyId) {
        AgencyAddressExample agencyAddressExample=new AgencyAddressExample();
        AgencyAddressExample.Criteria criteria = agencyAddressExample.createCriteria();
        if(AgencyId==1){
            return agencyAddressMapper.selectByExample(agencyAddressExample);
        }else{
            criteria.andAgencyIdEqualTo(AgencyId);
            return agencyAddressMapper.selectByExample(agencyAddressExample);
        }
    }
}
