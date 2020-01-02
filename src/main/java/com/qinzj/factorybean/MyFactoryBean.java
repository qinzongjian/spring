package com.qinzj.factorybean;

import org.springframework.beans.factory.FactoryBean;

import com.qinzj.service.UserService;

public class MyFactoryBean implements FactoryBean<UserService> {

	@Override
	public UserService getObject() throws Exception {
		return new UserService();
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}

}
