package com.lti.Codility;

import java.util.ArrayList;
import java.util.*;;

public class FibFrog {
	
	public int solution (int[] A) {
		int[] fib = new int[A.length +2];
		fib[0] = 0;
		fib[1] = 1;
		for( int i = 2; i<A.length +1;i++) 
			fib[i] = fib[i-1] + fib[i-2];
			System.out.println(Arrays.toString(fib));
		
		List<Integer> fibs = new ArrayList<>();
		fibs.add(1);
		fibs.add(2);
		for(int i = 2;i< A.length +2;i++) {
			int no = fibs.get(i-1) + fibs.get(i-2);
			if(no < A.length +2)
				fibs.add(no);
			else
				break;
			
		}
		System.out.println(fibs);
		
		int[] fibo = fibs.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(fibo));
		s
		return 0;
	}
		
		
		
		
		
		
		
		
	
	public static void main(String [] args)
	{
		System.out.println(new FibFrog().solution(new int[] {0,0,0,0,0,0}));
		System.out.println(new FibFrog().solution(new int[] {0,0,0,0,0,0,0}));
		System.out.println(new FibFrog().solution(new int[] {0,0,0}));
		System.out.println(new FibFrog().solution(new int[] {1,1,0,0,0}));
		System.out.println(new FibFrog().solution(new int[] {1,1,1}));
		System.out.println(new FibFrog().solution(new int[] {1}));
		System.out.println(new FibFrog().solution(new int[] {0}));
		System.out.println(new FibFrog().solution(new int[] {}));
		
	}

}
