package com.hand.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart8177 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart8177.class,args);
    }

}
