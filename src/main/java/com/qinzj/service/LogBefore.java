package com.qinzj.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBefore implements MethodBeforeAdvice {
	
	public void beforeAOP() {
		
		System.out.println("beforeAOP........");
		
	}

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("beforeAOP........");
	}
	
}
