package com.lti.casestudy.day4;
import java.util.List;

public interface AppEngine {
	public void register(StudentClass student);
	public void introduce(Course course);
	public void enroll(StudentClass student,Course  course);
	public List<StudentClass>ListOfStudents();
	public List<Course>ListOfCourse();
	public List<Enroll>ListOfEnrollment();
	

}
