package com.echo.dao;

import com.echo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();

    User getUserById(Integer id);

    User getUserById2(Map<String, Object> map);

    Integer insertUser(User user);

    //万能Map
    Integer insertUser2(Map<String, Object> map);

    Integer updateUser(User user);

    Integer deleteUser(Integer id);

    List<User> selectByLike(String name);
}
