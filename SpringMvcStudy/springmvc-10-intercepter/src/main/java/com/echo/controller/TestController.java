package com.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 拦截器类似于过滤器，但是并不是过滤器。拦截器采用了AOP的思想。
 * 拦截器不能过滤.jsp .css .img .js等静态资源。
 */
@RestController
public class TestController {

    @GetMapping("/t1")
    public String test(){
        System.out.println("TestController 的 test执行了");
        return "OK";
    }
}
