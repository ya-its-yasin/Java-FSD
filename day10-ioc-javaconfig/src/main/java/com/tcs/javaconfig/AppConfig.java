package com.tcs.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// spring uses this classs insteand of an xml file for cofiguration

@Configuration
public class AppConfig {

	@Bean(name="helloBean")
	public HelloWorld getBean()
	{
		return new HelloWorldImpl();
	}
	
	@Bean(name="helloService")
	public HelloService getService()
	{
		return new HelloService();
	}
}
