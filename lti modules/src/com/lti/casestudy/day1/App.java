package com.lti.casestudy.day1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class App 
{
	private static void scenario1()
	{
		
		Student s1= new Student(1,"Pragati",LocalDate.of(1998,10,7));
		Student s2= new Student(2,"jack",LocalDate.of(1998,10,7));
		Student s3= new Student(3,"Rio",LocalDate.of(1998,10,7));
		
		Info info = new Info();
		info.display(s1);
		info.display(s2);
		info.display(s3);
		
		
		
    }
	public static void main(String[] args)
	
	{
		//scenario1();
		//scenario2();
		scenario3();
		
		
		
	}
	
	private static void scenario2()
	    {
		Student[] stu = new Student[3];
		Info info = new Info();
			stu[0]= new Student(1,"pragati",LocalDate.of(1998,10,7));
			stu[1]= new Student(2,"jack",LocalDate.of(1998,10,1));
			stu[2]= new Student(3,"Rio",LocalDate.of(1998,10,4));
			
			    
		for(int i=0;i<3;i++)
		  {
		   info.display(stu[i]);
		      }
	    }
		     

   private static void scenario3()
	{
		Student s1 =new Student();
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[2];
		
		for(int i=0;i<stu.length;i++)
         {
			stu[i] = new Student();
         
			
	
		System.out.println("Enter your id");
		int id=Integer.parseInt(sc.nextLine());
		stu[i].setId(id);
		
		System.out.println("Enter your name");
		String name= sc.nextLine();
		stu[i].setName(name);
		System.out.println("Enter dob");
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String dob=sc.nextLine();
		stu[i].setDob(LocalDate.parse(dob,formatter));
		
		
			
			}
		
		Info info = new Info();
		for(Student student: stu)
			{
			info.display(student);
			
			}
		
		
	}
}
