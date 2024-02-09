package com.tcs.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("circle-bean.xml");
		Circle cr = (Circle) context.getBean("circle");
		System.out.println(cr.area(5, 1));
	}
}
