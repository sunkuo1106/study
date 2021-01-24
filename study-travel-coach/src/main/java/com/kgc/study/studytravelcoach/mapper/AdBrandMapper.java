package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdBrand;
import com.kgc.study.bean.AdBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdBrandMapper {
    int countByExample(AdBrandExample example);

    int deleteByExample(AdBrandExample example);

    int deleteByPrimaryKey(Long adBrandId);

    int insert(AdBrand record);

    int insertSelective(AdBrand record);

    List<AdBrand> selectByExample(AdBrandExample example);

    AdBrand selectByPrimaryKey(Long adBrandId);

    int updateByExampleSelective(@Param("record") AdBrand record, @Param("example") AdBrandExample example);

    int updateByExample(@Param("record") AdBrand record, @Param("example") AdBrandExample example);

    int updateByPrimaryKeySelective(AdBrand record);

    int updateByPrimaryKey(AdBrand record);
}