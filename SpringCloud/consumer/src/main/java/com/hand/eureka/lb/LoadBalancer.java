package com.hand.eureka.lb;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/07/25 13:25
 */
public interface LoadBalancer {

	ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
