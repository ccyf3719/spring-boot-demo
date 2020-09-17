package com.hand.eureka.repository;

import java.util.List;

import com.hand.eureka.dao.StuMapper;
import com.hand.eureka.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/09/17 11:34
 */
@Component
public class PayServerRepository {

	@Autowired
	private StuMapper stuMapper;

	public List<Stu> getAll(){
		return stuMapper.findByAll(new Stu());
	}

	public List<Stu> getAll(Stu stu){
		return stuMapper.findByAll(stu);
	}
}
