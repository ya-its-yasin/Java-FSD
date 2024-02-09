package com.tcs.ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class B {

	A a; 
	/* this is not an instance.. 
	this is a dependency in spring and spring will inject this dependency from the beans.xml
	using setter injection methodology
	*/
	public void setA(A a)
	{
		this.a = a;
	}
	public void other()
	{
		a.method();
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println(getClass() + " init() is called");
	}
	
	@PreDestroy
	public void terminate()
	{
		System.out.println(getClass() + " destroy() is called");
	}
}
