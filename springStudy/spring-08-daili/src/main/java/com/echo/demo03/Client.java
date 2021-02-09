package com.echo.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色：现在没有
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        invocationHandler.setRent(host);
        //这个Proxy就是动态生成的
        Rent proxy = (Rent)invocationHandler.getProxy();
        proxy.rent();
    }
}
