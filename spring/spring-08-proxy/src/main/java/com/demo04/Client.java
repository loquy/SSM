package com.demo04;

import com.demo02.UserService;
import com.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色，不存在
        ProxyInvocationHandler phi = new ProxyInvocationHandler();
        // 设置要代理的对象
        phi.setTarget(userService);
        // 动态生成代理类，一个动态代理可以代理多个类
        UserService proxy = (UserService) phi.getProxy();

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
