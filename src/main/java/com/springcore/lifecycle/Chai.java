package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chai {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Chai() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chai [type=" + type + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init method using annotation");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy methodd usig annotation");
	}

}
