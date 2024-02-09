package com.tcs.inheritance;

public class CardTransactions {
	public static void main(String[] args) {
		Card card=new HDFCVisaDebitCard(12345678,"03/25",919,"JohnJoe",4536,500000);
		System.out.println(card);
		
		ICICIMasterCreditCard icici =new ICICIMasterCreditCard(13123123,"02/27",919,"Vivwk",1232,200000);
		card.swipe(20000);
		
		card =new ICICIMasterCreditCard(13123123,"02/27",919,"Vivwk",1232,200000);
		card.swipe(550000);
		
		//System.out.println(card.temp);
		
	}

}
