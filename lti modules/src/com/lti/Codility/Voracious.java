package com.lti.Codility;

	import java.util.Stack;

	public class Voracious {

		public int solution(int[] A, int[] B) {
			Stack<Integer> stack = new Stack<>();
			int survivors = 0;
			
			for(int i=0; i<A.length; i++) {
				int weightOfCurrentFish = A[i];
				int direction = B[i];
				if(direction == 1)
					stack.push(weightOfCurrentFish);
				else {
					int weightOfFishInStack = stack.isEmpty() ? -1 : stack.pop();
					while(weightOfFishInStack != -1 && weightOfFishInStack < weightOfCurrentFish)
						weightOfFishInStack = stack.isEmpty() ? -1 : stack.pop();
					if(weightOfFishInStack == -1)
						survivors += 1;
					else
						stack.push(weightOfFishInStack);
				}
			}
			return survivors + stack.size();
		}

		public static void main(String[] args) {
			int[] A = {4, 3, 2, 1, 5};
			int[] B = {0, 1, 0, 0, 0};
			System.out.println(new Voracious().solution(A, B));
		}
	}



