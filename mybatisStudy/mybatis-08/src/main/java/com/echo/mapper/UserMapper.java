package com.echo.mapper;

import com.echo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    User queryUserById(@Param("id")int id);

    int updateUser(User user);
}
