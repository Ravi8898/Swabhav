package com.techlabs.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.configure().buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = null;
		Transaction txn = null;

		Department dept1 = new Department();

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		try {

			session = factory.openSession();
			System.out.println(session);

			dept1.setDeptName("Sales");
			dept1.setLocation("Mumbai");

			emp1.setDepartment(dept1);
			emp1.setName("Ravi");
			emp1.setSalary(45000);

			emp2.setDepartment(dept1);
			emp2.setName("Sunny");
			emp2.setSalary(55000);

			emp3.setDepartment(dept1);
			emp3.setName("Nilam");
			emp3.setSalary(47500);
			
			dept1.getEmployees().add(emp1);
			dept1.getEmployees().add(emp2);
			dept1.getEmployees().add(emp3);
			
			dept1.setEmployees(dept1.getEmployees());

			txn = session.beginTransaction();

			session.save(dept1);

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
}
