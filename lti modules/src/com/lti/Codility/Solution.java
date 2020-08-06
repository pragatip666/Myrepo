package com.lti.Codility;


public class Solution{

	public static int solutions (int N) {
		  
		        // variable to store the length of  
		        // longest consecutive 0's  
		        int maxm = -1;  
		        
		        // to temporary store the consecutive 0's  
		        int cnt = 0;  
		        
		        while (N != 0) {  
		            if ((N & 1) == 0 ) {  
		                cnt++;  
		                N >>= 1;  
		                maxm = Math.max(maxm, cnt);  
		            }  
		            else {  
		        
		                maxm = Math.max(maxm, cnt);  
		                cnt = 0;  
		                N >>= 1;  
		            }  
		        }  
		        return maxm;  
		    }  
		        
		    // Driver code 
		    public static void main(String args[]) 
		    { 
		         int N = 14;  
		         System.out.println(solutions(N));  
		      
		    } 
		    // This Code is contributed by ANKITRAI1 
		 
	}


 //public static void main(String [] args)
 //{
	 //System.out.println(solution1(9));
	 //System.out.println();
	 //System.out.println(solution1(20));
	 ////System.out.println(solution1(15));
	 //System.out.println(solution1(32));
	 //System.out.println(solution1(1041));
	 
 //}
//}
