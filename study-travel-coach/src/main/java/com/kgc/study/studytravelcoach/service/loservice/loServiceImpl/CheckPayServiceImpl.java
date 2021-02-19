package com.kgc.study.studytravelcoach.service.loservice.loServiceImpl;


import com.kgc.study.bean.*;
import com.kgc.study.service.looService.CheckPayService;
import com.kgc.study.studytravelcoach.mapper.AgencyAddressMapper;
import com.kgc.study.studytravelcoach.mapper.AgencyInfoMapper;
import com.kgc.study.studytravelcoach.mapper.EduUserOrderItemMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author wangyifan
 * @create 2021-02-04 14:19
 */
@Service
@Component
public class CheckPayServiceImpl implements CheckPayService {
    @Resource
    EduUserOrderItemMapper eduUserOrderItemMapper;
    @Resource
    AgencyAddressMapper agencyAddressMapper;
    @Resource
    AgencyInfoMapper agencyInfoMapper;

    @Override
    public List<EduUserOrderItem> selectAll(HttpSession session) {
  /*      AdministratorTable admin = (AdministratorTable) session.getAttribute("admin");
        Integer agencyId = admin.getAgencyId();*/
        Integer agencyId = 1;
        List<EduUserOrderItem> eduUserOrderItems = null;
        if (agencyId == 1) {
            eduUserOrderItems = eduUserOrderItemMapper.selectByExample(null);
            for (EduUserOrderItem eduUserOrderItem : eduUserOrderItems) {
                Integer eduOrderType = eduUserOrderItem.getEduOrderType();
                if (eduOrderType == 0) {
                    eduUserOrderItem.setEduOrderTypeName("未支付");
                } else if (eduOrderType == 1) {
                    eduUserOrderItem.setEduOrderTypeName("已支付");
                } else if (eduOrderType == 2) {
                    eduUserOrderItem.setEduOrderTypeName("已超时");
                }
            }
        } else {
            EduUserOrderItemExample eduUserOrderItemExample = new EduUserOrderItemExample();
            EduUserOrderItemExample.Criteria criteria = eduUserOrderItemExample.createCriteria();
            criteria.andAgencyIdEqualTo(String.valueOf(agencyId));
            eduUserOrderItems = eduUserOrderItemMapper.selectByExample(eduUserOrderItemExample);

            for (EduUserOrderItem eduUserOrderItem : eduUserOrderItems) {
                Integer eduOrderType = eduUserOrderItem.getEduOrderType();
                if (eduOrderType == 0) {
                    eduUserOrderItem.setEduOrderTypeName("未支付");
                } else if (eduOrderType == 1) {
                    eduUserOrderItem.setEduOrderTypeName("已支付");
                } else if (eduOrderType == 2) {
                    eduUserOrderItem.setEduOrderTypeName("已超时");
                }
            }
        }

        return eduUserOrderItems;
    }

    @Override
    public List<AgencyInfo> selectAllAgencyInfo(HttpSession session) {
    /*    AdministratorTable admin = (AdministratorTable) session.getAttribute("admin");
        Integer agencyId = admin.getAgencyId();*/
        Integer agencyId = 1;
        List<AgencyInfo> agencyInfos = null;
        if (agencyId == 1) {
            agencyInfos = agencyInfoMapper.selectByExample(null);
        } else {
            AgencyInfoExample agencyInfoExample = new AgencyInfoExample();
            AgencyInfoExample.Criteria criteria = agencyInfoExample.createCriteria();
            criteria.andIdEqualTo(Long.valueOf(agencyId));
            agencyInfos = agencyInfoMapper.selectByExample(agencyInfoExample);
        }

        return agencyInfos;

    }

    @Override
    public List<AgencyAddress> selectAllAgencyAddress(HttpSession session) {
         /*    AdministratorTable admin = (AdministratorTable) session.getAttribute("admin");
        Integer agencyId = admin.getAgencyId();*/
        Integer agencyId = 1;
        List<AgencyAddress> agencyAddresses = null;
        if (agencyId == 1) {
            agencyAddresses = agencyAddressMapper.selectByExample(null);
        } else {
            AgencyAddressExample agencyAddressExample = new AgencyAddressExample();
            AgencyAddressExample.Criteria criteria = agencyAddressExample.createCriteria();
            criteria.andAgencyIdEqualTo(Long.valueOf(agencyId));
            agencyAddresses = agencyAddressMapper.selectByExample(agencyAddressExample);
        }

        return agencyAddresses;
    }

    @Override
    public List<EduUserOrderItem> selectByCondition(Integer agencyAddressId, Integer agencyId, Integer eduOrderType) {

        EduUserOrderItemExample eduUserOrderItemExample = new EduUserOrderItemExample();
        EduUserOrderItemExample.Criteria criteria = eduUserOrderItemExample.createCriteria();
          /*      AdministratorTable admin = (AdministratorTable) session.getAttribute("admin");
        Integer agencyId = admin.getAgencyId();*/
        agencyId = 1;
        if (agencyAddressId != null) {
            criteria.andAgencyAddressIdEqualTo(agencyAddressId);
        }
        if (agencyId == 1) {

        } else if (agencyId != 1 || agencyId != null) {
            criteria.andAgencyIdEqualTo(String.valueOf(agencyId));
        }
        if (eduOrderType != null) {
            criteria.andEduOrderTypeEqualTo(eduOrderType);
        }
        List<EduUserOrderItem> eduUserOrderItems = eduUserOrderItemMapper.selectByExample(eduUserOrderItemExample);
        for (EduUserOrderItem eduUserOrderItem : eduUserOrderItems) {
            Integer eduOrderType1 = eduUserOrderItem.getEduOrderType();
            if (eduOrderType1 == 0) {
                eduUserOrderItem.setEduOrderTypeName("未支付");
            } else if (eduOrderType1 == 1) {
                eduUserOrderItem.setEduOrderTypeName("已支付");
            } else if (eduOrderType1 == 2) {
                eduUserOrderItem.setEduOrderTypeName("已超时");
            }
        }
        return eduUserOrderItems;
    }
}
