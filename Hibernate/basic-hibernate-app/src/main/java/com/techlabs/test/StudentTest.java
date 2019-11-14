package com.techlabs.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class StudentTest {

	private static Session session = null;

	public static void main(String[] args) {

		Transaction txn = null;

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.configure().buildSessionFactory();
		System.out.println(factory.getClass());

		try {

			session = factory.openSession();
			System.out.println(session);

			txn = session.beginTransaction();

//			deleteById(7);

			updateById(8);
			display();

			txn.commit();

		} catch (

		Exception ex) {
			if (txn != null) {
				txn.rollback();
			}

		} finally {
			if (session.isOpen())
				session.close();
		}

	}

	public static void add() {

		Session session = null;
		Transaction txn = null;

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.configure().buildSessionFactory();
		System.out.println(factory.getClass());

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		try {

			session = factory.openSession();
			System.out.println(session);

			s1.setName("Ravi");
			s1.setCgpi(8.2);

			s2.setName("Sunny");
			s2.setCgpi(7.2);

			s3.setName("Nilam");
			s3.setCgpi(7.7);

			txn = session.beginTransaction();

			session.save(s1);
			session.save(s2);
			session.save(s3);

			txn.commit();

		} catch (Exception ex) {
			if (txn != null) {
				txn.rollback();
			}

		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	public static void display() {

		Query queryResult = session.createQuery("from Student");
		List allStudents;
		allStudents = queryResult.list();
		for (int i = 0; i < allStudents.size(); i++) {
			Student student = (Student) allStudents.get(i);
			System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " CGPI:" + student.getCgpi());
		}

	}

	public static void deleteById(int id) {

		Query queryResult = session.createQuery("from Student");
		List allStudents;
		allStudents = queryResult.list();
		for (int i = 0; i < allStudents.size(); i++) {
			System.out.println("Inside delete for");
			Student student = (Student) allStudents.get(i);
			if (student.getId() == id) {
				System.out.println("Inside delete if");
				session.delete(student);
				System.out.println("stuent delet3ed with id " + id);
			}

		}

	}

	public static void updateById(int id) {

		Query queryResult = session.createQuery("from Student");
		List allStudents;
		allStudents = queryResult.list();
		for (int i = 0; i < allStudents.size(); i++) {
			System.out.println("Inside delete for");
			Student student = (Student) allStudents.get(i);
			if (student.getId() == id) {
				student.setName("Sunny Maurya");
				session.update(student);
			}

		}

	}
}
