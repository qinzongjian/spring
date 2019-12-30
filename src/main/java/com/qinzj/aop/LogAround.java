package com.qinzj.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知，实现MethodInterceptor接口，并且实现invoke方法
 * 通过MethodInterceptor，可以知道，环绕通知是通过拦截器的方式实现的
 * @author zhhs
 *
 */
public class LogAround implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object result = null;
		
		//方法体1（前置通知）
		
		System.out.println("[环绕通知实现的前置通知1]");
		
		try {
			
			//方法体2（前置通知）
			System.out.println("[环绕通知实现的前置通知2]");
			
			result = invocation.proceed(); //执行业务方法
			
			//方法体3（后置通知）
			System.out.println("[环绕通知实现的后置通知1]");
			
		} catch (Exception e) {
			
			//方法体4（异常通知）
			System.out.println("[环绕通知实现的异常通知1]");
		}
		
		return result;
	}

}
