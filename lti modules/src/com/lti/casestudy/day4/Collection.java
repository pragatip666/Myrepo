package com.lti.casestudy.day4;
import java.util.List;

import com.lti.casestudy.day1.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;


public class Collection {
	public static void main(String [] args) {
		List <String> list1 = new ArrayList<String>();
		//((ArrayList<String>) list1).trimToSize();
		list1.add("JAVA");
		list1.add("ORACLE");
		list1.add(".NET");
		list1.add("JAVA");
		list1.add("1,PYTHON");
		System.out.println("----using traditional loop");
		for( int i =0; i<list1.size();i++) {
		String str = list1.get(i);
		System.out.println(str);
			
		//}//using enhanced loop
		System.out.println("----using enhanced loop");
		for(String str1 : list1)
		{
			System.out.println(str1);
			
		}
		//using internal iterator
		System.out.println("----using internal iterator");
		Iterator<String> itr= list1.iterator();
		while(itr.hasNext()) {
		String str1 = itr.next();
		System.out.println(str1);
		
	}
		// using lambda expression
		System.out.println("-- using lambda expression");
		list1.forEach(str1 ->System.out.println(str));
		
		
		//now create a list for storing user defined data
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"pragati",LocalDate.of(1995, 10, 27)));
		students.add(new Student(2,"Riya",LocalDate.of(1985, 11, 21)));
		
		for(Student student:  students)
			System.out.println(student.getName() +" ," + student.getDob());
			
		
		//Student a = new Student();
	    //System.out.println(a.getName());
	    //a.setName("xyz");
	    //String b = a.getName();
	    //System.out.println(b);
	    
	    //System.out.println(a.getId());
	    //a.setId(1001);
	    //int i1 = a.getId();
	    //System.out.println(i1);
	    //System.out.println("----using traditional loop for students");
		//for( int j =0; j<student.size();j++) {
		//String str11 = list1.get(j);
		//System.out.println(str11);
		}
	  }
	  }
 

		


