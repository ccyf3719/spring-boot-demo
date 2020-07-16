package com.hand.stu.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SparingBootSch {
    public static void main(String[] args) {
        SpringApplication.run(SparingBootSch.class,args);
    }
}
