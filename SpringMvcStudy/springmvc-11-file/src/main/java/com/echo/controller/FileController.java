package com.echo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Controller
public class FileController {


    @RequestMapping("/upload")
    public String fileUpload(@RequestParam("file")CommonsMultipartFile file, HttpServlet request) throws IOException {
        //获取文件名
        String uploadFileName = file.getOriginalFilename();
        //如果文件名为空，直接回到首页
        if("".equals(uploadFileName)){
            return "redirect:/index.jsp";
        }
        System.out.println("上传文件名:" + uploadFileName);
        //上传文件保存路径
        String path = request.getServletContext().getRealPath("/upload");
        //如果路径不存在创建一个
        File realPath = new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("上传文件保存地址:" + realPath);
        //文件输入流
        InputStream in = file.getInputStream();
        //文件输出流
        OutputStream os = new FileOutputStream(new File(realPath,uploadFileName));
        //读取 写出
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len=in.read(buffer)) != -1){
            os.write(buffer,0,len);
            os.flush();
        }
        os.close();
        in.close();
        return "redirect:/index.jsp";
    }

    @RequestMapping("/upload2")
    public String fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //上传路径保存设置
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if(!realPath.exists()){
            realPath.mkdir();
        }
        System.out.println("文件上传路径:" + realPath);
        //通过CommonsMultipartFile的方法直接写文件
        file.transferTo(new File(realPath + "/" + file.getOriginalFilename()));
        return "redirect:/index.jsp";
    }

    @RequestMapping("/download")
    public String download(HttpServletResponse response,HttpServletRequest request) throws Exception {
        //要下载的图片地址
        String path = request.getServletContext().getRealPath("/upload");
        String fileName = "1.jpg";

        //1.设置响应头
        response.reset();
        //字符编码
        response.setCharacterEncoding("UTF-8");
        //二进制传输数据
        response.setContentType("multipart/form-data");
        //响应头
        response.setHeader("Content-Disposition","attachment;fileName"+ URLEncoder.encode(fileName,"UTF-8"));
        File file = new File(path,fileName);
        //2.读取文件--输入流
        InputStream inputStream = new FileInputStream(file);
        //3.写出文件--输出流
        OutputStream outputStream = response.getOutputStream();

        byte[] buff = new byte[1024];
        int index = 0;
        while ((index = inputStream.read(buff)) != -1){
            outputStream.write(buff,0,index);
            outputStream.flush();
        }
        outputStream.close();
        inputStream.close();
        return "redirect:/index.jsp";
    }
}
