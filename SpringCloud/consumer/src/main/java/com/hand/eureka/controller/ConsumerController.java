package com.hand.eureka.controller;

import com.hand.eureka.entity.CommonResult;
import com.hand.eureka.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL = "http://provider";

    @RequestMapping("/getAll/{id}")
    public CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/getAll/{id}", CommonResult.class,id);
    }

    @GetMapping("/getAll/entity/{id}")
    public CommonResult<List<Stu>> getAllEntity(@PathVariable("id") Integer id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/getAll/{id}", CommonResult.class,id);

        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else{
            return new CommonResult<>(444,"some error in database!");
        }
    }
}
