package com.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用此类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }

    // 处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checking();

        // 动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(rent, args);

        sign();
        charge();

        return result;
    }

    // 中介带你看房子
    public void checking() {
        System.out.println("中介带你看房子");
    }

    // 签合同
    public void sign() {
        System.out.println("签合同");
    }

    // 收中介费
    public void charge(){
        System.out.println("收中介费");
    }
}
