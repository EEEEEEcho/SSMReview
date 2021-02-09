import com.echo.mapper.UserMapper;
import com.echo.pojo.User;
import com.echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Main {
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
        sqlSession.close();
    }
    @Test
    public void testGetOneUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println("----------------");
        sqlSession.clearCache();    ///清理缓存
        User user1 = mapper.queryUserById(1);
        System.out.println(user==user1);
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        User userx = new User();
        userx.setId(2);
        userx.setName("HHHH");
        userx.setPwd("xxxxxxx");
        int i = mapper.updateUser(userx);
        System.out.println(i);
        System.out.println("----------------");
        User user1 = mapper.queryUserById(1);
        System.out.println(user==user1);
        sqlSession.close();
    }

    @Test
    public void testSecondaryCache(){
        SqlSession sqlSession1 = MyBatisUtil.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtil.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);
        sqlSession1.close();    //关掉一级缓存

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user1 == user2);
        sqlSession2.close();
    }
}
