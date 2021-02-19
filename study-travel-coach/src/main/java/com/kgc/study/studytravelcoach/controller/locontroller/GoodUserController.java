package com.kgc.study.studytravelcoach.controller.locontroller;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.EduGoodUser;
import com.kgc.study.service.looService.GoodUserSerivce;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @create 2021-02-02 15:06
 */
@Controller
public class GoodUserController {
    @Resource
    GoodUserSerivce goodUserSerivce;

   @RequestMapping("/gooduserselect")
   public String gooduserselect(Model model){
        List<EduGoodUser> eduGoodUsers = goodUserSerivce.GoodUserSelect();
        model.addAttribute("eduGoodUsers",eduGoodUsers);
        System.out.println(eduGoodUsers);
        return "gooduser-select";
    }
    @RequestMapping("/luojidelete")
    @ResponseBody
    public Map<String,Object> luojidelete(EduGoodUser eduGoodUser){
        Map<String,Object> map=new HashMap<>();
        int luojidelete = goodUserSerivce.luojidelete(eduGoodUser);
        map.put("update",luojidelete);
        return map;
    }
    @RequestMapping("/AddGoodUser")
    public String add(EduGoodUser eduGoodUser, Model model, @RequestParam("goodUserIm")MultipartFile goodUserImg){
        try {
            InputStream stream = goodUserImg.getInputStream();
            String oldFileName = goodUserImg.getOriginalFilename();
            String imgURL = Aliyun2.upload(stream, oldFileName);
            System.out.println(imgURL);
            eduGoodUser.setGoodUserImg(imgURL);
            eduGoodUser.setGmtCreate(new Date());
            eduGoodUser.setGmtModified(new Date());
            eduGoodUser.setLogicDelete(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("add");
        goodUserSerivce.AddGoodUser(eduGoodUser);
       return "redirect:/PageInfo";
    }
    @RequestMapping("/gooduser-add")
    public String goodadd(){
       return "gooduser-add";
    }
    @RequestMapping("/PageInfo")
    public String list(Model model,HttpServletRequest request){
        int Num = 1;
        String pn = request.getParameter("pn");
        if (pn != null) {
            Num = Integer.parseInt(pn);
        }
        int pageSize = 2;
        PageInfo<EduGoodUser> eduGoodUserPageInfo = goodUserSerivce.pageGoodUserSelect(Num, pageSize);
        model.addAttribute("eduGoodUserPageInfo",eduGoodUserPageInfo);
        return "gooduser-select";
    }

}
