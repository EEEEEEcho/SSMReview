package com.echo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 乱码问题
 */
@Controller
public class EncodingController {
    //方式1：使用过滤器解决乱码,
    @PostMapping("/e/t1")
    public String test1(@RequestParam("name")String name, Model model){
        System.out.println(name);   //氓颅聼莽聼鲁 这里就出现了乱码。所以乱码的出现是在java层出现的
        model.addAttribute("msg",name);
        return "test";
    }
    //结果：解决失败

    //方式2：使用get方法 + 过滤器
    @GetMapping("/e/t1")
    public String test2(@RequestParam("name")String name, Model model){
        System.out.println(name);   //氓颅聼莽聼鲁 这里就出现了乱码。所以乱码的出现是在java层出现的
        model.addAttribute("msg",name);
        return "test";
    }
    //结果：解决成功，但是它注定只是一个get方法，无法使用post方法
}
