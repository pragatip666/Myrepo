package com.lti.casestudy.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAppEngine implements AppEngine {
	private List<StudentClass> students = new ArrayList<StudentClass>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Enroll> enrollments = new ArrayList<Enroll>();

	@Override
	public void register(StudentClass student) {
		
		students.add(student);
		
		
	}
	

	@Override
	public void introduce(Course course) {
		courses.add(course);
		
		
	}

	@Override
	
	public void enroll(StudentClass student, Course course) {
		Enroll enroll = new Enroll(student, course,LocalDate.now());
		enrollments.add(enroll);
		
	}

	@Override
	public List<StudentClass> ListOfStudents() {
		return students;
		
	}

	@Override
	public List<Course> ListOfCourse() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public List<Enroll> ListOfEnrollment() {
		// TODO Auto-generated method stub
		return enrollments;
	}

}
