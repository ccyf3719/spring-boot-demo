package com.hand.eureka.app.controller;

import com.hand.eureka.app.service.PayServerService;
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
    private PayServerService payServerService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getAll")
    public CommonResult<List<Stu>> getAll(){
        return new CommonResult<>(200,"获取服务成功，端口号为：" + serverPort,payServerService.getAll());
    }

    @RequestMapping("/getAll/{id}")
    public CommonResult<List<Stu>> getAll(@PathVariable("id") Integer id){
        Stu stu = new Stu();
        stu.setId(id);
        List<Stu> list = payServerService.getAll(stu);
        return new CommonResult<>(200, "获取服务成功，端口号为：" + serverPort, list);
    }

    @GetMapping("/hystrixOk")
    public String hystrixOk(){
        return payServerService.hystrixOk();
    }

    @GetMapping("/hystrixError")
    public String hystrixError(){
        return payServerService.hystrixError();
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
