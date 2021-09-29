package com.config;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configurable
// 此注解会被Spring容器托管，注册到容器中，因为他本来是一个@Component
// @Configurable代表这是一个配置类，和bean.xml一样

@ComponentScan("com.pojo")
@Import(Config2.class)
public class Config {

    @Bean // 注册一个bean，相当于bean标签，方法名相当于id属性，返回值相当于标签中的class属性
    public User getUser() {
        return new User(); // 就是返回要注入到bean的对象
    }
}
