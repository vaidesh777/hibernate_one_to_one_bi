package com.luv2code.hibernate.demo.entity;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class CreateDemo {

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
			
			
			
			
			//start a transaction
			
			session.beginTransaction();
			
			//get instructor by primary key
			int theId=1;
			
			Instructor theInstructor=session.get(Instructor.class,theId);
			System.out.println("found instructor"+theInstructor);
			
			//delete the instructor
			if(theInstructor!=null)
			{
				System.out.println("deleting"+theInstructor);
				session.delete(tempInstructor);
			}
			
			
			session.getTransaction().comit();
			System.out.println("done!");
			
		}

	}

}
