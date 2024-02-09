package com.tcs.collections;

public class Investor {

	private int id;
	private String name;
	private String address;
	private double amount;
	private String type;
	
	public Investor(int id, String name, String address, double amount, String type) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + ", type="
				+ type + "]";
	}


	
}
