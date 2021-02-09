package com.echo.mapper;

import com.echo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * 方式二，继承SqlSessionDaoSupport
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> queryAllUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryAllUser();
    }
}
