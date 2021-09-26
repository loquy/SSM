package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String value);

    // 查询全部用户
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // 万能的map
    User getUserById2(Map<String, Object> map);

    // 插入一个用户
    int addUser(User user);

    // 万能的map
    int addUser2(Map<String, Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除一个用户
    int deleteUser(int id);
}
