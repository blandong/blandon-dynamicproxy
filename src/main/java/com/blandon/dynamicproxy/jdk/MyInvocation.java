package com.blandon.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler{
	
	private PersonImpl personImpl;
	

	public void setPersonImpl(PersonImpl personImpl) {
		this.personImpl = personImpl;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("before invoke........");
		
		Object object = method.invoke(personImpl, args);
		
		System.out.println("after invoking.....");
		
		return object;
	}

}
