import com.echo.dao.UserDaoMySqlImpl;
import com.echo.dao.UserDaoOrcleImpl;
import com.echo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，DAO层不能接触
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoOrcleImpl());
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");
        userService.getUser();
    }
}
