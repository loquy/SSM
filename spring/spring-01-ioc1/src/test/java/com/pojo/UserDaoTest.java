package com.pojo;

import com.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    public void getUserByBean() {
        // 获取ApplicationContext；拿到Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 容器在手天下我有，需要什么，就直接get什么！
        UserServiceImpl  userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");

        userServiceImpl.getUser();


    }

    @Test
    public void getUser(){
        UserServiceImpl userService = new UserServiceImpl();

//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
        userService.getUser();
    }
}
