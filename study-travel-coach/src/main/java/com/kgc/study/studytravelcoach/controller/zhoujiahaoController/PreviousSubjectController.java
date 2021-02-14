package com.kgc.study.studytravelcoach.controller.zhoujiahaoController;

import com.kgc.study.bean.PastExamPaper;
import com.kgc.study.service.zhoujiahaoService.PreviousSubjectService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "历届真题管理",description = "提供历届真题的信息")
public class PreviousSubjectController {

    @Resource
    PreviousSubjectService previousSubjectService;

    @ApiOperation("查看每年例题的列表")
    @GetMapping("/pastExamPaperList")
    public String PreviousSubjectList(Model model){
        List<PastExamPaper> pastExamPapers = previousSubjectService.selectAll();
        model.addAttribute("pastExamPaper",pastExamPapers);
        return "previous-subject";
    }

    @ApiOperation("查看本年度的测试题是文档还是图片")
    @GetMapping("/selectPEP")
    @ApiImplicitParam(name = "id",value = "历届真题的id")
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

    @ApiOperation("上传图片和pdf文件")
    @PostMapping("/pepImages")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "files",value = "选择图片的个数"),
        @ApiImplicitParam(name = "id",value = "历届真题的id")
    })
    public String test(@RequestParam("file")MultipartFile[] files, HttpSession session, Model model, Integer id, HttpServletRequest request) throws IOException {
        MultipartFile file=null;
        for (int i=0;i<files.length;i++){
            file=files[i];
            String oldname = file.getOriginalFilename();
            /*获取拓展名*/
            String extension = FilenameUtils.getExtension(oldname);
            List<String> list=new ArrayList<>();
            list.add("jpg");
            list.add("png");
            list.add("pdf");
            if(list.contains(extension)){
                //生成新文件名
                String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
                String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/images";
//                String realPath="D:/第三期/IdeaProjects/study/study-travel-coach/target/classes/static/images";
                File file1 = new File(realPath, fileName);
                // 把内存图片写入磁盘中
                file.transferTo(file1);
                InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
                String s= Aliyun2.upload(inputStream,oldname);
                PastExamPaper pep = previousSubjectService.selectPEP(id);
                PastExamPaper pastExamPaper=new PastExamPaper();
                pastExamPaper.setId((long)id);
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
            }else{
                session.setAttribute("msg","文件格式不符合，请重新上传！仅支持：jpg、png、pdf文件");
                return  "redirect:/selectPEP?id="+id;
            }
        }
        session.setAttribute("msg","");
        return  "redirect:/pastExamPaperList";
    }

    @ApiOperation("删除指定不需要的图片或文档")
    @GetMapping("/delete")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "num",value = "根据,使用split分割出来的字段下标"),
            @ApiImplicitParam(name = "id",value = "历届真题的id")
    })
    public String delete(Integer num,Integer id,Model model){
        PastExamPaper pastExamPaper = previousSubjectService.selectPEP(id);
        List<String> img=new ArrayList<>();
        List<String> pdf=new ArrayList<>();
        if(pastExamPaper.getPepImage()!=null){
            String pepImage = pastExamPaper.getPepImage();
            String[] split = pepImage.split(",");
            String replaceimg=null;
            for (int i = 0; i < split.length; i++) {
                if(num==i){
                    if(num==split.length-1){
                        replaceimg = pepImage.replaceAll(','+split[i], "");
                    }else{
                        replaceimg = pepImage.replaceAll(split[i]+',', "");
                    }
                    PastExamPaper pep=new PastExamPaper();
                    pep.setId((long)id);
                    pep.setPepImage(replaceimg);
                    previousSubjectService.update(pep);
                    break;
                }
            }
            PastExamPaper pepimg = previousSubjectService.selectPEP(id);
            if(pepimg.getPepImage()!=null){
                String pepImage2 = pepimg.getPepImage();
                String[] split2 = pepImage2.split(",");
                for (int i = 0; i < split2.length; i++) {
                    String image = (String) split2[i];
                    img.add(image);
                }
            }
        }
        if(pastExamPaper.getPepTestInfoId()!=null){
            String PepTestInfoId = pastExamPaper.getPepTestInfoId();
            String[] split = PepTestInfoId.split(",");
            String replacepdf=null;
            for (int i = 0; i < split.length; i++) {
                if(num==i){
                    if(num==split.length-1){
                        replacepdf = PepTestInfoId.replaceAll(','+split[i], "");
                    }else{
                        replacepdf = PepTestInfoId.replaceAll(split[i]+',', "");
                    }
                    PastExamPaper pep=new PastExamPaper();
                    pep.setId((long)id);
                    pep.setPepTestInfoId(replacepdf);
                    previousSubjectService.update(pep);
                }
            }
            PastExamPaper peppdf = previousSubjectService.selectPEP(id);
            if(peppdf.getPepTestInfoId()!=null){
                String PepTestInfoId2 = peppdf.getPepTestInfoId();
                String[] split2 = PepTestInfoId2.split(",");
                for (int i = 0; i < split2.length; i++) {
                    String pepPDF = (String) split2[i];
                    pdf.add(pepPDF);
                }
            }
        }
        model.addAttribute("pdf",pdf);
        model.addAttribute("img",img);
        model.addAttribute("pastExamPaper",pastExamPaper);
        return  "redirect:/selectPEP?id="+id;
    }
}
