package com.lti.bugfixing;
import java.util.*;
class PaintWall{
public int solution(int[] H) {

        Stack<Integer> stack = new Stack<>();

        stack.push(H[0]);
        int count = 1;

        int N = H.length;

        for (int i = 1; i < N; i++) {

            if (H[i] == stack.peek()) {
                continue;
            } else if (H[i] > stack.peek()) {
                stack.push(H[i]);
                count++;
            } else {

                while (!stack.isEmpty() && H[i] < stack.peek()) {
                    stack.pop();
                }

                
                if (!stack.isEmpty() && H[i] == stack.peek()) {
                    continue;
                }

                stack.push(H[i]);
                count++;
            }
        }

        return count;
    }
public static void main(String[] args) {
	//int[] H= {1,3,2,1,2,1,5,3,3,4,2};
	//int[] H= {1,1,1,1};
	int[] H={8,8,5,7,9,8,7,4,8};
	System.out.println(new PaintWall ().solution(H));
}
    }