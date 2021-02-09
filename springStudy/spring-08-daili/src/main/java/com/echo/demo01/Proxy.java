package com.echo.demo01;
//中介
public class Proxy implements Rent{
    private Host host;
    public Proxy(){

    }
    public Proxy(Host host){
        this.host = host;
    }
    //代理房东租房子，在帮房东租房子之前和之后都可以进行一些操作
    public void rent() {
        seeHouse();
        //代理房东租房子
        host.rent();
        sign();
        chargeFee();
    }
    //中介可以做很多房东做不到的事情
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void chargeFee(){
        System.out.println("中介收中介费");
    }
    //签租赁合同
    public void sign(){
        System.out.println("中介签租赁合同");
    }
}
