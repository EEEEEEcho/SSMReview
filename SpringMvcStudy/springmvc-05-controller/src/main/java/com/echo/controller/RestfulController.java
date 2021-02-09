package com.echo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {
    //旧版本的传参风格 localhost:8080/add?a=1&b=2
//    @RequestMapping("/add")
//    public String test1(int a, int b, Model model){
//        int res = a + b;
//        model.addAttribute("msg","结果为" + res);
//        return "test";
//    }
    //Restful风格 localhost:8080/add/a/b
    //@PathVariable
    //@RequestMapping(path="/add/{a}/{b}",method = RequestMethod.GET) 精简一下如下 使用@GetMapping
    @GetMapping("/add/{a}/{b}") //@GetMapping通过Get方法进行请求,约束请求的类型
    public String test2(@PathVariable int a,@PathVariable int b,Model model){
        int res = a + b;
        model.addAttribute("msg","Get结果为" + res);
        return "test";
    }
    @PostMapping("/add/{a}/{b}") //@GetMapping通过Get方法进行请求,约束请求的类型
    public String test22(@PathVariable int a,@PathVariable int b,Model model){
        int res = a + b;
        model.addAttribute("msg","Post结果为" + res);
        return "test";
    }
//    限定请求方法只能为Delete
    //@RequestMapping(path="/delete/{a}/{b}",method = RequestMethod.DELETE)
    //同样有DeleteMapping
    @DeleteMapping("/delete/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b,Model model){
        int res = a + b;
        model.addAttribute("msg","Delete结果为" + res);
        return "test";
    }
}
