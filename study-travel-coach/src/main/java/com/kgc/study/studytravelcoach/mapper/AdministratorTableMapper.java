package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.AdministratorTable;
import com.kgc.study.bean.AdministratorTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorTableMapper {
    int countByExample(AdministratorTableExample example);

    int deleteByExample(AdministratorTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdministratorTable record);

    int insertSelective(AdministratorTable record);

    List<AdministratorTable> selectByExample(AdministratorTableExample example);

    AdministratorTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdministratorTable record, @Param("example") AdministratorTableExample example);

    int updateByExample(@Param("record") AdministratorTable record, @Param("example") AdministratorTableExample example);

    int updateByPrimaryKeySelective(AdministratorTable record);

    int updateByPrimaryKey(AdministratorTable record);
}