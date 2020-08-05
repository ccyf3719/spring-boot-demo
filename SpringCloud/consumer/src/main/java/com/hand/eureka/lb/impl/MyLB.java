package com.hand.eureka.lb.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.hand.eureka.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/07/25 13:27
 */
public class MyLB implements LoadBalancer {

	private AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
		return null;
	}
}
