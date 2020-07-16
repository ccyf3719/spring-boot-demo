package com.hand.spring.demo.controller;

import com.hand.spring.demo.UserMapper;
import com.hand.spring.demo.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //使用该注解时return的是json字符串
@Slf4j
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public List<User> hello(){
        log.warn("读取数据");
        return userMapper.findAll();
    }

}
