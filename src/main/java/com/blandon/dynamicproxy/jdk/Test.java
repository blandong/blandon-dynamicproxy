package com.blandon.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		
		MyInvocation myInvocation = new MyInvocation();
		
		PersonImpl personImpl = new PersonImpl();
		personImpl.setName("nedlon");
		
		myInvocation.setPersonImpl(personImpl);
		
		Person proxy = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, myInvocation);
		
		proxy.getName();
		
		
		
	}
}
