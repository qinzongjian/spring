package com.qinzj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logAnnotation")
@Aspect
public class LogAnnotation {
	
	/**
	 * 注解实现的前置通知，通过参数JoinPoint可以获取方法的参数，参数JoinPoint可以不写
	 * @param jp
	 */
	@Before("execution(public * com.qinzj.service.*.*(..))")
	public void before(JoinPoint jp) {
		
		System.out.println("[注解实现的前置通知]");
		
	}
	
	/**
	 * 注解实现的后置通知
	 * 参数通过JoinPoint获取，返回值通过returnValue获取，且需要在AfterReturning注解中配置returning属性
	 * @param jp
	 * @param returnValue
	 */
	@AfterReturning(pointcut = "execution(public * com.qinzj.service.*.*(..))", returning = "returnValue")
	public void after(JoinPoint jp, Object returnValue) {
		System.out.println("[注解实现的后置通知]返回值：" + returnValue);
	}
	
	/**
	 * 注解实现的异常通知
	 * 通过第二个参数，可以限制某一个类型的异常，才进行捕获，本例中只捕获NullPointerException异常
	 * 注意：有可能会被环绕通知影响到，因为环绕通知里面进行了异常捕获，导致业务方法没有报异常
	 */
	@AfterThrowing(pointcut = "execution(public * com.qinzj.service.*.*(..))",throwing = "e")
	public void exception(JoinPoint jp, NullPointerException e) {
		System.out.println("[======>>>>单独注解实现的异常通知]");
	}
	
	/**
	 * 注意，环绕通知参数是ProceedingJoinPoint
	 * 其他通知是JoinPoint
	 * @param jp
	 */
	/*@Around("execution(public * com.qinzj.service.*.*(..))")
	public void around(ProceedingJoinPoint jp) {
		
		//方法执行之前（前置通知）
		System.out.println("[注解-----环绕通知-----前置通知]");
		try {
			
			//方法执行时
			jp.proceed(); //方法执行
			//方法执行之后（后置通知）
			System.out.println("[注解-----环绕通知-----后置通知]");
			
		} catch (Throwable e) {
			//异常通知
			System.out.println("[注解-----环绕通知-----异常通知]");
		} finally {
			//最终通知
			System.out.println("[注解-----环绕通知-----最终通知]");
		}
		
		System.out.println("注解实现的环绕通知");
	}
	*/
	/**
	 * 最终通知
	 * 注意，最终通知是After，后置通知是AfterReturning
	 */
	@After("execution(public * com.qinzj.service.*.*(..))")
	public void finallyAdvice() {
		System.out.println("【注解实现的最终通知】");
	}
	
}
