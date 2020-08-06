package com.lti.MiniProject;

public class SoluionPassingcars {
	
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int n = A.length;
	        int[] P = new int[n+1];
	        int passCars = 0;
	        P[0] = 0;
	        for(int i=1; i<=n; i++) 
	            P[i] = A[i-1] + P[i-1];
	        for(int i=0; i<n; i++) {
	            if(A[i] == 0) 
	                passCars += P[n]-P[i];
	            if(passCars>1000000000)
	                return -1;
	        }
	        return passCars;
	    }
	}


