package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		System.out.println(factory);
		Session session = factory.openSession();
		System.out.println(session);
		
		Transaction tr = session.beginTransaction();
		Employee e1 = new Employee();
		//e1.setEno(2);
		e1.setEname("Nivaz");
		e1.setSal(650000);
		
		session.save(e1);
		//tr.commit();
		
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp);
		
		emp.setSal(750000);
		
		session.update(emp);
		
		
		tr.commit();
		Employee emp1 = session.get(Employee.class, 1);
		System.out.println(emp1);
		
		
		
		session.close();
		
	}
}
