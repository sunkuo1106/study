package com.kgc.study.studytravelcoach.service.wangxinyuServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import java.util.Date;
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
    public PageInfo<AgencyInfo> selectAgency(Integer AgencyId, String agencyName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        AgencyInfoExample agencyInfoExample=new AgencyInfoExample();
        AgencyInfoExample.Criteria criteria = agencyInfoExample.createCriteria();
        if(agencyName!=null&&agencyName.isEmpty()==false){
            criteria.andAgencyNameLike("%"+agencyName+"%");
        }
        if(AgencyId!=1){
            criteria.andIdEqualTo(Long.valueOf(AgencyId));
        }
        criteria.andLogicDeleteEqualTo(0);
        List<AgencyInfo> agencyInfos = agencyInfoMapper.selectByExample(agencyInfoExample);
        PageInfo<AgencyInfo> agencyInfoPageInfo=new PageInfo<>(agencyInfos);
        return agencyInfoPageInfo;


    }

    @Override
    public int updAgency(AgencyInfo agencyInfo) {
        int i = agencyInfoMapper.updateByPrimaryKeySelective(agencyInfo);
        return i;
    }

    @Override
    public int addAgency(AgencyInfo agencyInfo) {
        int i = agencyInfoMapper.insertSelective(agencyInfo);
        return i;
    }

    @Override
    public int delAgency(AgencyInfo agencyInfo) {
        int i = agencyInfoMapper.updateByPrimaryKeySelective(agencyInfo);
        return i;
    }

    @Override
    public AgencyInfo selectAgencyById(Integer id) {
        return agencyInfoMapper.selectByPrimaryKey(Long.valueOf(id));
    }

    @Override
    public int delAllAgency(Integer[] ids,Date modifieddate) {
        int i = agencyInfoMapper.deleteAll(ids,modifieddate);
        return i;
    }

}
