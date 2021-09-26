package com.dao;

import com.pojo.User;
import com.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // RowBounds 实现
        RowBounds rowBounds = new RowBounds(1, 2);

        // 通过java代码实现分页
        List<User> userList = sqlSession.selectList("com.dao.UserMapper.getUserByRowBounds", null, rowBounds);

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);


        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserList() {
        // 1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("info: 进入了getUserList");
        try {// 2.执行sql
            // 方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
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


    @Test
    public void testLog4j() {
        logger.info("info: 进入了testLog4j");
        logger.debug("debug: 进入了testLog4j");
        logger.error("error: 进入了testLog4j");
    }

}
