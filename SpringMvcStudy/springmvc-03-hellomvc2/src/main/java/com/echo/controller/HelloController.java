package com.echo.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        //1.业务代码
        String msg = "Hello world";
        modelAndView.addObject("msg",msg);
        //2.视图跳转
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
