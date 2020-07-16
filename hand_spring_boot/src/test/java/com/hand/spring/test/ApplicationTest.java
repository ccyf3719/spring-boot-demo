package com.hand.spring.test;

import com.hand.spring.SpringBootDemo;
import com.hand.spring.demo.UserMapper;
import com.hand.spring.demo.controller.HelloController;
import com.hand.spring.demo.pojo.User;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootDemo.class})
@Slf4j
public class ApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void helloTest(){
        log.warn("test hello");
        for (User user : userMapper.findAll()) {
            log.warn(user.getSpring_boot_like());
            TestCase.assertEquals(user.toString(),user.toString());
        }

    }

}
