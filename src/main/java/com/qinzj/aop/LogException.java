package com.qinzj.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知，异常通知需要实现ThrowsAdvice接口，实现方法可以查看ThrowsAdvice接口的源码注释
 * @author zhhs
 *
 */
public class LogException implements ThrowsAdvice{
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("[异常通知]方法名：" + method.getName() + ",参数长度:" + args.length + ",目标对象：" + target + ",异常类型：" + ex.getMessage());
	}
	
}
