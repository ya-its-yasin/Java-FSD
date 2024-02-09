package com.tcs.inv;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Investor {

	@Id
	private int id;
	private String name;
	private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Investor(int id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
}
