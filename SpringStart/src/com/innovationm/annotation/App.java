package com.innovationm.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationSpring.xml");
		Car car = (Car) context.getBean("car");
		car.setA(5);
		car.drive();
		
	}

}
