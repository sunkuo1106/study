package com.kgc.study.studytravelcoach.service.loservice.loServiceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.EduGoodUser;
import com.kgc.study.bean.EduGoodUserExample;
import com.kgc.study.bean.EduUser;
import com.kgc.study.service.looService.GoodUserSerivce;
import com.kgc.study.studytravelcoach.mapper.EduGoodUserMapper;
import com.kgc.study.studytravelcoach.mapper.EduUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-02 15:03
 */
@Service
public class GoodUserServiceImpl implements GoodUserSerivce {

    @Resource
    EduGoodUserMapper eduGoodUserMapper;
    @Resource
    EduUserMapper eduUserMapper;

    @Override
    public List<EduGoodUser> GoodUserSelect() {
        EduGoodUserExample eduGoodUserExample=new EduGoodUserExample();
        eduGoodUserExample.createCriteria().andLogicDeleteEqualTo(1);
        return eduGoodUserMapper.selectByExample(eduGoodUserExample);
    }
    @Override
    public int luojidelete(EduGoodUser eduGoodUser1) {
        eduGoodUser1.setLogicDelete(0);
        int i = eduGoodUserMapper.updateByPrimaryKeySelective(eduGoodUser1);
        return i;
    }
    @Override
    public int AddGoodUser(EduGoodUser eduGoodUser) {
        return eduGoodUserMapper.insertSelective(eduGoodUser);
    }
    @Override
    public int UpdateUser(EduUser eduUser) {
        eduUser.setEduUserIsGoodStudent(0);
        return eduUserMapper.updateByPrimaryKeySelective(eduUser);
    }

    @Override
    public PageInfo<EduGoodUser> pageGoodUserSelect(Integer pageNum, Integer pageSize) {
        EduGoodUserExample eduGoodUserExample=new EduGoodUserExample();
        eduGoodUserExample.createCriteria().andLogicDeleteEqualTo(1);
        PageHelper.startPage(pageNum, pageSize);
        List<EduGoodUser> eduGoodUsers = eduGoodUserMapper.selectByExample(eduGoodUserExample);
        PageInfo<EduGoodUser> eduGoodUserPageInfo = new PageInfo<>(eduGoodUsers);
        return eduGoodUserPageInfo;
    }
}
