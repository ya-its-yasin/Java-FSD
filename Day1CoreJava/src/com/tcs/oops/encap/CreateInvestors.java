package com.tcs.oops.encap;

public class CreateInvestors {

	public static void main(String[] args) {
		Investor i1 = new Investor();
		i1.setName("John");
		
		//System.out.println(i1.getName());
		
		Investor i2 = new Investor();
		i2.setName("John");
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		Investor i3 = i1;
		
		
		System.out.println(i3==i1);
		
	}
}
