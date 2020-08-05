package com.hand.eureka.controller;

import com.hand.eureka.dao.StuMapper;
import com.hand.eureka.entity.CommonResult;
import com.hand.eureka.entity.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.annotation.Resource;

@RestController
@Slf4j
public class StuController {

    @Autowired
    private StuMapper stuMapper;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getAll/{id}")
    public CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id){
        Stu stu = new Stu();
        stu.setId(id);
        List<Stu> list = stuMapper.findByAll(stu);
        return new CommonResult<List<Stu>>(200,"获取服务成功，端口号为："+serverPort,list);
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("************{}***********",service);
        }
        log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!discoveryClient.getInstances!!!!!!!!!!!!!!!!!!!");
        List<ServiceInstance> provider = discoveryClient.getInstances("PROVIDER");
        for (ServiceInstance serviceInstance : provider) {
            log.info("---{}----------{}---------{}-------",
                    serviceInstance.getHost(),serviceInstance.getPort(),serviceInstance.getUri());
        }
        return discoveryClient;
    }

}
