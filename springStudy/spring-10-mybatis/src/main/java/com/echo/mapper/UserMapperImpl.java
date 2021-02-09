package com.echo.mapper;

import com.echo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    //原来的实现都是用sqlSession,现在都使用sqlSessionTemplate
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    public List<User> queryAllUser() {
        UserMapper mapper = this.sessionTemplate.getMapper(UserMapper.class);
        return mapper.queryAllUser();
    }
}
