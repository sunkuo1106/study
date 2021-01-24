package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.CertificateManage;
import com.kgc.study.bean.CertificateManageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CertificateManageMapper {
    int countByExample(CertificateManageExample example);

    int deleteByExample(CertificateManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateManage record);

    int insertSelective(CertificateManage record);

    List<CertificateManage> selectByExample(CertificateManageExample example);

    CertificateManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateManage record, @Param("example") CertificateManageExample example);

    int updateByExample(@Param("record") CertificateManage record, @Param("example") CertificateManageExample example);

    int updateByPrimaryKeySelective(CertificateManage record);

    int updateByPrimaryKey(CertificateManage record);
}