package com.pojo;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Oracle 获取用户数据");
    }
}
