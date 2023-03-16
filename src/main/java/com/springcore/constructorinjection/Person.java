package com.springcore.constructorinjection;

public class Person {

	private String name;
	private int pId;
	private Certi certi;
	public Person(String name, int pId, Certi certi) {
		super();
		this.name = name;
		this.pId = pId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.pId+"("+this.certi.name+"}";
	}
	
	
}
