package com.lti.casestudy.day4;

import java.time.LocalDate;

public class Enroll {
	public Enroll(StudentClass student, Course course, LocalDate EnrollmentDate) {
		super();
		Student = student;
		this.course = course;
		this.EnrollmentDate = EnrollmentDate;
	}
	private StudentClass Student;
	private Course course;
	private LocalDate EnrollmentDate;
	public Enroll() {
	}
	
	public StudentClass getStudent() {
		return Student;
	}
	public void setStudent(StudentClass student) {
		Student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalDate getEnrollmentDate() {
		return EnrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.EnrollmentDate = enrollmentDate;
	}
	

}
