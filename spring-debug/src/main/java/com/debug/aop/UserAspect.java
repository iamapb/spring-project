package com.debug.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

	@Pointcut("execution(* com.debug.service.*.*(..))")
	public void pointCutExecution(){}

	@Before("com.debug.aop.UserAspect.pointCutExecution()")
	public void before(){
		System.out.println("--------before--------");
	}

	@After("com.debug.aop.UserAspect.pointCutExecution()")
	public void after(){
		System.out.println("--------after--------");
	}
}
