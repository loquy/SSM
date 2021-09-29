package com.demo01;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
//        landlord.rent();

        // 代理，代理一般会有附属操作
        Proxy proxy = new Proxy(landlord);
        // 不用找房东，直接找中介即可
        proxy.rent();
    }

}
