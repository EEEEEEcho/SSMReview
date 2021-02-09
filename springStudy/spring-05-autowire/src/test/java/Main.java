import com.echo.pojo.Person;
import com.echo.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = applicationContext.getBean("person", Person.class);
        person.getCat().bark();

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
