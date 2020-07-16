package com.hand.stu.value;

import com.hand.stu.value.properties.pojo.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStart {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootStart.class);

    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(SpringBootStart.class,args);
       /* logger.info("value : {}",application.getBean(ValuesProperty.class).getValue());
        logger.info("bean_value : {}",application.getBean(BeanProperty.class));
        logger.info("properties_value : {}",application.getBean(PropertySourceValueOf.class));*/

       logger.info("person info : {}",application.getBean(Person.class).toString());

    }
}
