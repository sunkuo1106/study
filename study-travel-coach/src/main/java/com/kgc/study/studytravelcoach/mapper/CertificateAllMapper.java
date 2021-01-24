package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.CertificateAll;
import com.kgc.study.bean.CertificateAllExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CertificateAllMapper {
    int countByExample(CertificateAllExample example);

    int deleteByExample(CertificateAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateAll record);

    int insertSelective(CertificateAll record);

    List<CertificateAll> selectByExample(CertificateAllExample example);

    CertificateAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateAll record, @Param("example") CertificateAllExample example);

    int updateByExample(@Param("record") CertificateAll record, @Param("example") CertificateAllExample example);

    int updateByPrimaryKeySelective(CertificateAll record);

    int updateByPrimaryKey(CertificateAll record);
}