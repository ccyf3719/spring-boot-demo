package com.hand.spring.demo.controller;

import com.hand.spring.demo.UserMapper;
import com.hand.spring.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public List<User> hello(){
        return userMapper.findAll();
    }
}
