package com.kgc.study.studytravelcoach.controller.locontroller;

import com.kgc.study.studytravelcoach.service.loservice.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {

    /*
    @RequestMapping("/add")
    public String add(@RequestParam("zhi")MultipartFile zhi,Model model){
        System.out.println("进入add");
       try {
           InputStream stream = zhi.getInputStream();
           String oldFileName = zhi.getOriginalFilename();
           String imgURL = Aliyun2.upload(stream, oldFileName);
       }catch (Exception e){
           e.printStackTrace();
       }
       return "welcom";
    }


    <form action="add" method="POST" enctype="multipart/form-data">
    <input type="file" name="zhi">
    <input type="submit" value="提交">
</form>
    */

}
