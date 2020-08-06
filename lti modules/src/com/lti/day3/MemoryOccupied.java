package com.lti.day3;

public class MemoryOccupied {
	
	    public static void main(String arg[]) 
	    { 
	        Runtime gfg = Runtime.getRuntime(); 
	        long memory1, memory2; 
	        Integer integer[] = new Integer[1000]; 
	  
	        // checking the total memeory 
	        System.out.println("Total memory is: "
	                           + gfg.totalMemory()); 
	  
	        // checking free memory 
	        memory1 = gfg.freeMemory(); 
	        System.out.println("Initial free memory: "
	                                      + memory1); 
	  
	        // calling the garbage collector on demand 
	        gfg.gc(); 
	  
	        memory1 = gfg.freeMemory(); 
	  
	        System.out.println("Free memory after garbage "
	                           + "collection: " + memory1); 

}
}
