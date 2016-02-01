package com.blandon.dynamicproxy.jdk;

public class PersonImpl implements Person{

	private String name;
	
	@Override
	public String getName() {
		System.out.println("name is: "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
