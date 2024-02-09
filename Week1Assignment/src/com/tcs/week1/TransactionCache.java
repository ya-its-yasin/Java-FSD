package com.tcs.week1;

import java.util.ArrayList;
import java.util.Iterator;


public class TransactionCache {

	ArrayList<Investor> in = new ArrayList<>();
	ArrayList<Transaction> ts = new ArrayList<>();
	
	public void addTransaction(Transaction t)
	{
		if(isInvestorExist(t.getInvestorId()))
		{
			System.out.println("Transaction " + t.getTransactionId() + " is successfull");
			ts.add(t);
		}
		else
			System.out.println("Transaction " + t.getTransactionId() + " failed!! Investor does not exist");
		
	}
	
	public boolean addInvestor(Investor i)
	{
		if(!isInvestorExist(i.getInvestorId()))
		{
			System.out.println("Investor " + i.getInvestorId() + " is successfully created");
			in.add(i);
		}
		else
		{
			System.out.println("Investor " + i.getInvestorId() + " already exist");
		}
		return false;
	}
	
	private boolean isInvestorExist(int investorId) {
		
		for(Investor inv : in)
		{
			if(inv.getInvestorId()==investorId)
				return true;
		}
		return false;
	}

	public void showTransaction()
	{
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
			if(i.getInvestorId()==tsId)
				return i;
		}
		return null;
	}
	
	public boolean updateTransaction(int tsId, double amt, int invId)
	{
		for(Transaction i : ts)
		{
			if(i.getInvestorId()==tsId)
			{
				i.setTransactionAmount(amt);
				i.setInvestorId(invId);
				return true;
			}
		}
		return false;
	}
	
}
