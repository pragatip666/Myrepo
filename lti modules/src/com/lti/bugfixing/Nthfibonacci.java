package com.lti.bugfixing;

public class Nthfibonacci {
	public static int fibonacci(int n)
		{
			if (n <= 1)
				return n;

			return fibonacci(n - 1) + fibonacci(n - 2);
		}

		public static void main(String[] args)
		{
			int n = 11;

			System.out.println("n'th Fibonacci number is " + fibonacci(n));
		}
	}


   void fibonacciDunamic(int n) {
	int[] fib = new int[n+2];
	fib[0] = 0;
	fib[1] = 1;
	for (int i =2;i<n+2;i++) {
		fib[i]= fib[i - 1] + fib[i- 2];
		return fib;
	  }
    }