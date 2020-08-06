package com.lti.bugfixing;

public class CoinChanging2 {
	public static int[] dp(int[] C, int k) {
		int n = C.length;
		int[] dpp= new int[k+1];
		for(int i =1;i<= k;i++) {
			dpp[i] = Integer.MAX_VALUE;
		}
		for(int i =1;i< n;i++) {
			for(int j =C[i-1]; j< k+1;j++) {
				dpp[j] = Math.min(dpp[j-C[i-1]]+1,dpp[j]);
				
			}
		}
		return dpp;
	}
}


