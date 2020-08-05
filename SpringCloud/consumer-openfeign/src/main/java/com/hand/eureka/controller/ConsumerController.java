package com.hand.eureka.controller;

import com.hand.eureka.entity.CommonResult;
import com.hand.eureka.entity.Stu;
import com.hand.eureka.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import javax.annotation.Resource;

@RestController
@Slf4j
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping("/getAll/{id}")
    public CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id){
        return consumerService.getAll(id);
    }

}
