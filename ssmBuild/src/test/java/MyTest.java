import com.echo.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = applicationContext.getBean("bookServiceImpl", BookServiceImpl.class);
        System.out.println(bookServiceImpl.findAllBooks());
    }
}
