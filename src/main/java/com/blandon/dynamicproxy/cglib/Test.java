package com.blandon.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {
	public static void main(String[] args) {
		
		Interceptor interceptor =  new Interceptor();
		
		User user = new User();
		user.setName("blandon");
		
		interceptor.setUser(user);
		
		User proxy = (User)Enhancer.create(User.class, interceptor);

		String name = proxy.getName();
		
		
	}
}
