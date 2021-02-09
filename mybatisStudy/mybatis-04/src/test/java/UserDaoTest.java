import echo.dao.UserDao;
import echo.pojo.User;
import echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void getAllUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        System.out.println(mapper.getAllUser());
        System.out.println(mapper.getUserById(2));
        sqlSession.close();
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(6);
        user.setUserName("Hello");
        user.setPassWord("world");
        mapper.addUser(user);
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper= sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(6);
        user.setUserName("Hello");
        user.setPassWord("123456");
        mapper.updateUser(user);
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper= sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(6);
        sqlSession.close();
    }
}
