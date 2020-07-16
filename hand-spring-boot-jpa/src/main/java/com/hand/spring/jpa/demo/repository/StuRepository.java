package com.hand.spring.jpa.demo.repository;

import com.hand.spring.jpa.demo.pojo.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StuRepository extends JpaRepository<Stu,Long> {
}
