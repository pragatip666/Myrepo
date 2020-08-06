package com.lti.bugfixing;

public class FiboMemoization {
	public static int fib(int x) {
		int arr[] = new int[x+1];
		 
			if(x <=1)
				arr[x]= x;
			else
				arr[x]= fib(x-1) + fib(x-2);
				return arr[x];
			
		}
	
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(new FiboMemoization() .fib(x));
	}

}
