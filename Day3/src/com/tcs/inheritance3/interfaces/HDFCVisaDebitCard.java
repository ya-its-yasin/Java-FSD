package com.tcs.inheritance3.interfaces;

public class HDFCVisaDebitCard extends Card {

	int temp =0;
	
	public HDFCVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFCVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
		
		
	}
	@Override
	public boolean swipe(double transactionAmount) {
		// TODO Auto-generated method stub
		//first get the balance from account
		//based on card no of the customer
		//update the account balance with transactionAmount
		System.out.println("HDFC sucss" + transactionAmount);
		return true;
	}

}
