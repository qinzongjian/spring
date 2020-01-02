package com.qinzj.beanDefinitionRegistar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.qinzj.service.UserService;

public class MyImportBeanDefinionRegistar implements ImportBeanDefinitionRegistrar {
	
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, 
			BeanDefinitionRegistry registry) {
		//BeanDefinition beanDefinition = new RootBeanDefinition(UserService.class);
		BeanDefinition beanDefinition = new RootBeanDefinition("com.qinzj.service.UserService");
		registry.registerBeanDefinition("userService", beanDefinition);
	
	}
	
}
