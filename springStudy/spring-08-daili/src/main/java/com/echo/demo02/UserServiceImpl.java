package com.echo.demo02;

public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("ADD EXECUTE");
    }

    public void delete() {
        System.out.println("DELETE EXECUTE");
    }

    public void update() {
        System.out.println("UPDATE EXECUTE");
    }

    public void select() {
        System.out.println("SELECT EXECUTE");
    }

//    现在要为每一个方法添加一个日志打印功能：应该在不改动原来代码的基础上进行
    //所以采用代理模式，为UserService同样设置一个代理
}
