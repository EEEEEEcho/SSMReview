import com.echo.config.MyConfig;
import com.echo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //如果完全使用了配置类的方式去做，我们只能通过 AnnotationConfigApplicationContext去加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User)applicationContext.getBean("getUser");
        System.out.println(user.getName());
    }
}
