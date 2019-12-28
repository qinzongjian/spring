package com.qinzj.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qinzj.controller.UserController;

/**   
 * 示例1，在配置文件中简单的配置了一些bean，测试是否正确，
* @Description: TODO
* @author qinzj  
* @date 2019年12月26日 上午11:52:25 
*/
public class Example001 {

	public static void main(String[] args) {
		//获取spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//获取bean
		UserController userController = (UserController)ctx.getBean("userController");
		//调用bean的方法
		userController.showUserInfo();
		
	}

}
