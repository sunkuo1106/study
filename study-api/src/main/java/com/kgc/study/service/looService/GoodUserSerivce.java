package com.kgc.study.service.looService;


import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.EduGoodUser;
import com.kgc.study.bean.EduUser;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-02-02 14:59
 */
public interface GoodUserSerivce {
  //查询所有优秀学生
  List<EduGoodUser> GoodUserSelect();
  //逻辑删除
  int luojidelete(EduGoodUser eduGoodUser);
  //添加优秀学生
  int AddGoodUser(EduGoodUser eduGoodUser);
  //修改学生状态
  int UpdateUser(EduUser eduUser);
   PageInfo<EduGoodUser> pageGoodUserSelect(Integer pageNum, Integer pageSize);
}
