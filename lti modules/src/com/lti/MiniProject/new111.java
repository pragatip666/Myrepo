package com.lti.MiniProject;


	class new111 {
	    public int solution(int[] A) {
	        // write your code in Java SE 8
	        int count;
			for(int i = 0; i<A.length; i++) {
				count = 0;
				for(int j = 0; j<A.length; j++) {
					if(A[i]==A[j]) {
						count++;
					}
				}
				if(count%2 != 0) {
					return A[i];
				}
			}
			return -1;
	    }
	}
