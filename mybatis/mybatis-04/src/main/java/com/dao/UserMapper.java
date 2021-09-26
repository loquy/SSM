package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();

    // 分页
    List<User> getUserByLimit(Map<String, Integer> map);

    // 分页2
    List<User> getUserByRowBounds();
}
