package com.echo.service;

import com.echo.dao.UserDao;
import com.echo.dao.UserDaoImpl;
import com.echo.dao.UserDaoMySqlImpl;
import com.echo.dao.UserDaoOrcleImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoMySqlImpl();
    private UserDao userDao;
//  使用set进行值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
