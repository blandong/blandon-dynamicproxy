package com.blandon.dynamicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Interceptor implements MethodInterceptor{
	
	private User user;

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		System.out.println("****before*******");
		
		Object object = proxy.invoke(user, args);
		
		System.out.println("******after*******");
		
		return object;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
