package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.CertificateTable;
import com.kgc.study.bean.CertificateTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CertificateTableMapper {
    int countByExample(CertificateTableExample example);

    int deleteByExample(CertificateTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertificateTable record);

    int insertSelective(CertificateTable record);

    List<CertificateTable> selectByExample(CertificateTableExample example);

    CertificateTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertificateTable record, @Param("example") CertificateTableExample example);

    int updateByExample(@Param("record") CertificateTable record, @Param("example") CertificateTableExample example);

    int updateByPrimaryKeySelective(CertificateTable record);

    int updateByPrimaryKey(CertificateTable record);
    int deleteAll(@Param("ids") Integer[] ids, @Param("modifieddate") Date modifieddate);

}