package com.echo.config;

import com.echo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Configuration  这个注解也会使这个类被Spring接管了，注册到了容器中
// 代表这是一个配置类类似于<beans></beans>
@Configuration
@ComponentScan("com.echo.pojo")
@Import(MyConfig2.class)    //引入配置类
public class MyConfig {
    //@Bean  相当于<bean></bean>
    //这个方法的名字相当于bean标签中的id属性
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
//        就是要返回注入到bean的对象
        return new User();
    }
}
