package com.kgc.study.studytravelcoach.mapper;

import com.kgc.study.bean.Remark;
import com.kgc.study.bean.RemarkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RemarkMapper {
    int countByExample(RemarkExample example);

    int deleteByExample(RemarkExample example);

    int deleteByPrimaryKey(Long remarkId);

    int insert(Remark record);

    int insertSelective(Remark record);

    List<Remark> selectByExample(RemarkExample example);

    Remark selectByPrimaryKey(Long remarkId);

    int updateByExampleSelective(@Param("record") Remark record, @Param("example") RemarkExample example);

    int updateByExample(@Param("record") Remark record, @Param("example") RemarkExample example);

    int updateByPrimaryKeySelective(Remark record);

    int updateByPrimaryKey(Remark record);
}