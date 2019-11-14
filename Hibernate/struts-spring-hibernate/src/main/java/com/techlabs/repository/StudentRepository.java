package com.techlabs.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	public StudentRepository() {
		System.out.println("Repository Created...");
		
	}
	
	public List<Student> getStudents() {
		Session session=sessionFactory.openSession();
		List<Student> students=session.createCriteria(Student.class).list();
		return students;
		
		
	}
	
	
}
