package com.lti.bugfixing;

//public class CountNotDivisible {
	import java.util.Arrays;
	import java.util.HashMap;

	public class CountNonDivisible {

		public int[] solution(int[] A) {
			//Counting Elements Algo using HashMap
			int maxElem = 0;
			for(int elem : A)
				maxElem = Math.max(maxElem, elem);
			
			int count[] = new int[maxElem + 1];
			for(int i = 0; i < A.length; i++) {
				count[A[i]]++;
			}
			
			//The Great Eratosthenes Algo
			int[] divisors = new int[count.length];
			for(int i=0; i<divisors.length; i++) {
				if(count[i] > 0)
					for(int j=i; j<divisors.length; j+=i)
						divisors[j] += count[i];
			}
			
			System.out.println(Arrays.toString(divisors));
			
			int[] nonDivisors = new int[A.length];
			for(int i=0; i<nonDivisors.length; i++)
				nonDivisors[i] = nonDivisors.length - divisors[A[i]];
			
			return nonDivisors;
		}

		public static void main(String[] args) {
			int[] A = {3, 1, 2, 3, 6};
			System.out.println(Arrays.toString(new CountNonDivisible().solution(A)));
		}
	}

	/*
			//Counting Elements Algo using HashMap
			HashMap<Integer, Integer> count = new HashMap<>();
			for (int i : A) {
				Integer val = count.get(i);
				if (val != null)
					count.put(i, val + 1);
				else
					count.put(i, 1);
			}
			
			System.out.println(count);
			
			//The Great Eratosthenes Algo
			int[] divisors = new int[count.size()];
			for(Integer key : count.keySet()) {
			for(int i=0; i<divisors.length; i++) {
				if(count.get(i) != null)
					for(int j=i; j<divisors.length; j+=i)
						divisors[j] += count.get(A[i]);
			}
			
			System.out.println(Arrays.toString(divisors));

	 */
	/*
	 * int B[] = A;
	Arrays.sort(A);
	int top = A[A.length - 1];
	int countEle[] = new int[top+1];
	for(int i = 0; i < A.length; i++) {
	    countEle[A[i]]++;
	}*/

	/*int maxElem = 0;
	for(int elem : A)
		maxElem = Math.max(maxElem, elem);
	int countEle[] = new int[maxElem + 1];
	for(int i = 0; i < A.length; i++) {
	    countEle[A[i]]++;
	}

	//System.out.println(Arrays.toString(A));
	//System.out.println(Arrays.toString(B));
	System.out.println(Arrays.toString(countEle));*/


