package com.tcs.week1;

public class Investor {

	private int investorId;
	private String investorName;
	private double amount;
	private String instrument;
	public int getInvestorId() {
		return investorId;
	}
	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}
	public String getInvestorName() {
		return investorName;
	}
	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	public Investor(int investorId, String investorName, double amount, String instrument) {
		super();
		this.investorId = investorId;
		this.investorName = investorName;
		this.amount = amount;
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Investor [investorId=" + investorId + ", investorName=" + investorName + ", amount=" + amount
				+ ", instrument=" + instrument + "]";
	}
	
}
