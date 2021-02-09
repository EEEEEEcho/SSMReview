package com.echo;

import com.echo.mapper.UserMapper;
import com.echo.mapper.UserMapperImpl;
import com.echo.mapper.UserMapperImpl2;
import com.echo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void testQuery() throws Exception{
        String path = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(path);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        UserMapper userMapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.queryAllUser();
        System.out.println(users);
        sqlSession.close();
    }
    @Test
    public void testQuery2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl = context.getBean("userMapperImpl", UserMapperImpl.class);
        List<User> users = userMapperImpl.queryAllUser();
        System.out.println(users);
    }

    @Test
    public void testQuery3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 userMapperImpl2 = context.getBean("userMapperImpl2", UserMapperImpl2.class);
        List<User> users = userMapperImpl2.queryAllUser();
        System.out.println(users);
    }
}
