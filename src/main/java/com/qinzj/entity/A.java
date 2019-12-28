package com.qinzj.entity;

public class A {
	
	private B b;
	
	public A() {
		
	}
	
	public A(B b) {
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	public String test() {
		
		System.out.println("在A中调用B的方法调用输出");
		
		return "aaaa----bbbb";
	}
	
}
