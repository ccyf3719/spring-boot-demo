package com.hand.eureka;

import com.hand.rule.MySelfRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "provider",configuration = MySelfRibbonRule.class)
public class ConsumerStart {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStart.class,args);
    }
}
