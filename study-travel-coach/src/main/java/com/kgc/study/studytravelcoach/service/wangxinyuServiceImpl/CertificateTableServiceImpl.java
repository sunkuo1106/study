package com.kgc.study.studytravelcoach.service.wangxinyuServiceImpl;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.CertificateTable;
import com.kgc.study.bean.CertificateTableExample;

import com.kgc.study.service.wangxinyuService.CertificateTableService;
import com.kgc.study.studytravelcoach.mapper.CertificateTableMapper;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class CertificateTableServiceImpl implements CertificateTableService {
@Resource
    CertificateTableMapper certificateTableMapper;
//证书查询
    @Override
    public PageInfo<CertificateTable> selectCertificateTable(Long cerSumScore, Integer pageNum, Integer pageSize) {
        //分页
        PageHelper.startPage(pageNum,pageSize);
        PageHelper.orderBy("id desc");
        CertificateTableExample example=new CertificateTableExample();
        CertificateTableExample.Criteria criteria = example.createCriteria();
        List<CertificateTable> certificateTables=null;
        criteria.andLogicDeleteEqualTo(0);
        if(cerSumScore!=null&&cerSumScore!=0){
            //通过总成绩查询
            criteria.andCerSumScoreEqualTo(cerSumScore);
        }
        certificateTables=certificateTableMapper.selectByExample(example);
        //pageHelper插件分页
        PageInfo<CertificateTable> pageInfo=new PageInfo<>(certificateTables);
        return pageInfo;
    }

    @Override
    public CertificateTable getCertificateTable(Integer id) {
        return certificateTableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updCertificateTable(CertificateTable certificateTable) {
        return certificateTableMapper.updateByPrimaryKeySelective(certificateTable);

    }

    @Override
    public int add(CertificateTable certificateTable) {
        return certificateTableMapper.insertSelective(certificateTable);
    }

    @Override
    public int deleteAll(Integer[] ids, Date modifieddate) {
        int i = certificateTableMapper.deleteAll(ids, modifieddate);
        return i;
    }

}

