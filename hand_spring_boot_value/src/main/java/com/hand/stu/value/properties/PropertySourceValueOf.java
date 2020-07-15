package com.hand.stu.value.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("demo.properties")
public class PropertySourceValueOf {
    //设置默认值，为空时使用设置的默认值
    //@Value("${demo.demo1 : default}")
    @Value("${demo.demo1}")
    private String name;
    @Value("${demo.demo2}")
    private int age;
    @Value("${demo.demo3}")
    private boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "PropertySourceValueOf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
