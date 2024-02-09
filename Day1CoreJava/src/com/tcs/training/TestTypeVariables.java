package com.tcs.training;

public class TestTypeVariables {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a ;
		//System.out.println(c);
		
		int total = 575;
		int subjects = 6;
		
		int avg = total/subjects;
		String grade;
		if(avg>90)
			grade = "A+";
		else if(avg>80)
			grade = "A";
		else if(avg>70)
			grade = "B";
		else if(avg>60)
			grade = "C";
		else
			grade = "D";
		
		//System.out.println(avg + " -> " + grade);
		
		int start = 0;
		int stop = 100;
		/*while(start<stop)
		{
			//System.out.println("Run =" + start++);
		}
		
		int window=0, tempsum=0;
		for(start=1; start<=stop;start++)
		{
			if(window==3)
			{
				System.out.println("sum of -> " + (start-1) + " " + (start-2) + " " + (start-3) + " =>" + tempsum);
				window = 1;
				tempsum = start;
				continue;
			}
			tempsum+=start;
			window++;
		}
		*/
		
		double amt = 1_00_000;
		int yrs = 25;
		double per = 13;
		for(;yrs>0; amt+=(per/100)*amt, yrs--);
		
		System.out.println(amt);
		

		
		
		
	}
}
