package com.qinzj.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyAware implements ApplicationContextAware, BeanNameAware {
	ApplicationContext applicationContext = null;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println(">>>>>" + applicationContext);
		
		this.applicationContext = applicationContext;
	}
	@Override
	public void setBeanName(String name) {
		System.out.println(">>>>>>>>>>>>>>>" + name);
	}

}
