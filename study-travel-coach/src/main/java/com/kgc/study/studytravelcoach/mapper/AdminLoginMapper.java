package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdminLogin;
import com.kgc.study.bean.AdminLoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminLoginMapper {
    int countByExample(AdminLoginExample example);

    int deleteByExample(AdminLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminLogin record);

    int insertSelective(AdminLogin record);

    List<AdminLogin> selectByExample(AdminLoginExample example);

    AdminLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByExample(@Param("record") AdminLogin record, @Param("example") AdminLoginExample example);

    int updateByPrimaryKeySelective(AdminLogin record);

    int updateByPrimaryKey(AdminLogin record);
}