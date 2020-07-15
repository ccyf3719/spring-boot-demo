package com.hand.spring.demo;

import com.hand.spring.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from spring_boot_test")
    List<User> findAll();
}
