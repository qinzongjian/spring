package com.qinzj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.qinzj.entity.UserEntity;

@Component("userService")
public class UserService {
	
	@Autowired //全局配置可通过在applicationContenxt.xml文件中配置default-autowire="byType/byName"
	private UserEntity user;

	public UserEntity getUser() {
		return user;
	}
	
	public void init() {
		System.out.println("初始化userService");
	}
	
	public void destory() {
		System.out.println("销毁userService");
	}
	
	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	//@Transactional
	public String showUserInfo() {
		System.out.println(user);
		
		//user = null; //模拟异常通知
		
		return user.toString();
	}
	
}
