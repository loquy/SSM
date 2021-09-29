package com.demo03;

public class Client {
    public static void main(String[] args) {
        // 真是角色
        Landlord landlord = new Landlord();

        // 代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 没有代理类，通过 InvocationHandler 处理，自动生成代理类
        pih.setRent(landlord);
        // 这里的Proxy就是动态生成的，并没有写
        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();

    }
}
