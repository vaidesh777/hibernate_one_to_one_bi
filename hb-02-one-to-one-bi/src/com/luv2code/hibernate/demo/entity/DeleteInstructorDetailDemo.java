package com.luv2code.hibernate.demo.entity;

import org.hibernate.SessionFactory;

import com.luv2code.hibernate.demo.entity.Student;

import org.cfg.Configuration;

public class DeleteInstructorDetailDemo {

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
			
			session.beginTransaction();
			
			int theId=2;
			
			InstructorDetail theInstructorDetail=session.get(InstructorDetail.class,theId);
			
			
			System.out.println("tempInstructordetail"+tempInstructordetail);
			
			System.out.println("associated instructor"+tempInstructorDetail.getInstructor());
			
			
			//save the instructor
			System.out.println("saving instructor"+tempInstructor);
			session.save((tempInstructor);
			
			session.getTransaction().comit();
			System.out.println("done!");
			
		}catch(Exception exc)
		{
			exc.printStackTrace();
		}
		finally
		{
			session.close();
			factory.close();
		}
	}

}
