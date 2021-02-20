package com.packt.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.packt.model.BankEmployee;

public class TestingHibernate1 {
	public static void main(String[] args)
	{
		BankEmployee be1 = new BankEmployee();
		be1.setID(1);
		be1.setFirstName("Imtiaz");
		be1.setSurname("Patel");
		be1.setAge(43);
		be1.setSalary(34224);
		be1.setDesignation("Manager");
		be1.setBranch("London");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(be1);
		session.getTransaction().commit();
		session.close();
		
		BankEmployee retrievedBE;
		session = sessionFactory.openSession();
		session.beginTransaction();
		retrievedBE = (BankEmployee)session.get(BankEmployee.class, 1);
		System.out.println(retrievedBE.toString());
		
		}

}
