package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {

    // 使用@Autowired可以不用编写Set方法，前提是属性在IOC容器中存在
    @Autowired(required = false) // required = false，说明可以为null
    @Qualifier(value = "cat") // 指定唯一的bean对象注入
    private Cat cat;

    @Autowired(required = false)
    @Qualifier(value = "dog")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
