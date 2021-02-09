package com.echo.controller;

import com.echo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    //localhost:8080/user/t1?name=xxx
    @GetMapping("/t1")  //@RequestParam("username") 声明前端要传过来一个为username的参数
    public String test1(@RequestParam("username") String name, Model model){
        //1.接收前端参数
        System.out.println("接收到的前端参数为:" + name);
        //2.将返回的结果返回给前端
        model.addAttribute("msg",name);
        //3.视图跳转
        return "test";
    }

    //从前端接收一个对象 User id name sex

    /**
     * 原理：
     * 1.接收前端用户传过来的参数，判断参数的名字，如果参数名字和方法中定义的参数的名字相匹配，则直接使用
     * 2.假设传递的是一个对象User,匹配User对象中的字段名，如果名字一致，则OK，否则匹配不到
     * @param user
     * @return
     */
    //http://localhost:8080/user/t2?id=1&name=echo&sex=male
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
    //使用ModelMap
    @GetMapping("/t3")
    public String test3(ModelMap modelMap){
        //1.Model是精简版的  ， 大部分情况使用Model来做
        //2.ModelMap：继承了LinkedHashMap,拥有LinkedHashMap所有功能
        //3.LinkedHashMap
        return "test";
    }
}
