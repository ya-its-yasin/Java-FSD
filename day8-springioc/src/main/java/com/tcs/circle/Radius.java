package com.tcs.circle;

public class Radius {

	Point p1;
	Point p2;
	
	public Radius() {
		// TODO Auto-generated constructor stub
	}

	public Radius(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double getLength()
	{
		System.out.println(p1.x + " " + p2.x + "-> " + Math.abs(p1.x-p2.x));
		return Math.abs(p1.x-p2.x);
	}
	
	
}
