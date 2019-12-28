package com.qinzj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qinzj.entity.UserEntity;

@Component("userService")
public class UserService {
	
	private UserEntity user;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
	public String showUserInfo() {
		System.out.println(user);
		return user.toString();
	}
	
}
