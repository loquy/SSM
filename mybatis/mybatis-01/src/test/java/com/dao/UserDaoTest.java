package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        // 1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {// 2.执行sql
            // 方式一：getMapper
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();

            // 方式二：
//        List<User> userList = sqlSession.selectList("com.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //3.关闭SqlSession
            sqlSession.close();
        }
    }
}
