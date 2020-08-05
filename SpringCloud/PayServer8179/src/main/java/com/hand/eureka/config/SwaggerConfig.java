package com.hand.eureka.config;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description
 *
 * @author yifei.cuan@hand-china.com 2020/07/21 16:56
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private ApiInfo apiInfo(){
		return new ApiInfo("ghost swagger",
				"Api Documentation",
				"version 1.0",
				"urn:tos",
				DEFAULT_CONTACT,
				"Apache 2.0",
				"http://localhost:8176",
				new ArrayList());
	}

	@Value("${swagger.active}")
	boolean active;

	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("payServer8179")
				.apiInfo(apiInfo())
				.enable(active)
				.select()
				.build()
				;
	}
}
