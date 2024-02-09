package com.tcs.circle;

public class Circle {

	Radius r;
	
	public void setRadius(Radius r)
	{
		this.r= r;
	}
	
	public double area(double a, double b)
	{
		r.p1.x = a;
		r.p2.x = b;
		double length = r.getLength();
		//System.out.println(r.p1.x);
		
		return 3.14 * length * length;
	}
}
