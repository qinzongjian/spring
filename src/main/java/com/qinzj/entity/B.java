package com.qinzj.entity;

public class B {
	
	private A a;
	
	public B() {
		
	}
	
	public B(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
	
	public String test() {
		
		System.out.println("在B中通过A的方法调用输出");
		
		return "bbbb----aaaa";
	}
	
}
