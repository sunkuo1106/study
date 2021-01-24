package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.EduUserOrderItem;
import com.kgc.study.bean.EduUserOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EduUserOrderItemMapper {
    int countByExample(EduUserOrderItemExample example);

    int deleteByExample(EduUserOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EduUserOrderItem record);

    int insertSelective(EduUserOrderItem record);

    List<EduUserOrderItem> selectByExample(EduUserOrderItemExample example);

    EduUserOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EduUserOrderItem record, @Param("example") EduUserOrderItemExample example);

    int updateByExample(@Param("record") EduUserOrderItem record, @Param("example") EduUserOrderItemExample example);

    int updateByPrimaryKeySelective(EduUserOrderItem record);

    int updateByPrimaryKey(EduUserOrderItem record);
}