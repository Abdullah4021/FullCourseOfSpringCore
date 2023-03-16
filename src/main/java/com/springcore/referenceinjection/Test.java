package com.springcore.referenceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referenceinjection/refconfig.xml");
		A aref = (A) context.getBean("aref");
		System.out.println(aref);
		System.out.println(aref.getX());
		System.out.println(aref.getOb().getY());
	}
}
