package com.kgc.study.service;



import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.MyPageInfo;

import java.util.List;

public interface loService {
                                     //用户名                   手机号               身份证              性别                 是否可用                     是否是好学生             入学方式
    MyPageInfo<EduUser> selectEduUser(
            String eduUserName, String eduUserPhone, String eduUserIdCard, Integer eduUserGender, String eduUserIsAvalible, Integer eduUserIsGoodStudent, Integer eduUserEnrollmentMethod,
            Integer pageNum, Integer pageSize);

    int insertEduUserList(List<EduUser> eduUsers);
//    List<EduUser> selectById(String eduUserName,String eduUserPhone,String eduUserIdCard,Byte eduUserGender,String eduUserIsAvalible,Integer eduUserIsGoodStudent,Byte eduUserEnrollmentMethod);
}
