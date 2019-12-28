package com.qinzj.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.qinzj.service.UserService;

@Component("userController")
public class UserController {
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	public String showUserInfo() {
		
		userService.showUserInfo();
		
		return null;
	}
	
}
