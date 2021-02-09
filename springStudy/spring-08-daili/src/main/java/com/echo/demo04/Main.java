package com.echo.demo04;

public class Main {
    public static void main(String[] args) {
        Me me = new Me();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setBuySth(me);
        BuySth proxy = (BuySth)proxyInvocationHandler.getProxy();
        proxy.buySth();

    }
}
