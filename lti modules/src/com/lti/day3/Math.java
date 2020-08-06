package com.lti.day3;

public interface Math {
	public int calculate(int x,int y);
	class Sum{
		public int calculate(int x,int y) {
			return x + y;
	}
	}
}


Math mn = (x,y) -> {
            return x+y;
       
Math m1 = (int x, int y) -> {
            System.out.println("LAmbda is fun");
            return x + y;
        };
        m1.calculate(10, 2);




