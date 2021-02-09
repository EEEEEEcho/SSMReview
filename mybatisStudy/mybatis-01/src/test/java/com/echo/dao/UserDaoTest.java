package com.echo.dao;

import com.echo.pojo.User;
import com.echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void testGetAllUser(){
        //1.获取sqlSession
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            //2.执行sql
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.getUserList();
            System.out.println(userList);
            //3.方式二
            List<User> users = sqlSession.selectList("com.echo.dao.UserDao.getUserList");
            System.out.println(users);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //3.关闭sqlsession
            sqlSession.close();
        }
    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.getUserById(1);
            System.out.println(user);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
    //增删改都需要提交事务
    @Test
    public void testInsert(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            User user = new User();
            user.setId(8);
            user.setUserName("李四");
            user.setPassWord("123456");
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            mapper.insertUser(user);
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            User user = new User();
            user.setId(4);
            user.setUserName("Xml");
            user.setPassWord("123456");
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            mapper.updateUser(user);
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{

            UserDao mapper = sqlSession.getMapper(UserDao.class);
            mapper.deleteUser(4);
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
    @Test
    public void testMap(){
        /**
         * 当
         */
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("id",8);
            map.put("username","assembler");
            map.put("password","597846");
            userDao.insertUser2(map);
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
    @Test
    public void testMap2(){
        /**
         * 当
         */
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("userid",5);
            map.put("username","assembler");
            User userById2 = userDao.getUserById2(map);
            System.out.println(userById2);
            sqlSession.commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    @Test
    public void testLike(){
        /**
         * 模糊查询
         */
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            String name = "Echo";
            List<User> users = userDao.selectByLike(name);
            System.out.println(users);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
}
