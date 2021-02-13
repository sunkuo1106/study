package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.kgc.study.bean.PastExamPaper;
import com.kgc.study.service.zhoujiahaoService.PreviousSubjectService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PreviousSubjectController {

    @Resource
    PreviousSubjectService previousSubjectService;

    @GetMapping("/pastExamPaperList")
    public String PreviousSubjectList(Model model){
        List<PastExamPaper> pastExamPapers = previousSubjectService.selectAll();
        model.addAttribute("pastExamPaper",pastExamPapers);
        return "previous-subject";
    }

    @GetMapping("/selectPEP")
    public String selectPEP(Model model,Integer id){
        PastExamPaper pastExamPaper = previousSubjectService.selectPEP(id);
        List<String> img=new ArrayList<>();
        List<String> pdf=new ArrayList<>();
        if(pastExamPaper.getPepImage()!=null){
            String pepImage = pastExamPaper.getPepImage();
            String[] split = pepImage.split(",");
            for (int i = 0; i < split.length; i++) {
                String image = (String) split[i];
                img.add(image);
            }
        }
        if(pastExamPaper.getPepTestInfoId()!=null){
            String PepTestInfoId = pastExamPaper.getPepTestInfoId();
            String[] split = PepTestInfoId.split(",");
            for (int i = 0; i < split.length; i++) {
                String pepPDF = (String) split[i];
                pdf.add(pepPDF);
            }
        }
        model.addAttribute("pdf",pdf);
        model.addAttribute("img",img);
        model.addAttribute("pastExamPaper",pastExamPaper);
        return "previous-subject-year";
    }

    @RequestMapping("/pepImages")
    public String test(@RequestParam("file")MultipartFile[] files, Model model,Integer id, HttpServletRequest request) throws IOException {
        MultipartFile file=null;
        String[] arr=new String[files.length];
        for (int i=0;i<files.length;i++){
            file=files[i];
            String oldname = file.getOriginalFilename();
            /*获取拓展名*/
            String extension = FilenameUtils.getExtension(oldname);
            //生成新文件名
            String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
            String realPath="D:/第三期/IdeaProjects/study/study-travel-coach/target/classes/static/images";
            File file1 = new File(realPath, fileName);
            // 把内存图片写入磁盘中
            file.transferTo(file1);
            InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
            String s= Aliyun2.upload(inputStream,oldname);
            PastExamPaper pep = previousSubjectService.selectPEP(id);
            PastExamPaper pastExamPaper=new PastExamPaper();
            pastExamPaper.setId((long)id);
            pastExamPaper.setGmtModified(new Date());
            if(extension.equals("pdf")){
                if(pep.getPepTestInfoId()!=null && pep.getPepTestInfoId()!=""){
                    pastExamPaper.setPepTestInfoId(pep.getPepTestInfoId()+","+s);
                }else{
                    pastExamPaper.setPepTestInfoId(s);
                }
            }else{
                if(pep.getPepImage()!=null && pep.getPepImage()!=""){
                    pastExamPaper.setPepImage(pep.getPepImage()+","+s);
                }else{
                    pastExamPaper.setPepImage(s);
                }
            }
            previousSubjectService.update(pastExamPaper);
        }
        return  "redirect:/pastExamPaperList";
    }


}
