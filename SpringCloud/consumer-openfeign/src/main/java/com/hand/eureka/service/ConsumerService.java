package com.hand.eureka.service;

import java.util.List;

import com.hand.eureka.entity.CommonResult;
import com.hand.eureka.entity.Stu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/07/25 14:40
 */
@Component
@FeignClient("PROVIDER")
public interface ConsumerService {

	@GetMapping("/getAll/{id}")
	CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id);

}
