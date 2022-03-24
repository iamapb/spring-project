package com.debug.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

	@Pointcut("execution(* com.debug.service.UserServiceImpl.add(..))")
	public void pointCutExecution(){}

	@Before("pointCutExecution()")
	public void before(){
		System.out.println("--------before--------");
	}

	@After("pointCutExecution()")
	public void after(){
		System.out.println("--------after--------");
	}
}
