package com.kgc.study.studytravelcoach.controller.lxlcontroller.jijunshuoController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.github.pagehelper.PageInfo;
import com.kgc.study.bean.ActivityInfo;
import com.kgc.study.service.lixiliangService.jijunshuoService.ActivityInfoService;
import com.kgc.study.studytravelcoach.loaliyun.Aliyun;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ActivityController {
    @Resource
    ActivityInfoService activityInfoService;

    //跳转研学旅行活动页面
    @RequestMapping("/admin-role.html")
    public String toActivityList(@RequestParam(value = "start", required = false, defaultValue = "") String start,
                                 @RequestParam(value = "end", required = false, defaultValue = "") String end,
                                 @RequestParam(value = "acInfoTitle", required = false, defaultValue = "") String acInfoTitle,
                                 @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                 @RequestParam(value = "pageSize", required = false, defaultValue = "2") Integer pageSize, Model model) throws ParseException {
        Date date1 = null;
        Date date2 = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (start.isEmpty() == false) {
            date1 = simpleDateFormat.parse(start);
        }
        if (end.isEmpty() == false) {
            date2 = simpleDateFormat.parse(end);
        }
        PageInfo<ActivityInfo> activityInfos = activityInfoService.selectAll(date1, date2, acInfoTitle, pageNum, pageSize);

        model.addAttribute("activityInfos", activityInfos);
        return "activity-list";
    }


    //跳转添加研学旅行活动页面
    @RequestMapping("/activity-add.html")
    public String toActivityAdd() {
        return "activity-add";
    }

    //添加研学旅行活动控制器
    @ResponseBody
    @RequestMapping("/activityAdd")
    public Map<String, Object> activityAdd(ActivityInfo activityInfo) {
        Map<String, Object> map = new HashMap<>();
        activityInfo.setGmtCreate(new Date());
        int insert = activityInfoService.insert(activityInfo);
        if (insert > 0) {
            map.put("status", "true");
        } else {
            map.put("message", "添加错误");
        }

        return map;
    }

    //富文本编辑器上传图片
    @ResponseBody
    @RequestMapping("/activitysaveImg")
    public JSONObject saveImg(MultipartFile multipartFile) throws IOException {
        JSONObject jsonObject = new JSONObject();
        InputStream stream = multipartFile.getInputStream();
        String oldFileName = multipartFile.getOriginalFilename();
        String imgURL = Aliyun.upload(stream, oldFileName);
        // 返回图片的URL地址
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(imgURL);
        jsonObject.put("errno", 0);
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    /*
     * 根据id查询
     * */
    @RequestMapping("/activity-edit/{id}")
    public String activityEdit(@PathVariable String id, Model model) {
        ActivityInfo activityInfo = activityInfoService.selectById(Long.parseLong(id));
        model.addAttribute("activityInfo", activityInfo);
        return "activity-edit";
    }

    //修改研学旅行活动控制器
    @ResponseBody
    @RequestMapping("/activityUpd")
    public Map<String, Object> activityUpd(ActivityInfo activityInfo) {
        Map<String, Object> map = new HashMap<>();
        activityInfo.setGmtModified(new Date());
        int insert = activityInfoService.update(activityInfo);
        if (insert > 0) {
            map.put("status", "true");
        } else {
            map.put("message", "修改失败");
        }
        return map;
    }

    /*
     * 假删除
     * */
    @ResponseBody
    @RequestMapping("/activityDel")
    public Map<String, Object> activityDel(Long id) {
        Map<String, Object> map = new HashMap<>();
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setId(id);
        activityInfo.setGmtModified(new Date());
        activityInfo.setLogicDelete(1);
        int delete = activityInfoService.delete(activityInfo);
        if (delete > 0) {
            map.put("status", "true");
        } else {
            map.put("message", "删除失败");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/activityDelList")
    public Map doNewsdelList(String gpId) {
        Map map = new HashMap();
        int i = activityInfoService.delactivityList(gpId);
        if (i > 0) {
            map.put("status", "true");
        } else {
            map.put("status", "false");
        }

        return map;
    }
}
