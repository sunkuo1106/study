package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AddressInfo;
import com.kgc.study.bean.AddressInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressInfoMapper {
    int countByExample(AddressInfoExample example);

    int deleteByExample(AddressInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    List<AddressInfo> selectByExample(AddressInfoExample example);

    AddressInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByExample(@Param("record") AddressInfo record, @Param("example") AddressInfoExample example);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);
}