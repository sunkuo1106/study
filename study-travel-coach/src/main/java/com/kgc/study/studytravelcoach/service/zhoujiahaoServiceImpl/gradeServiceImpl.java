package com.kgc.study.studytravelcoach.service.zhoujiahaoServiceImpl;

import com.kgc.study.bean.*;
import com.kgc.study.service.zhoujiahaoService.gradeService;
import com.kgc.study.studytravelcoach.mapper.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class gradeServiceImpl implements gradeService {

    @Resource
    GradeInfoMapper gradeInfoMapper;
    @Resource
    GradeTypeMapper gradeTypeMapper;
    @Resource
    AgencyAddressMapper agencyAddressMapper;
    @Resource
    AdministratorTableMapper administratorTableMapper;
    @Resource
    ClasstoinformInfoMapper classtoinformInfoMapper;

    @Override
    public List<GradeInfo> selectAll(String gradeName,Integer typeId,Integer adminId) {
        GradeInfoExample example=new GradeInfoExample();
        GradeInfoExample.Criteria criteria = example.createCriteria();
        if(gradeName!=null && gradeName!=""){
            criteria.andGradeNameLike("%"+gradeName+"%");
        }
        if(typeId!=null && typeId!=0){
            criteria.andGradeTypeIdEqualTo(typeId);
        }
        criteria.andGradeGmtFounderIdEqualTo(adminId);
        //逻辑删除 0--未删  1--删除
        criteria.andLogicDeleteEqualTo(0);
        List<GradeInfo> gradeInfos = gradeInfoMapper.selectByExample(example);
        for (GradeInfo gradeInfo : gradeInfos) {
            //查询班级类型
            Integer gradeTypeId = gradeInfo.getGradeTypeId();
            GradeType gradeType = gradeTypeMapper.selectByPrimaryKey((long) gradeTypeId);
            gradeInfo.setGradeType(gradeType);
            //查询班级所在地
            Integer agencyAddressId = gradeInfo.getAgencyAddressId();
            AgencyAddress agencyAddress = agencyAddressMapper.selectByPrimaryKey((long) agencyAddressId);
            gradeInfo.setAgencyAddress(agencyAddress);
            //查询该班级的创建人
            Integer gradeGmtFounderId = gradeInfo.getGradeGmtFounderId();
            AdministratorTable administratorTable = administratorTableMapper.selectByPrimaryKey(gradeGmtFounderId);
            gradeInfo.setAdministrator(administratorTable);
        }
        return gradeInfos;
    }

    @Override
    public List<GradeType> selectGradeType() {
        GradeTypeExample example=new GradeTypeExample();
        example.createCriteria().andLogicDeleteEqualTo(0);
        return gradeTypeMapper.selectByExample(example);
    }

    @Override
    public List<AgencyAddress> selectAddress() {
        AgencyAddressExample example=new AgencyAddressExample();
        example.createCriteria().andLogicDeleteEqualTo(0);
        return agencyAddressMapper.selectByExample(example);
    }

    @Override
    public void insert(GradeInfo gradeInfo) {
        int insert = gradeInfoMapper.insertSelective(gradeInfo);
        if(insert>0){
            //获取刚刚添加的班级信息
            GradeInfo gradeDesc = gradeInfoMapper.GradeDesc();
            System.out.println(gradeDesc.toString());
            //默认生成班级通知
            ClasstoinformInfo classtoinformInfo=new ClasstoinformInfo();
            classtoinformInfo.setGmtCreate(new Date());
            classtoinformInfo.setGmtModified(new Date());
            classtoinformInfo.setAgencyAddressId(gradeDesc.getAgencyAddressId());
            classtoinformInfo.setCtfGradeId(gradeDesc.getId().toString());
            classtoinformInfo.setCtfGmtFounderId(gradeDesc.getGradeGmtFounderId());
            classtoinformInfo.setLogicDelete(0);
            int i = classtoinformInfoMapper.insertSelective(classtoinformInfo);
            if(i>0){
                System.out.println("开班通知添加成功");
            }
        }
    }

    @Override
    public int update(GradeInfo gradeInfo) {
        gradeInfo.setGmtModified(new Date());
        int i = gradeInfoMapper.updateByPrimaryKeySelective(gradeInfo);
        return i;
    }

    @Override
    public GradeInfo selectGrade(Integer gradeId) {
        return gradeInfoMapper.selectByPrimaryKey((long) gradeId);
    }

    @Override
    public int updateList(String id) {
        ArrayList list=new ArrayList();
        String[] split = id.split(",");
        for (int i = 0; i < split.length; i++) {
            int gradeid = Integer.parseInt(split[i]);
            list.add(gradeid);
        }
        return gradeInfoMapper.updateList(list);
    }

    @Override
    public ClasstoinformInfo selectClasstoinformInfo(Integer gradeId,Integer adminId) {
        ClasstoinformInfoExample example=new ClasstoinformInfoExample();
        ClasstoinformInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCtfGradeIdEqualTo(gradeId.toString());
        criteria.andCtfGmtFounderIdEqualTo(adminId);
        List<ClasstoinformInfo> classtoinformInfos = classtoinformInfoMapper.selectByExample(example);
        if(classtoinformInfos!=null){
            return classtoinformInfos.get(0);
        }else {
            return null;
        }
    }

    @Override
    public GradeInfo selectGradeXinXi(Integer gradeId, Integer adminId) {
        GradeInfoExample example=new GradeInfoExample();
        GradeInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo((long)gradeId);
        criteria.andGradeGmtFounderIdEqualTo(adminId);
        criteria.andLogicDeleteEqualTo(0);
        List<GradeInfo> gradeInfos = gradeInfoMapper.selectByExample(example);
        for (GradeInfo gradeInfo : gradeInfos) {
            Integer agencyAddressId = gradeInfo.getAgencyAddressId();
            AgencyAddress agencyAddress = agencyAddressMapper.selectByPrimaryKey((long) agencyAddressId);
            gradeInfo.setAgencyAddress(agencyAddress);
        }
        return gradeInfos.get(0);
    }

    @Override
    public int update(ClasstoinformInfo classtoinformInfo) {
        classtoinformInfo.setGmtModified(new Date());
        return classtoinformInfoMapper.updateByPrimaryKeySelective(classtoinformInfo);
    }
}
