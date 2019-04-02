package com.adil.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	public Addition(int a,double b) {
		System.out.println("Inside the constructor");
		System.out.println(a);
		System.out.println(b);
	}
}
