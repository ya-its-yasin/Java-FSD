package com.tcs.inv;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {

	@Id
	private int id;
	private String date;
	private double amout;
	private int investorId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public Transactions(int id, String date, double amout, int investorId) {
		super();
		this.id = id;
		this.date = date;
		this.amout = amout;
		this.investorId = investorId;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", amout=" + amout + ", investorId=" + investorId + "]";
	}
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
}
