package com.dao;

import com.entity.SpringBootTest;

public interface SpringBootTestMapper {
    int deleteByPrimaryKey(Boolean springBootId);

    int insert(SpringBootTest record);

    int insertSelective(SpringBootTest record);

    SpringBootTest selectByPrimaryKey(Boolean springBootId);

    int updateByPrimaryKeySelective(SpringBootTest record);

    int updateByPrimaryKey(SpringBootTest record);
}