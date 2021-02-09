import com.echo.pojo.Student;
import com.echo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student =(Student) context.getBean("student");
        System.out.println(student);
        ApplicationContext context2 = new ClassPathXmlApplicationContext("userBean.xml");
        User user = context2.getBean("user",User.class);
        System.out.println(user);
        User user2 = context2.getBean("user2", User.class);
        System.out.println(user2);
    }
}
