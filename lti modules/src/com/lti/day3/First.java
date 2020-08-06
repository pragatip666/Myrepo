package com.lti.day3;

public class First {
	First(){
		System.out.println("Default constructor invoked");
	}
	First(int x){
		System.out.println("paramatrer constructor invoked of 1st");
	}
}
class Second extends First {
	Second(){
		super();
		System.out.println("Default constructor invoked of 2nd");
	}
	Second(int x){
		super(x);
		System.out.println("Parametrized constructor invoked 2nd");
	}
	
}
class app{
	public static void main(String [] args)
	{
		Second a1= new Second();
		Second a2= new Second(99);
	}
	
}
