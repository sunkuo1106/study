package com.kgc.study.studytravelcoach.service.wangxinyuServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.AgencyAddress;
import com.kgc.study.bean.AgencyAddressExample;
import com.kgc.study.service.wangxinyuService.AgencyAddressService;
import com.kgc.study.studytravelcoach.mapper.AgencyAddressMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-03 11:39
 */
@Component
public class AgencyAddressServiceImpl implements AgencyAddressService {
    @Resource
    AgencyAddressMapper agencyAddressMapper;
    //查询当前机构分部信息
    @Override
    public PageInfo<AgencyAddress> selectAllAgency(Integer AgencyId, String agencyAddress, Integer pageNum, Integer pageSize) {
        if(AgencyId!=null) {
            PageHelper.startPage(pageNum, pageSize);
            AgencyAddressExample agencyAddressExample = new AgencyAddressExample();
            AgencyAddressExample.Criteria criteria = agencyAddressExample.createCriteria();
            if (agencyAddress != null && agencyAddress.isEmpty() == false) {
                criteria.andAgencyAddressNameLike("%"+agencyAddress+"%");
            }

            criteria.andAgencyIdEqualTo(Long.valueOf(AgencyId));
            List<AgencyAddress> agencyAddresses = agencyAddressMapper.selectByExample(agencyAddressExample);
            PageInfo<AgencyAddress> agencyAddressPageInfo = new PageInfo<>(agencyAddresses);
            return agencyAddressPageInfo;
        }
        return null;
    }
}
