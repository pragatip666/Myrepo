package com.lti.day3;

public class Aapp {
	
	// code for shop object
	public static void main(String[] args) {
		Address someAddr = new Address();
		someAddr.setCity("Mumbai");
		someAddr.setPincode(400061);
		
		 Flat f1 = new Flat();
		 f1 .setAddress(someAddr);
		 f1 .setArea("550 sq.ft");
		 f1 .setType("1 BHK");
		 //Flat someFlat = new Flat(someAddr,"750 sq.ft","2 BHK");
		 // using constructors
		
		 
		 
		    Address anotherAddr = new Address();
			anotherAddr.setCity("Pune");
			anotherAddr.setLisenceNo(401);
		
		     Shop someShop =new Shop();
		     someShop.setAddress(anotherAddr);
		     someShop .setArea("200 sq. ft");
		     someShop .setLisenceNo(1123);
		     
		     
		    
	}

}
