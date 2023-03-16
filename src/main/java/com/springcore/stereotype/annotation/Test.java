package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/annotation/stereoconfig.xml");
		Student student = context.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());
		Student student2 = context.getBean("ob",Student.class);
		System.out.println(student2.hashCode());
	}
}
