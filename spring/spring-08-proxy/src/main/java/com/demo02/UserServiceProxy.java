package com.demo02;

// 改变原有的业务代码，是大忌，所以使用代理横向开发，AOP的实现机制，缺点一个角色产生一个代理，代码量翻倍
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    // 日志方法
    public void log(String msg) {
        System.out.println("[DEBUG]使用了" + msg + "方法");
    }

}
