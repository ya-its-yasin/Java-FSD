package com.tcs.week1;

import java.util.Date;

public class Transaction {

	private int transactionId;
	private double transactionAmount;
	private String transactionDate;
	private int investorId;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionId, double transactionAmount, String transactionDate, int investorId) {
		super();
		this.transactionId = transactionId;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.investorId = investorId;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionAmount=" + transactionAmount
				+ ", transactionDate=" + transactionDate + ", investorId=" + investorId + "]";
	}
	
}
