package com.echo.demo01;

public class GirlFriend implements BuySth{
    private Me me;

    public void buySth() {
        System.out.println("女朋友给我要钱");
        this.me.buySth();
        System.out.println("女朋友买完了，甚至还买了个口红");
    }

    public Me getMe() {
        return me;
    }

    public void setMe(Me me) {
        this.me = me;
    }
}
