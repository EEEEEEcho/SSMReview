package com.echo.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private BuySth buySth;
    public void setBuySth(BuySth buySth){
        this.buySth = buySth;
    }
    //生成代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), buySth.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        getMoney();
        Object invoke = method.invoke(buySth, args);
        giveMe();
        return invoke;
    }
    public void getMoney(){
        System.out.println("给老子要钱");
    }
    public void giveMe(){
        System.out.println("给了我东西，甚至还买了个口红");
    }
}
