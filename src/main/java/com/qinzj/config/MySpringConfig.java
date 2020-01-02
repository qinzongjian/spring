package com.qinzj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.qinzj.beanDefinitionRegistar.MyImportBeanDefinionRegistar;
import com.qinzj.entity.A;
import com.qinzj.entity.B;
import com.qinzj.entity.UserEntity;
import com.qinzj.factorybean.MyFactoryBean;
import com.qinzj.selector.MySelector;
import com.qinzj.service.UserService;

/**
 * 通过注解的形式配置bean
 * @author PVer
 *
 */
//@Configuration //注解方式的bean注入，一定是要配置@Configuration
//@Import({A.class, B.class}) //import的方式注入，bean的ID是类的全限定名
//@Import(MySelector.class) //结合选择器使用
//@Import(MyImportBeanDefinionRegistar.class) //结合注册器使用
//@ComponentScan("com.qinzj") //@Configuration只能获取注解形式的bean，通过@ComponentScan注解，可以把xml中配置的bean也获取
public class MySpringConfig {
	
	
	@Bean(value = "userService2", initMethod = "init", destroyMethod = "destory") //Bean注解的方式注入，bean的ID是方法名（首字母自动转换为小写）
	//@Scope("prototype") //设置bean的作用域为prototype，即每次获取都是一个新的对象，默认是单例模式singleton
	public UserService userService2() { 
		 return new UserService(); 
	}
	
	@Bean 
	public UserEntity user2() { 
		 return new UserEntity(); 
	}
	
	
	//@Bean
	public MyFactoryBean myFactoryBean() {
		return new MyFactoryBean();
	}
	
}
