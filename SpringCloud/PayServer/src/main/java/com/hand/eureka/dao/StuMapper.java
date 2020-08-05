package com.hand.eureka.dao;
import java.util.List;

import com.hand.eureka.entity.Stu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper {

    List<Stu> findByAll(Stu stu);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}