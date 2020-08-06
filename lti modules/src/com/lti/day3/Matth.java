package com.lti.day3;

public interface Matth {
	int Calc(int x, int y);
	static Matth getDefault() {
		return new BasicMatth();
	}
	class BasicMatth  implements Matth{
		public int Calc(int x, int y){
			return x+ y;
			
		}
	}


Matth m = Matth.getDefault();
System.out.println((m.calc(10,20));
}
