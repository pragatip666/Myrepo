package com.lti.bugfixing;

//ublic class BugFixing2 {
	import java.util.Arrays;

	//return the minimal value that occurs in both the arrays
	//if no match found return -1
	public class BugFixing2 {

		int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n;k++ ) {
	          while(i < m-1  && B[i] < A[k]) {
	                if (A[k] == B[i])
		                return A[k];
	                      i += 1;
	             // else
	               //k+=1;
	               }
	        
	       
	    }
	        return -1;
		}
		
		public static void main(String[] args) {
			//int[] A = {2, 4, 6, 7};
			//int[] B = {2, 1, 1, 8};
		     //int[] A= {3,5,9,7};
		     //int[] B=  {1,2,4,7,10};
		     int[] A= {1,0,1};
		     int[] B = {1,0,0};
			System.out.println(new BugFixing2().solution(A, B));
		}
		
	}



