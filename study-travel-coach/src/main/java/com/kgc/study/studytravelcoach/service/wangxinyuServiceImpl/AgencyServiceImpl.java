package com.kgc.study.studytravelcoach.service.wangxinyuServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyInfo;
import com.kgc.study.bean.AgencyInfoExample;
import com.kgc.study.service.wangxinyuService.AgencyService;
import com.kgc.study.studytravelcoach.mapper.AgencyInfoMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 孙阔
 * @date 2021/2/2 14:38
 */
@Component
public class AgencyServiceImpl implements AgencyService {
    @Resource
    AgencyInfoMapper agencyInfoMapper;


    //根据机构Id,查询当前机构总部信息
    @Override
    public PageInfo<AgencyInfo> selectAgency(Long AgencyId, String agencyAddress, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        AgencyInfoExample agencyInfoExample=new AgencyInfoExample();
        AgencyInfoExample.Criteria criteria = agencyInfoExample.createCriteria();
        if(agencyAddress!=null&&agencyAddress.isEmpty()==false){
            criteria.andAgencyAddressLike(agencyAddress);
        }
        if(AgencyId!=1){
            criteria.andIdEqualTo(AgencyId);
        }
            List<AgencyInfo> agencyInfos = agencyInfoMapper.selectByExample(agencyInfoExample);
            PageInfo<AgencyInfo> agencyInfoPageInfo=new PageInfo<>(agencyInfos);
            return agencyInfoPageInfo;


    }

}
