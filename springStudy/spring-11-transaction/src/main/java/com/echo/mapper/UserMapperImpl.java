package com.echo.mapper;

import com.echo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    public List<User> queryAllUser() {
        UserMapper mapper = sessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.queryAllUser();
        mapper.addUser(new User(7,"小李","s814466"));
        //因为删除的sql语句是错误的，因此肯定会报错，但这里是要看增加是不是会执行
        //在这里，虽然报错了，但是，仍然是正常插入了
        mapper.deleteUser(7);

        return users;
    }

    public int addUser(User user) {
        return sessionTemplate.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sessionTemplate.getMapper(UserMapper.class).deleteUser(id);
    }
}
