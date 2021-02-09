package com.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解的方式实现AOP
@Aspect     //标注该类是一个切面
public class AnnotationPointCut {
//    说明切入到的地方,前置通知
    @Before("execution(* com.echo.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
//    说明切入到的地方，后置通知
    @After("execution(* com.echo.UserServiceImpl.*(..)))")
    public void after(){
        System.out.println("方法执行之后");
    }
//    环绕通知
    @Around("execution(* com.echo.UserServiceImpl.*(..)))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        //其他方法简述，
        //获得签名
        Signature signature = pj.getSignature();
        System.out.println("signature:"+signature);
        //执行方法
        Object proceed = pj.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
    /**
     * 执行顺序
     * 1.环绕前，
     * 2.方法执行前
     * 3.方法执行
     * 4.环绕后
     * 5.方法执行后
     */
}
