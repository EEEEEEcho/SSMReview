package com.echo.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //放行的判断
        //登录页面放行
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        //第一次登录时，
        if(request.getRequestURI().contains("login")){
            return true;
        }
        //session中有用户信息
        if(session.getAttribute("userLoginInfo") != null){
            return true;
        }
        //没有登录情况下，转发到登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
