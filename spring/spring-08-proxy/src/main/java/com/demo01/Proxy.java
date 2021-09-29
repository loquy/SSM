package com.demo01;

public class Proxy implements Rent{

    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        checking();
        landlord.rent();
        sign();
        charge();
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
