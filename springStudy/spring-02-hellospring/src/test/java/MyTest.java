import com.echo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        获取Spring的上下文对象
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) app.getBean("hello");
        System.out.println(hello);
    }
}
