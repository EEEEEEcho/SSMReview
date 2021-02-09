package com.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
//后置通知
public class AfterLog implements AfterReturningAdvice {
    /**
     * 后置通知
     * @param returnValue 方法的返回值
     * @param method 执行的方法
     * @param args 方法的参数
     * @param target 执行的目标对象
     * @throws Throwable
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "返回结果为:" + returnValue);
    }
}
