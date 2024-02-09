package com.tcs.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class InvestmentTransactions {

	
	ArrayList<Investor> in = new ArrayList<>();
	ArrayList<Transaction> ts = new ArrayList<>();
		
	public boolean addTransaction(Transaction t)
	{
		return isInvestorExist(t.getInvestorId()) ? ts.add(t) : false;
		
	}
	
	public boolean addInvestor(Investor i)
	{
		if(!isInvestorExist(i.getId()))
		{
			in.add(i);
		}
		return false;
	}
	
	private boolean isInvestorExist(int investorId) {
		
		for(Investor inv : in)
		{
			if(inv.getId()==investorId)
				return true;
		}
		return false;
	}

	public void showTransaction()
	{
		//System.out.println(ts);
		
		Iterator<Transaction> iter = ts.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
	
	public Transaction showGivenTransaction(int tsId)
	{
		for(Transaction i : ts)
		{
			if(i.getTid()==tsId)
				return i;
		}
		return null;
	}
	
	public boolean updateTransaction(int tsId, double amt, int invId)
	{
		for(Transaction i : ts)
		{
			if(i.getTid()==tsId)
			{
				i.setTransAmount(amt);
				i.setInvestorId(invId);
				return true;
			}
		}
		return false;
	}
	
	

}
