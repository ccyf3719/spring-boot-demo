package com.hand.docker.dao;

import java.util.List;

import com.hand.docker.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestMapper {

    List<Test> findByAll(Test test);

    int deleteByPrimaryKey(Boolean id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Boolean id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}