package com.tcs.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PerformTransactions {

	public static void main(String[] args) {
		Investor i1 = new Investor(1,"abc", "chennai", 5000, "shares");
		Investor i2 = new Investor(2,"def", "hyd", 10000, "shares");
		Investor i3 = new Investor(3,"ghi", "pune", 15000, "shares");
		Investor i4 = new Investor(4,"jkl", "delhi", 20000, "shares");
		Investor i5 = new Investor(5,"mno", "mumbai", 25000, "shares");
		Investor i6 = new Investor(5,"mno", "mumbai", 25000, "shares");
		Investor i7 = i6;
		
		
		Transaction t1 = new Transaction(101,"some date", 4000, 5);
		Transaction t2 = new Transaction(102,"some date", 4000, 5);
		Transaction t3 = new Transaction(103,"some date", 4000, 5);
		
		InvestmentTransactions it = new InvestmentTransactions();
		it.addTransaction(t1);
		it.addTransaction(t2);
		it.addTransaction(t3);
		
		//it.showTransaction();
		//System.out.println(it.showGivenTransaction(101));
		
		
		//System.out.println((it.updateTransaction(103, 12345, 4)));
		//System.out.println(it.showGivenTransaction(103));
		
		HashSet<Investor> hs = new HashSet<>();
		hs.add(i1);
		hs.add(i2);
		hs.add(i3);
		hs.add(i4);
		hs.add(i5);
		hs.add(i6);
		hs.add(i7);
		hs.add(null);
		//System.out.println(hs.size());
		
		ArrayList<Set<Investor>> list = new ArrayList<>();
		
		list.add(hs);
		HashSet<Investor> set2 = hs;
		HashSet<Investor> set3 = hs;
		
		list.add(set2);
		list.add(set3);
		
		//System.out.println(list);
		
		
		
		HashMap<Integer,Investor> dataMap = new HashMap<>();
		dataMap.put(i5.getId(), i5);
		dataMap.put(i3.getId(), i3);
		dataMap.put(i4.getId(), i4);
		dataMap.put(i2.getId(), i2);
		dataMap.put(i2.getId(), i2);
		System.out.println(dataMap);
		
		System.out.println(dataMap.keySet());
		
		System.out.println(dataMap.values());
		
		System.out.println();
		var keyValues = dataMap.entrySet();
		
		var i = keyValues.iterator();
		while(i.hasNext())
		{
			var entry = i.next();
			System.out.println(entry);
			
		}
		
		
	}
}
