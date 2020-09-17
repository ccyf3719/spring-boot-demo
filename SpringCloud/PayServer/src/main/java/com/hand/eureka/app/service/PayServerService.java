package com.hand.eureka.app.service;

import java.util.List;

import com.hand.eureka.entity.Stu;
import com.hand.eureka.repository.PayServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/09/17 11:19
 */
@Service
public class PayServerService {

	@Autowired
	private PayServerRepository PayServerRepository;

	public List<Stu> getAll(){
		return PayServerRepository.getAll();
	}

	public List<Stu> getAll(Stu stu){
		return PayServerRepository.getAll(stu);
	}

	public String hystrixOk(){
		return "当前线程："+Thread.currentThread().getName()+",hystrixOk没啥毛病";
	}

	public String hystrixError(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "当前线程："+Thread.currentThread().getName()+",hystrixError也没啥毛病";
	}

}
