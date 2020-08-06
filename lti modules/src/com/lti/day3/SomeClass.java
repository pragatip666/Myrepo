package com.lti.day3;

public class SomeClass {
	static {
		System.out.println("Static block executed");
		
	}
	{
		System.out.println("Non-Static block executed");
		
	}
	SomeClass(){
		System.out.println("Constructor block executed");
	}
	public static void main(String [] args)
	{
		SomeClass s1= new SomeClass();
		SomeClass s2= new SomeClass();
	}

}
