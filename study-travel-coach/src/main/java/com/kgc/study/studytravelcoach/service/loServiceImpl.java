package com.kgc.study.studytravelcoach.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.EduUserExample;
import com.kgc.study.bean.MyPageInfo;
import com.kgc.study.service.loService;
import com.kgc.study.studytravelcoach.mapper.EduUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class loServiceImpl implements loService {
@Resource
    EduUserMapper eduUserMapper;


    @Override
    public MyPageInfo<EduUser> selectEduUser(
            String eduUserName, String eduUserPhone, String eduUserIdCard, Integer eduUserGender, String eduUserIsAvalible, Integer eduUserIsGoodStudent, Integer eduUserEnrollmentMethod,
            Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        EduUserExample eduUserExample=new EduUserExample();
        EduUserExample.Criteria criteria = eduUserExample.createCriteria();
        System.out.println("性别"+eduUserGender);
        if(!eduUserName.equals("-1")){
            System.out.println("进入了if1");
            criteria.andEduUserNameLike("%"+eduUserName+"%");
        }
       /* if(eduUserPhone!=null){
            System.out.println("进入了if2");
            criteria.andEduUserPhoneLike("%"+eduUserPhone+"%");
        }
        if(eduUserIdCard!=null){
            System.out.println("进入了if3");
            criteria.andEduUserIdCardLike("%"+eduUserIdCard+"%");
        }*/
        if(eduUserGender!=2){
            System.out.println("进入了if4");
            criteria.andEduUserGenderEqualTo(eduUserGender);
        }
        System.out.println(eduUserIsAvalible);
        if(!eduUserIsAvalible.equals("3")){
            System.out.println("进入了if5");
            criteria.andEduUserIsAvalibleEqualTo(eduUserIsAvalible);
        }
        if(eduUserIsGoodStudent!=2){
            System.out.println("进入了if6");
            criteria.andEduUserIsGoodStudentEqualTo(eduUserIsGoodStudent);
        }
        if(eduUserEnrollmentMethod!=2){
            System.out.println("进入了if7");
            criteria.andEduUserEnrollmentMethodEqualTo(eduUserEnrollmentMethod);
        }
        List<EduUser> eduUsers = eduUserMapper.selectByExample(eduUserExample);

        PageInfo<EduUser>pageInfo=new PageInfo<>(eduUsers);
        MyPageInfo<EduUser>myPageInfo=new MyPageInfo<>();
        //从pageinfo中复制属性到MypageInfo中
        BeanUtils.copyProperties(pageInfo,myPageInfo);
        return myPageInfo;
    }

    @Override
    public int insertEduUserList(List<EduUser> eduUsers) {
        int i = eduUserMapper.insertSelectiveList(eduUsers);
        return i;
    }


//    @Override
//    public List<EduUser> selectById(String eduUserName, String eduUserPhone, String eduUserIdCard, Byte eduUserGender, String eduUserIsAvalible, Integer eduUserIsGoodStudent, Byte eduUserEnrollmentMethod) {
//        EduUserExample eduUserExample=new EduUserExample();
//        EduUserExample.Criteria criteria = eduUserExample.createCriteria();
//        if(eduUserName!=null){
//            criteria.andEduUserNameLike("%"+eduUserName+"%");
//        }
//        if(eduUserPhone!=null){
//            criteria.andEduUserPhoneLike("%"+eduUserPhone+"%");
//        }
//        if(eduUserIdCard!=null){
//            criteria.andEduUserIdCardLike("%"+eduUserIdCard+"%");
//        }
//        if(eduUserGender!=null){
//            criteria.andEduUserGenderEqualTo(eduUserGender);
//        }
//        if(eduUserIsAvalible!=null){
//            criteria.andEduUserIsAvalibleEqualTo(eduUserIsAvalible);
//        }
//        if(eduUserIsGoodStudent!=null){
//            criteria.andEduUserIsGoodStudentEqualTo(eduUserIsGoodStudent);
//        }
//        if(eduUserEnrollmentMethod!=null){
//            criteria.andEduUserEnrollmentMethodEqualTo(eduUserEnrollmentMethod);
//        }
//        List<EduUser> eduUsers = eduUserMapper.selectByExample(null);
//
//        return eduUsers;
//    }
}
