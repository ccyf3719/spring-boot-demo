package com.hand.stu.value.properties;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValuesProperty {

    //获取从 application.properties 中指定量的值
    @Value("${demo.value}")
    private String value;

    public String getValue() {
        return value;
    }

    public void  getValuesProperty(String value) {
        this.value = value;
    }
}
