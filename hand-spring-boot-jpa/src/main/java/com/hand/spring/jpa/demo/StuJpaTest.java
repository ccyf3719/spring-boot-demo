package com.hand.spring.jpa.demo;

import com.hand.spring.jpa.demo.pojo.Stu;
import com.hand.spring.jpa.demo.repository.StuRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class StuJpaTest {

    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(StuJpaTest.class,args);
        List<Stu> list = application.getBean(StuRepository.class).findAll();
        for (Stu stu : list) {
            System.out.println(stu.toString());
        }
    }
}
