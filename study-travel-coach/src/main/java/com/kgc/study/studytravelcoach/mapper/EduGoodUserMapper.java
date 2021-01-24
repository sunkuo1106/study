package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.EduGoodUser;
import com.kgc.study.bean.EduGoodUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduGoodUserMapper {
    int countByExample(EduGoodUserExample example);

    int deleteByExample(EduGoodUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduGoodUser record);

    int insertSelective(EduGoodUser record);

    List<EduGoodUser> selectByExample(EduGoodUserExample example);

    EduGoodUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduGoodUser record, @Param("example") EduGoodUserExample example);

    int updateByExample(@Param("record") EduGoodUser record, @Param("example") EduGoodUserExample example);

    int updateByPrimaryKeySelective(EduGoodUser record);

    int updateByPrimaryKey(EduGoodUser record);
}