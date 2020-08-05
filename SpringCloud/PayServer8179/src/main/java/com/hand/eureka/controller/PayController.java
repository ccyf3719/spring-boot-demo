package com.hand.eureka.controller;

import com.hand.eureka.dao.StuMapper;
import com.hand.eureka.entity.CommonResult;
import com.hand.eureka.entity.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PayController {

    @Autowired
    private StuMapper stuMapper;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getAll/{id}")
    public CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id){
        Stu stu = new Stu();
        stu.setId(id);
        List<Stu> list = stuMapper.findByAll(stu);
        return new CommonResult<List<Stu>>(200,"获取服务成功，端口号为："+serverPort,list);
    }
}
