package com;

import com.dao.StuMapper;
import com.entity.Stu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootStart {
    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(SpringBootStart.class,args);
        StuMapper stuMapper = application.getBean(StuMapper.class);
        List<Stu> list = stuMapper.findByAll(null);
        for (Stu stu : list) {
            System.out.println(stu.toString());
        }
    }
}
