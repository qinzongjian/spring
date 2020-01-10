package com.qinzj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.qinzj.config.MySpringConfig;
import com.qinzj.service.UserService;

@Component("userServlet")
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private UserService userService2;
	private UserService userService3;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void init() throws ServletException {
		
		//ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		//ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
//		ApplicationContext context3 = new AnnotationConfigApplicationContext(MySpringConfig.class);
//		ApplicationContext context4 = new AnnotationConfigApplicationContext(MySpringConfig.class);
//		ApplicationContext context5 = new AnnotationConfigApplicationContext(MySpringConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context7 = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context8 = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext context9 = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context3);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context4);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context5);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context6);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context7);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context8);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + context9);
		
		//userService = (UserService) context.getBean("myFactoryBean");
		//加&符合，取的就是myFactoryBean对象，不加&符合，则取的是myFactoryBean里面的实际对象
		//userService = (UserService) context.getBean("&myFactoryBean");
		userService = (UserService) context.getBean("userService");
		//userService2 = (UserService) context.getBean("userService2");
		//userService3 = (UserService) context.getBean("userService2");
		
		//System.out.println(userService == userService2);
		//System.out.println(userService3 == userService2);
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		for(String beanName : beanNames) {
			System.out.println("====>>" + beanName);
		}
		
		((AnnotationConfigApplicationContext)context).close();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		userService.showUserInfo();
		req.setAttribute("name", "测试userServlet");
		req.getRequestDispatcher("WEB-INF/views/result.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
}
