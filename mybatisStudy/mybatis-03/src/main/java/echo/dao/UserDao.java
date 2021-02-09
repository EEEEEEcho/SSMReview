package echo.dao;



import echo.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //分页
    List<User> getUserByLimit(Map<String,Object> map);
}
