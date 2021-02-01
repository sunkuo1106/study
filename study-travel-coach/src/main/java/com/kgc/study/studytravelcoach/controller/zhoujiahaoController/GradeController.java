package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeController {

    @RequestMapping("/grade")
    public String grade(){
        return "grade";
    }
}
