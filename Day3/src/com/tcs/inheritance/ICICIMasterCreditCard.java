package com.tcs.inheritance;

public class ICICIMasterCreditCard extends Card {
	
	int temp =0;

	public ICICIMasterCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICIMasterCreditCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipe(double transactionAmount) {
		// TODO Auto-generated method stub
		System.out.println(transactionAmount);
		return true;
	}
	
}
