import com.echo.controller.Student;
import com.echo.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user.name);
        Student student = classPathXmlApplicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
