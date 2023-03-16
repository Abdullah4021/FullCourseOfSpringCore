package com.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}
}
