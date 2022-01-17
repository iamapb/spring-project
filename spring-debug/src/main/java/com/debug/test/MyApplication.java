package com.debug.test;

import com.debug.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
