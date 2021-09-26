package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUsersTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByIdTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }


    @Test
    public void addUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.addUser(new User(6, "aaa", "111"));

        System.out.println(res);

        sqlSession.close();
    }

    @Test
    public void updateUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.updateUser(new User(6, "aaaa", "111"));

        System.out.println(res);

        sqlSession.close();
    }

    @Test
    public void deleteUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.deleteUser(6);

        System.out.println(res);

        sqlSession.close();
    }
}
