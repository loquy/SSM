package com.dao;

import com.service.UserServiceImpl;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void getUser(){
        UserServiceImpl userService = new UserServiceImpl();

//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
        userService.getUser();
    }
}
