package com.tcs.ioc;

public class C {

	A a;
	/* this is not an instance.. 
	this is a dependency in spring and spring will inject this dependency from the beans.xml
	using setter constructor methodology
	*/
	public C() {
		// TODO Auto-generated constructor stub
	}
	public C(A a) {
		// TODO Auto-generated constructor stub
		super();
		this.a=a;
	}
	
	public void another()
	{
		System.out.println(getClass());
		a.method();
	}
}
