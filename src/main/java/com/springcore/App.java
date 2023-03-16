package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student std1 = (Student) context.getBean("std1");
		Object bean = context.getBean("std2");
		System.out.println(std1);
		System.out.println(bean);
	}
}
