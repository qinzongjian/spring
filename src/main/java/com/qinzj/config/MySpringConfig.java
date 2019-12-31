package com.qinzj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.qinzj.entity.UserEntity;
import com.qinzj.service.UserService;

/**
 * 通过注解的形式配置bean
 * @author PVer
 *
 */
@Configuration
@ComponentScan("com.qinzj") //@Configuration只能获取注解形式的bean，通过@ComponentScan注解，可以把xml中配置的bean也获取
public class MySpringConfig {
	
	
	@Bean 
	@Scope("prototype")
	public UserService userService2() { 
		 return new UserService(); 
	}
	
	@Bean 
	public UserEntity user2() { 
		 return new UserEntity(); 
	}
	 
	
}
