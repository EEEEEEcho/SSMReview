package com.echo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
// @Component 等价于 <bean id="user" class="com.echo.pojo.User"/>
// @Component 组件
@Component
public class User {
//    @Value 相当于 <property name="name" value="shuaibi"></property>

    public String name;

    @Value("shuaibi")   //也可以放在set上
    public void setName(String name) {
        this.name = name;
    }
}
