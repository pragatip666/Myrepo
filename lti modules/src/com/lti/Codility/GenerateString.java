package com.lti.Codility;

public class GenerateString {
	static void generateString(int a, int b, int c) 
	{ 
		String val = "";
		int total = a+ b +  c;
		int currA= 0, currB= 0, currC= 0;
		for(int i =0;i< total;i++)
		{ 

			
			if( (a>= b && a>= c && currA != 2) ||(a> 0 &&(currB==2 || currC ==2)))
			{ 
				val += ('a');
				currA++;
				currB=0;
				currC=0;
				a--;
			} 

			else if( (b>= a && b>= c && currB!=2) ||(b> 0 &&(currA==2 || currC ==2)))
			{ 
				val += ('b');
				currB++;
				currA=0;
				currC=0;
				b--;
			} 
			else if ((c>= a && c>= b && currC!=2)||(c> 0 &&(currA==2 || currB ==2)))
			{ 
				val += ('c');
				currC++;
				currA=0;
				currB=0;
				c--;
			} 
		}
			
			
			
		System.out.println(val); 
	

	
	public static void main(String[] args) 
	{ 
		int a= 2,b= 4 , c = 3;
		generateString(a,b,c); 
	} 
} 


