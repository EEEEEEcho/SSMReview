package com.echo.demo02;

public class UserServiceProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        this.log();
        this.userService.add();
    }

    public void delete() {
        this.log();
        this.userService.delete();
    }

    public void update() {
        this.log();
        this.userService.update();
    }

    public void select() {
        this.log();
        this.userService.select();
    }
    public void log(){
        System.out.println("[debug]: log");
    }
}
