package com.echo.controller;

import com.echo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "test";
    }
    @RequestMapping("/t2")
    public void test2(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        response.getWriter().println("Hello world");
    }

    @RequestMapping("/t3")
    public List<User> test3(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("1",12,"x"));
        users.add(new User("2",24,"y"));
        return users;
    }
    @RequestMapping("/t4")
    public String test4(String name,String pwd){
        String msg = "";
        if(name != null){
            if("admin".equals(name)){
                msg = "ok";
            }
            else{
                msg = "用户名错误";
            }
        }
        if(pwd != null){
            if ("123456".equals(pwd)){
                msg = "ok";
            }
            else{
                msg = "密码错误";
            }
        }
        return msg;
    }
}
