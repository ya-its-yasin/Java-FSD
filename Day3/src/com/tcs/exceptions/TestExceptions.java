package com.tcs.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceptions {

	public static void main(String[] args) {
		
//		try{
//			System.out.println(10/0);
//		}
//		catch(Exception e)
//		{
//			System.out.println((e.toString()));
//		}
//		System.out.println("after division");
		
		try {
			Exception e = method(new RuntimeException());
			System.out.println(e.toString());
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static Exception method(RuntimeException r) throws Exception
	{
		if(r==null)
			throw new Exception("poyachi...");
		else
			return new RuntimeException("returning without exception");
	}
}
