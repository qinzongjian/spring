package com.qinzj.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qinzj.entity.A;
import com.qinzj.entity.B;

/**   
 * 测试通过构造函数的方式注入循环依赖bean
* @Description: TODO
* @author qinzj  
* @date 2019年12月26日 上午11:53:37 
*/
public class Example002 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//报错
		// org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'a': 
		// Requested bean is currently in creation: Is there an unresolvable circular reference?
		//因为a中引用了b，b中又引用了a，造成循环依赖
		//通过构造函数的方式注入bean，无法解决循环依赖的问题
		B b = (B)ctx.getBean("b");
		
		System.out.println(b.getA().test());
		
		A a = (A) ctx.getBean("a");
		
		System.out.println(a.getB().test());
		
		
	}

}
