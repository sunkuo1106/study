package com.kgc.study.studytravelcoach.controller.ZhangJiaheController.Learning;

import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.Teacher;
import com.kgc.study.bean.VideoTable;
import com.kgc.study.service.zhangjiaheService.VideoServicecx;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun2;
import io.swagger.annotations.*;
import org.apache.commons.io.FilenameUtils;


import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "视频相关接口",description = "提供视频相关的Rest API")
public class VideoControllercx {
    @Resource
    VideoServicecx videoServicecx;

    @ApiOperation("视频查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex",value="页码",required = false),
            @ApiImplicitParam(name = "pageSize",value="页面行数",required = false),
            @ApiImplicitParam(name = "videoTableName",value="视频名称",required = false),
            @ApiImplicitParam(name = "chapterTableId",value="章节ID",required = false)
    })
    @RequestMapping("/selectVideo")
    public String selectVideo(Model model,HttpServletRequest request,
                              @RequestParam(value = "pageIndex",defaultValue = "0",required = false)Integer pageIndex,
                              @RequestParam(value = "pageSize",defaultValue = "0",required = false)Integer pageSize,
                              @RequestParam(value = "videoTableName",defaultValue = "",required = false)String videoTableName
    ,Long chapterTableId,HttpSession session
    ){
        Integer loggicDelete=0;
        pageIndex=1;
        String pageNum=request.getParameter("pageNum");
        if(pageNum!=null){
            pageIndex=Integer.parseInt(pageNum);
        }
        pageSize=10;
        PageInfo<VideoTable> videoTablePageInfo=videoServicecx.selectVideo(loggicDelete,pageIndex,pageSize,videoTableName,chapterTableId);
        model.addAttribute("videoTables",videoTablePageInfo);
        model.addAttribute("videoTableName",videoTableName);
        model.addAttribute("chapterTableId",chapterTableId);
        session.setAttribute("chapterTableId",chapterTableId);
        return "learnvideo.html";
    }

    @ApiOperation("逻辑删除接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "videoTable",value="视频对象",required = false),
            @ApiImplicitParam(name = "videoTableId",value="视频编号",required = false),
    })
    @GetMapping("/logicDeleteVideo")
    public String logicDeleteVideo(VideoTable videoTable,Long videoTableId,HttpSession session){
        Long chapterTableId = (Long) session.getAttribute("chapterTableId");
        videoTable.setLogicDelete(1);
        videoTable.setGmtModified(new Date());
        videoServicecx.logicDeleteVideo(videoTable,videoTableId);
        return "redirect:/selectVideo?chapterTableId="+chapterTableId;
    }

    @ApiOperation("批量逻辑删除接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "str",value="要删除的视频编号",required = false),
            @ApiImplicitParam(name = "videoTable",value="视频对象",required = false),
    })
    @GetMapping("/logicDeleteAllVideo")
    public  String delete(Model model,String str,HttpServletRequest request,VideoTable videoTable,HttpSession session){
        Long chapterTableId = (Long) session.getAttribute("chapterTableId");
        str=request.getParameter("str");
        String[] idd=str.split(",");
        videoTable.setLogicDelete(1);
        videoTable.setGmtModified(new Date());
        for(int i=0;i<idd.length;i++) {
            int num=videoServicecx.logicDeleteVideo(videoTable,Long.parseLong(idd[i]));
        }
        return "redirect:/selectVideo?chapterTableId="+chapterTableId;
    }

    @ApiOperation("跳转添加页面")
    @GetMapping("/toAddVideo")
    public String toAddVideo(Model model){
        List<Teacher> teachers = videoServicecx.selectTeacher();
        model.addAttribute("teachers",teachers);
        return "video-add.html";
    }

    @ApiOperation("添加视频接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "videoTable",value="视频对象",required = false),
    })
    @PostMapping("/addVideo")
    public  String addVideo(MultipartFile video, VideoTable videoTable,HttpSession session){
        Long chapterTableId = (Long) session.getAttribute("chapterTableId");
        try {
            String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/videos";
            String oldname = video.getOriginalFilename();
            /*获取拓展名*/
            String extension = FilenameUtils.getExtension(oldname);
            //生成新文件名
            String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
            File file1 = new File(realPath, fileName);
            // 把内存图片写入磁盘中
            try {
                video.transferTo(file1);
                InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
                String s= Aliyun2.upload(inputStream,oldname);
                videoTable.setVideoTableUrl(s);
                videoTable.setChapterTableId(chapterTableId);
//                System.out.println(s);
                videoServicecx.addVideo(videoTable);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "redirect:/selectVideo?chapterTableId="+chapterTableId;
    }

    @ApiOperation("根据视频id查询视频")
    @ApiImplicitParam(name = "videoTableId",value = "视频id",required = true)
    @ApiResponses({
            @ApiResponse(code = 400,message = "请求参数问题"),
            @ApiResponse(code = 404,message = "请求路径没有或页面跳转路径不对"),
            @ApiResponse(code = 405,message = "请求类型不正确"),
            @ApiResponse(code = 500,message = "后端程序出错")
    })
    @GetMapping("/selectVideoById")
    public String selectVideoById(Long videoTableId,Model model){
        VideoTable video = videoServicecx.selectVideoById(videoTableId);
        List<Teacher> teachers = videoServicecx.selectTeacher();
        model.addAttribute("teachers",teachers);
        model.addAttribute("video",video);
        return "video-upd";
    }

    @ApiOperation("修改视频接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "videoTable",value="视频对象",required = false),
    })
    @PostMapping("/updateVideo")
    public  String updateVideo(MultipartFile video,VideoTable videoTable,HttpSession session){
        Long chapterTableId = (Long) session.getAttribute("chapterTableId");
        try {
            String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/videos";
            String oldname = video.getOriginalFilename();
            /*获取拓展名*/
            String extension = FilenameUtils.getExtension(oldname);
            //生成新文件名
            String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal." + extension;
            File file1 = new File(realPath, fileName);
            // 把内存图片写入磁盘中
            try {
                if (video!=null&&video.isEmpty()==false){
                    video.transferTo(file1);
                    InputStream inputStream=new FileInputStream(realPath+"/"+fileName);
                    String s= Aliyun2.upload(inputStream,oldname);
//                    System.out.println(s);
                    videoTable.setVideoTableUrl(s);
                }
                videoServicecx.updateVideo(videoTable);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "redirect:selectVideo?chapterTableId="+chapterTableId;
    }



}
