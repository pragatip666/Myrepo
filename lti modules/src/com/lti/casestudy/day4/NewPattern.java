package com.lti.casestudy.day4;

public class NewPattern {
	
		static void printPattern(int n)  
		{ 
		    // Printing upper part 
		    for (int i = 1; i <= n; i++) { 
		    for (int j = 1; j <= i; j++) 
		        System.out.print(i); 
		    System.out.print("\n");} 
		    } 

		    public static void main(String arg[])  
		    { 
		        int n = 5; 
		        printPattern(n); 
		    } 
		    } 
		      
