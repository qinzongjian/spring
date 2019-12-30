package com.qinzj.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 后置通知接口，需要实现AfterReturningAdvice接口，并且实现afterReturning方法
 * @author zhhs
 *
 */
public class LogAfter implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("[后置通知]：返回值：" + returnValue + ", 方法名:" + method.getName() + ",参数长度：" + args.length + ",目标对象：" + target);
	}

}
