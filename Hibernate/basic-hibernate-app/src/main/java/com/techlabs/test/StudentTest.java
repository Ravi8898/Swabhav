package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.configure().buildSessionFactory();
		System.out.println(factory.getClass());
		
		Session session=null;
		Transaction txn= null;
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		try {
			
			session=factory.openSession();
			System.out.println(session);
			
			s1.setName("Ravi");
			s1.setCgpi(8.2);
			
			s2.setName("Sunny");
			s2.setCgpi(7.2);
			
			s3.setName("Nilam");
			s3.setCgpi(7.7);
			
			txn=session.beginTransaction();
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			txn.commit();
			
		}catch(Exception ex) {
			if(txn!=null) {
				txn.rollback();
			}
			
			
		}finally {
			if(session.isOpen())
				session.close();
		}

	}
}
