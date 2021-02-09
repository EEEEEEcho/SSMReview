package echo.dao;



import echo.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from user")
    List<User> getAllUser();
    // 方法存在多个参数，所有参数前面必须要加上@Param注解 @Param("id")中的id是sql语句中所对应的id，
    // 要是改为@Param("id2")则会报错。但是参数 int id 中的这个id可以随便起名，只要@Param("id")中的id是其
    // 映射即可
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id")int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{userName},#{passWord})")
    int addUser(User user);

    @Update("update user set name=#{userName},pwd=#{passWord} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
