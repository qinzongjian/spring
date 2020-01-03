package com.qinzj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 拦截整个Spring IoC容器
 * @author PVer
 *
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		beanFactory.getBeanDefinition("");//根据bean名称获取bean
		beanFactory.getBeanDefinitionCount();//获取容器中bean的数量
		beanFactory.getBeanDefinitionNames();//获取容器中所有的bean的名称
		
		System.out.println("----------查看初始化顺序");
		
	}

}
