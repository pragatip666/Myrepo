package com.lti.MiniProject;

public class Prefic_sums {
	public static void main(String [] args) {
	int [] A={2,8,2,4,3,3,5};
	int P = prefix_sums(A);
	
	}
	public static int prefix_sums(int[] A) {
		int n = A.length;
		int[] p = new int[n+1];
		for(int k= 1;k<=n;k++)
		{
		p[k]= p[k-1] + A[k-1];
		}
		
		// TODO Auto-generated method stub
		return 0;
	}
	//return ;
	public int count_total(int[] P,int x,int y){
	return P[y+1] - P[x];
	}int total = count_total(null, 2,5);

}
