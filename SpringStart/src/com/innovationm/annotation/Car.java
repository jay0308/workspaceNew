package com.innovationm.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Tyre tyre;
	
	private int a;
	
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}


	public void drive() {
		System.out.println("Car "+tyre);
		System.out.println("Car "+a);
	}
}
