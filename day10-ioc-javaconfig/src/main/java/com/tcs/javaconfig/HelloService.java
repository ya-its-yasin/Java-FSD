package com.tcs.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Autowired
	HelloWorldImpl hello;
	
	public String callHello()
	{
		return hello.message();
	}
	
}
