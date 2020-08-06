package updated.com.lti.MiniProject;
import java.util.*;
public class caterpillarmethod {
public static boolean caterpillarMethod(int[] A, int s) {
		int N = A.length;
		int front = 0;int total = 0;int left = 0;
		for(int x =1;x < N; x++) {
			while (front < N && total + A[front] <= s) {
				 total += A[front];
				 front += 1;
			}
				 if(total == s)
					 return true;
				
			
			 total -= A[left];
			 return false;
			
		}
		return false;
		
		
}
public static void main(String [] args) {
	int s = 11;
	int[] A = {3,2,5,4,3};
	System.out.println(caterpillarMethod(A,s));
}
}
