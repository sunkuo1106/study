package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.EduUser;
import com.kgc.study.bean.EduUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduUserMapper {
    int countByExample(EduUserExample example);

    int deleteByExample(EduUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduUser record);

    int insertSelective(EduUser record);

    List<EduUser> selectByExample(EduUserExample example);

    EduUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduUser record, @Param("example") EduUserExample example);

    int updateByExample(@Param("record") EduUser record, @Param("example") EduUserExample example);

    int updateByPrimaryKeySelective(EduUser record);

    int updateByPrimaryKey(EduUser record);
}