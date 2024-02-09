package com.tcs.oops.encap.cons;

import java.util.Objects;

public class Investor {

	private int id;
	private String name;
	private String address;
	private double amount;
	public static int count;
	
	static {
		System.out.println("static print");
	}
	public Investor(int id, String name, String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.count++;
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Investor.count = count;
	}

	public Investor(int id, String name, String address) {
		this(id,name,address,0);
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
		return "Investor [id=" + id + ", name=" + name + ", address=" + address + ", amount=" + amount + "]";
	}
	public Investor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investor other = (Investor) obj;
		return Objects.equals(address, other.address)
				&& id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
}
