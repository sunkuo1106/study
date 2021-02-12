package com.kgc.study.studytravelcoach.service.zhangjiaheServiceImpl;

import com.kgc.study.bean.ChapterTable;
import com.kgc.study.bean.ChapterTableExample;
import com.kgc.study.service.zhangjiaheService.ChapterTableService;
import com.kgc.study.studytravelcoach.mapper.ChapterTableMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Service
public class ChapterTableServiceImpl implements ChapterTableService {
    @Resource
    ChapterTableMapper chapterTableMapper;

    @Override
    public List<ChapterTable> selectChapterTable(String chapterName,Long courseId) {
        ChapterTableExample example=new ChapterTableExample();
        ChapterTableExample.Criteria criteria = example.createCriteria();
        criteria.andLogicDeleteEqualTo(0);
        criteria.andCourseIdEqualTo(courseId);
        if (chapterName!=null&&chapterName.isEmpty()==false){
            criteria.andChapterNameLike("%"+chapterName+"%");
        }
        return chapterTableMapper.selectByExample(example);
    }

    @Override
    public int ChapterTableInsert(ChapterTable record) {
        record.setGmtCreate(new Date());
        record.setGmtModified(new Date());
        record.setLogicDelete(0);
        return chapterTableMapper.insertSelective(record);
    }

    @Override
    public int ChapterTableupdatedeleteID(Long chapterTableId) {
        ChapterTable chapterTable=new ChapterTable();
        chapterTable.setChapterTableId(chapterTableId);
        chapterTable.setLogicDelete(1);

        return chapterTableMapper.updateByPrimaryKeySelective(chapterTable);
    }

    @Override
    public int Chapterupdatedeletelist(String str) {
        ArrayList list=new ArrayList();
        String []idd=str.split(",");
        for(int i=0;i<idd.length;i++) {
            int num=Integer.parseInt(idd[i]);
            list.add(num);
        }
        return chapterTableMapper.Chapterupdatedeletelist(list);
    }

    @Override
    public ChapterTable chapterupdatecha(Long chapterTableId) {
        return chapterTableMapper.selectByPrimaryKey(chapterTableId);
    }

    @Override
    public int ChapterTableupdate(ChapterTable chapterTable) {
        chapterTable.setGmtModified(new Date());
        return chapterTableMapper.updateByPrimaryKeySelective(chapterTable);
    }
}
