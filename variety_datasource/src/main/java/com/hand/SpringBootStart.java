package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStart {
    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(SpringBootStart.class);
    }
}
