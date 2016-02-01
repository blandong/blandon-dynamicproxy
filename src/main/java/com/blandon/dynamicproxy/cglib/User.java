package com.blandon.dynamicproxy.cglib;

public class User {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		System.out.println("name is: "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
