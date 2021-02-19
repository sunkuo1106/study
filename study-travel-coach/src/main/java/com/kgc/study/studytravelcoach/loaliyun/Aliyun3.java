package com.kgc.study.studytravelcoach.loaliyun;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.apache.commons.io.FilenameUtils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;


/**
 * @author 刘学文
 * @create 2021-02-10 14:47
 */
public class Aliyun3 {
    public static String upload(InputStream inputStream, String oldFileName) throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4GJAhBTKfJBh3JYPUaKG";
        String accessKeySecret = "tIHb69eyIJkcrmvjErItZLJL2RssOE";
// 创建OSSClient实例。
        String objectName="policy/";
        String backetName="studytravelcoach";
        String prefix="https://studytravelcoach.oss-cn-beijing.aliyuncs.com/";
        //获取就文件名
        String extension= FilenameUtils.getExtension(oldFileName);
        //随机生成一个唯一的文件名
        String newFileName= UUID.randomUUID().toString().replaceAll("-","")+"."+extension;
        //创建ossClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject(backetName,objectName+newFileName,inputStream);
        //关闭OSSClient
        ossClient.shutdown();

        return prefix+objectName+newFileName;
    }
}
