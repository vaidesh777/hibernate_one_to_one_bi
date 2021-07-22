package com.luv2code.hibernate.demo.entity;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class DeleteDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotated Class(Instructor.class)
				.addAnnotated Class(InstructorDetail.class)
				.buildSessionFactory()
				
				
				//create session
				
		Session session=Factory.getCurrentSession();
		
		try
		{
			
			//create the objects
			Instructor tempInstructor=new Instructor("chad","darby","darby@luv2code.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("http://www.luv2code.com/youtube","luv2code!!!");
			
			
			//associate the objects
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			//start a transaction
			
			session.beginTransaction();
			
			//save the instructor
			System.out.println("saving instructor"+tempInstructor);
			session.save((tempInstructor);
			
			session.getTransaction().comit();
			System.out.println("done!");
			
		}

	}

}
