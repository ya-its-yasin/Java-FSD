package com.tcs.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		// we created a context from a AppConfig java file instead of am xml file (like beans.xml)
		HelloWorld hello = (HelloWorld) ctxt.getBean("helloBean");
		HelloService service = (HelloService) ctxt.getBean("helloService");
		System.out.println(hello.message());
		System.out.println(service.callHello());
	}

}
