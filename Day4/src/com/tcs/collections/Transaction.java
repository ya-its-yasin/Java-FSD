package com.tcs.collections;

public class Transaction {

	private int tid;
	private String transDate;
	private double transAmount;
	private int investorId;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public Transaction(int tid, String transDate, double transAmount, int investorId) {
		super();
		this.tid = tid;
		this.transDate = transDate;
		this.transAmount = transAmount;
		this.investorId = investorId;
	}
	
	public Transaction() {}
	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", transDate=" + transDate + ", transAmount=" + transAmount + ", investorId="
				+ investorId + "]";
	}
	
}
