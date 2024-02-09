package com.tcs.oops.access;

public class SamePackageSameClass {

	private int a = 1;
	int b = 1;
	protected int c = 1 ;
	public int d = 1;
	
	
	public void testA(String[] args) {
		System.out.println(a + b + c + d);
	}
}
