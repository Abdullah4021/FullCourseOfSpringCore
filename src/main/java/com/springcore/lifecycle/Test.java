package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		context.registerShutdownHook();
		System.out.println("---------------------------");
		
		  Pepsi p1 = (Pepsi) context.getBean("p1"); System.out.println(p1);
		  context.registerShutdownHook();
		 
			/*
			 * Chai c1 = (Chai) context.getBean("c1"); System.out.println(c1);
			 * context.registerShutdownHook();
			 */
		
	}
}
