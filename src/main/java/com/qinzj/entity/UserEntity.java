package com.qinzj.entity;

import org.springframework.stereotype.Component;

@Component("user")
public class UserEntity {
	
	private String name;
	
	private String age;
	
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.age + ", " + this.height;
	}
	
}
