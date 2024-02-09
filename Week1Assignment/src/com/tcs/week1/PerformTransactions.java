package com.tcs.week1;

public class PerformTransactions {

	public static void main(String[] args) {
		
		Investor i1 = new Investor(1,"abc", 5000, "shares");
		Investor i2 = new Investor(2,"def", 10000, "bond");
		Investor i3 = new Investor(3,"ghi", 15000, "shares");
		Investor i4 = new Investor(3,"ghi", 15000, "shares");

		Transaction t1 = new Transaction(101, 2000, "Jan-05-2024", 1);
		Transaction t2 = new Transaction(102, 500, "Dec-26-2023", 2);
		Transaction t3 = new Transaction(103, 4000, "Feb-01-2024", 5);
		
		TransactionCache it = new TransactionCache();
		
		it.addInvestor(i1);
		it.addInvestor(i2);
		it.addInvestor(i3);
		it.addInvestor(i4);
		
		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		
		//System.out.println(it.ts);
	}
}
