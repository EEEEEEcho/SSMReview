package com.echo.demo01;
//客户要租房子
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //中介帮房东租了房子，但是一个代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        //房客不用面对房东，而是直接接触中介
        proxy.rent();
    }
}
