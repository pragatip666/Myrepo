package com.lti.casestudy.day4;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;

public class UI {
	private Scanner sc = new Scanner(System.in);
	private AppEngine appEngine = new InMemoryAppEngine();
	private InfoClass info = new InfoClass();
	
	public void showMainScreen() {
		System.out.println("Welcome to SMS(STUDENT MANAGEMENT SYSTEM)v1.0");
		System.out.println("Tell us who you are(1.Student or 2. Admin)");
		System.out.println("Enter your Choice(1 or 2)");
		Scanner s = new Scanner(System.in);
		int choice= Integer.parseInt(s.nextLine());
		switch (choice) {
		
		case 1:
			showStudentScreen();
		break;
		case 2:
			showAdminScreen();
			break;
			
			
		
		}
				
	}

	

	private void showAdminScreen() {
		System.out.println("Welcome Admin!");
		System.out.println("1. Add new course\n 2.Browse all courses\n Browse all students\n 4.Browse all enrollment");
		System.out.println("Enter you choice(1 -4 )");
		Scanner s = new Scanner(System.in);
		int choice= Integer.parseInt(s.nextLine());
		switch (choice) {
		case 1:
			showAddCourseSceen();
			
		break;
		case 2:
			showAllCourseScreen();
			break;
		case 3:
			showallstudentScreen();
			break;
		case 4:
			showAllEnollmentScreen();
			break;
		}
			
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	private void showAllEnollmentScreen() {
		// TODO Auto-generated method stub
		
	}

	private void showallstudentScreen() {
		List<StudentClass> students = appEngine.ListOfStudents();
		students.forEach(student -> info.display(student, null, null));
		showMainScreen();
			
		}
		
		
		private void showAddCourseSceen() {
			//List<Course> courses = appEngine.ListOfCourse();
			//courses.forEach(course -> info.display(course,null,null));
			//showMainScreen();
			
		// TODO Auto-generated method stub
		
	}

	private void showStudentScreen() {
		System.out.println("welcome student");
		System.out.println("1. Register\n 2.Browse all courses\n Enroll for course");
		System.out.println("Enter you choice(1 -3 )");
		Scanner s = new Scanner(System.in);
		int choice= Integer.parseInt(s.nextLine());
		switch (choice) {
		case 1:
			showRegisterSceen();
			
		break;
		case 2:
			showAllCourseScreen();
			break;
		case 3:
			showEnrollCourseScreen();
			break;
		}
			
		
		// TODO Auto-generated method stub
		
	}
	    private void showRegisterSceen() {
		Scanner s = new Scanner(System.in);
		StudentClass student = new StudentClass();
		
		System.out.println("Enter your id");
		student.setId(Integer.parseInt(s.nextLine()));
		System.out.println("Enter your name");
		student.setName((s.nextLine()));
		System.out.println("Enter dob : ");
		student.setDob(LocalDate.parse(s.nextLine()));
		
		//AppEngine appEngine = new InMemoryAppEngine();
		appEngine.register(student);
		
		System.out.println("Registration Successful");
		showStudentScreen();
	}
		
		
		
	

	private void showEnrollCourseScreen() {
		// TODO Auto-generated method stub
		
	}

	private void showAllCourseScreen() {
		// TODO Auto-generated method stub
		
}
}

	


