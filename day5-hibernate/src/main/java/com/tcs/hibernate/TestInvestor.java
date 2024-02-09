package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInvestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 create and configure the config object
		Configuration config = new Configuration();
		config.configure();
		
		// step 2 -> session factory
		SessionFactory factory = config.buildSessionFactory();
		
		//step 3 -> creating session from factory
		Session session = factory.openSession();
		
		//step 4 -> create transaction object
		Transaction tr = session.beginTransaction();
		
		//step 5 -> create objects to insert in the database
		Investor i1 = new Investor();
		i1.setName("Yasin");
		i1.setAmount(45000);
		
		//step 6 -> save object into session
		session.save(i1);
		
		//step 7 -> commit transaction
		tr.commit();
		
		Query<Investor> query = session.createQuery("select i from Investor i");
		List<Investor> list = query.list();
		Iterator<Investor> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		//step 8 -> close session
		session.close();
		
		
		
		
		
		
		
	}

}
