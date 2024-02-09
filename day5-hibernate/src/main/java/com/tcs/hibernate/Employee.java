package com.tcs.hibernate;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	(strategy = GenerationType.AUTO)
	private int eno;
	private String ename;
	private double sal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int eno, String ename, double sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public Employee() {}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
}
