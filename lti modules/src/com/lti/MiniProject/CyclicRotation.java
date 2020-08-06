package com.lti.MiniProject;


	
	public class CyclicRotation {
		  public int[] solution(int[] A, int K) {
			  int []size =new int [A.length];
		    for(int i=0; i<A.length; i++) {
		      int result = (i + K) % A.length;
		      size[result] = A[i];
		    }
		    return size;
		  }
		}
	    


