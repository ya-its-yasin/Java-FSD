package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans2 {

	public static void main(String[] args) {
		// creating a context mothod to get all beans from the beans.xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml"); 
		
		
		context.registerShutdownHook(); // gives chance to the beans to execute their destroy methods
		
		// now we are getting an object B by getting the bean from the bean.xml file
		// bean is created by injecting a setter
		Object obj = context.getBean("b");
		B b = (B) obj;
		b.other();
		
		// now we are getting an object C from the bean.xml file
		// here the bean is created by injecting a constructor
		Object obj2 = context.getBean("c");
		C c=(C) obj2;
		c.another();
		
		
		boolean res = context.isPrototype("a");
		System.out.println("is C a prototype? " + res);
		
	}
}
