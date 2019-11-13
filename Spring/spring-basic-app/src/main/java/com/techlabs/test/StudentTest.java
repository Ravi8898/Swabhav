package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService svc= (StudentService) cxt.getBean("studentSvc", StudentService.class);
		StudentService svc1= (StudentService) cxt.getBean("studentSvc");
		
		System.out.println(svc.getStudents().size());
		System.out.println(svc1.hashCode()==svc.hashCode());
		
	}
}
