package com.qinzj.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知接口，需要实现MethodBeforeAdvice接口，并且实现before方法
 * @author zhhs
 *
 */
public class LogBefore implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("[spring aop前置通知]-方法名："+method.getName()+ "参数长度：" + args.length + ",目标对象：" + target);
	}
	
}
