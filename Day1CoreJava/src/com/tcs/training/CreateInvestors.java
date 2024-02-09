package com.tcs.training;

public class CreateInvestors {

	public static void main(String as[])
	{
		Investor i = new Investor(); // i is reference pointing to a memory at runtime
		
		i.id = 101;
		i.name = "yasin";
		i.address = "some address";
		i.amount = 5000;
		
		System.out.println(i);
		//System.out.println(i.getClass().getName() + '@' + i.hashCode());
	}
}
