package com.echo.mapper;

import com.echo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> queryAllUser();

    public int addUser(User user);

    public int deleteUser(@Param("id") int id);
}
