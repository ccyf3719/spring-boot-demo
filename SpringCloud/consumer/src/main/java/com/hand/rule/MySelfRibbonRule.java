package com.hand.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/07/25 11:05
 */
@Slf4j
@Configuration
public class MySelfRibbonRule {

	@Bean
	public IRule myRule(){
		log.info("。。。。。。。。。。。。。。。。。。。当前使用随机替换策略。。。。。。。。。。。。。。。。。。");
		//定义Ribbon替换策略为随机
		return new RandomRule();
}
}
