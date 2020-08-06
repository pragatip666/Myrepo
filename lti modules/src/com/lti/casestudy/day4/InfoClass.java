package com.lti.casestudy.day4;

public class InfoClass {
	
		public void display(StudentClass student,Course course,Enroll enroll)
		{
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getDob());
			
			System.out.println(course.getId());
			System.out.println(course.getName());
			System.out.println(course.getFees());
			System.out.println(course.getDuration());
			
			System.out.println(enroll.getEnrollmentDate());
			System.out.println(enroll.getCourse());
			System.out.println(enroll.getStudent());
			
		}
		
}
			
			
			

	



