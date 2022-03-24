package com.debug.aop;

import com.debug.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.debug")
@Configuration
public class AopConfig {

	@Bean
	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}

	@Bean
	public UserAspect userAspect() {
		return new UserAspect();
	}


}
