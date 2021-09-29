package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 注解不是自己的类使用不了，xml维护更简单，所以用xml管理Bean，注解只负责完成属性注入
@Component // 等价于 <bean id="user" class="com.pojo.User"/>
// @Component放在类上说明这个类被Spring管理了，就是Bean
// 有3个衍生注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean
// dao层 @Repository
// controller层 @Controller
// service层 @Service

@Scope("singleton")
public class User {

    @Value("xx") // 相当于 <property name="name" value="xx"/>
    public String name;
}
