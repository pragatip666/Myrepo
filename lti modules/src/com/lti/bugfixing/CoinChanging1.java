package com.lti.bugfixing;

public class CoinChanging1 {
	static long getNumberOfWays(long N, long[] Coins) 
    { 
         long[] change = new long[(int)N + 1];  
         change[0] = 1;  
  
        
        for (int i = 0; i < Coins.length; i++) { 
  
            
            for (int j = 0; j < change.length; j++) {  
                if (Coins[i] <= j) { 
       
                    
                	change[j] +=change[(int)(j - Coins[i])];  
                } 
            } 
        } 
  
             
        return change[(int)N];  
    } 
  
    static void printArray(long[] coins) 
    { 
        for (long i : coins) 
            System.out.println(i); 
    } 
  
    public static void main(String args[]) 
    { 
        long Coins[] = { 1, 5, 10 }; 
  
        System.out.println("The Coins Array:"); 
        printArray(Coins); 
  
        System.out.println("Solution:"); 
        System.out.println(getNumberOfWays(12, Coins)); 
    } 
} 


