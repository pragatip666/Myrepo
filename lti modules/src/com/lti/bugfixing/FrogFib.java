package com.lti.bugfixing;

import java.util.ArrayList;
import java.util.List;

public class FrogFib {
	public int anotherSolution(int X, int[] A) {
		//Set<Integer> set = new HashSet<Integer>();
		List<Integer> set = new ArrayList<>();
		for(int i=1; i<=X; i++)
			set.add(i); //1 2 3 4 5
		
		for(int i=0; i<A.length; i++) {
			if(set.contains(A[i]))
				set.remove((Integer)A[i]);
			if(set.isEmpty())
				return i;
		}
		return -1;
	}
	public int solution(int X, int[] A) {
		boolean[] fallenLeaves = new boolean[X + 1];
		int fallenLeavesRemaining = X;
		for(int i=0; i<A.length; i++) {
			if(!fallenLeaves[A[i]]) {
				fallenLeaves[A[i]] = true;
				fallenLeavesRemaining --;
				if(fallenLeavesRemaining == 0)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int X = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(new FrogFib().anotherSolution(X, A));
	}
}


