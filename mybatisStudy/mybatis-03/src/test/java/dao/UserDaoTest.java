package dao;


import echo.dao.UserDao;
import echo.pojo.User;
import echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try{
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("startIndex",1);
            map.put("pageSize",2);
            List<User> userByLimit = mapper.getUserByLimit(map);
            System.out.println(userByLimit);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }
}
