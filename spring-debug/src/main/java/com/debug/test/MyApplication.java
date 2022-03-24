package com.debug.test;

import com.debug.aop.AopConfig;
import com.debug.bean.Student;
import com.debug.service.Userservice;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//		Userservice userService = context.getBean(Userservice.class);
//		userService.add();
	}
}
