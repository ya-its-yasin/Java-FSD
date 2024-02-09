package com.tcs.inheritance2;

import com.tcs.inheritance3.interfaces.CardIface;

public class AddOnVisaDebitCard extends Card{

	
	public AddOnVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddOnVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean swipe(double transactionAmount) {
		System.out.println("transaction complete");
		return true;
	}



}
