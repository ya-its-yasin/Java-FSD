package com.tcs.collections;

public class PerformTransWithExistingInvestor {

	public static void main(String[] args) {
		Investor i1 = new Investor(1,"abc", "chennai", 5000, "shares");
		Investor i2 = new Investor(2,"def", "hyd", 10000, "shares");
		Investor i3 = new Investor(3,"ghi", "pune", 15000, "shares");
		Investor i4 = new Investor(4,"jkl", "delhi", 20000, "shares");
		Investor i5 = new Investor(5,"mno", "mumbai", 25000, "shares");
		Investor i6 = new Investor(5,"mno", "mumbai", 25000, "shares");
		
		
		
		Transaction t1 = new Transaction(101,"some date", 4000, 1);
		Transaction t2 = new Transaction(102,"some date", 4000, 7);
		Transaction t3 = new Transaction(103,"some date", 4000, 5);
		
		InvestmentTransactions it = new InvestmentTransactions();
		
		it.addInvestor(i1);
		it.addInvestor(i2);
		it.addInvestor(i3);
		it.addInvestor(i4);
		it.addInvestor(i5);
		
		System.out.println(it.addTransaction(t1));
		System.out.println(it.addTransaction(t2));
		System.out.println(it.addTransaction(t3));
		
		//System.out.println(it.in.size());
		System.out.println(it.ts);
		
	}
}
