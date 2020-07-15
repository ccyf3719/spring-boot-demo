package com.hand.stu.value.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "beandemo")
public class BeanProperty {
    private String demo1;
    private int demo2;
    private boolean demo3;

    public String getDemo1() {
        return demo1;
    }

    public void setDemo1(String demo1) {
        this.demo1 = demo1;
    }

    public int getDemo2() {
        return demo2;
    }

    public void setDemo2(int demo2) {
        this.demo2 = demo2;
    }

    public boolean isDemo3() {
        return demo3;
    }

    public void setDemo3(boolean demo3) {
        this.demo3 = demo3;
    }

    @Override
    public String toString() {
        return "BeanProperty{" +
                "demo1='" + demo1 + '\'' +
                ", demo2=" + demo2 +
                ", demo3=" + demo3 +
                '}';
    }
}
