package com.kgc.study.service.wangxinyuService;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.CertificateTable;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CertificateTableService {
    //证书分页查询，根据总成绩查询
    PageInfo<CertificateTable> selectCertificateTable(Long cerSumScore, Integer pageNum, Integer pageSize);
    //获取证书值
    CertificateTable getCertificateTable(Integer id);
    //修改证书值
    int updCertificateTable(CertificateTable certificateTable);

    //添加证书
    int add(CertificateTable certificateTable);

    //批量假删除
    int deleteAll(Integer[] ids, Date modifieddate);




}

