package com.lti.day3;

class Outer{
	int x =10;
	void call() {
		Inner i = new Inner();
		i.check();
	}
	
		class Inner{
			void check() {
				System.out.println(10);
			}
		
	}
		static class InnerClass{
			void check() {
				System.out.println("just checking");
			}
	
}
}
interface Printer{
	void print(String document);
}
class DotMatrixPrinter implements Printer{

	@Override
	public void print(String document) {
		System.out.println(document +"printing started");
		
	}
	
}
public class InnerClassesAndLambda {
	public static void main(String [] args) {
		Printer p = new DotMatrixPrinter();
		p.print("abc.txt");
		//first we need to create object of outer class
		//first we need to create object of inner class
		//inner classes
		
		class DeskjetPrinter implements Printer{
			public void print(String document) {
				System.out.println(document +"printing started again");
				
			}
		}
		Printer pt = new Printer() {
			public void print(String document) {
				System.out.println(document +"printing started again....");
				
			}
		};
		//lambda
		//Anonymous inner classes
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.check();
		
		Outer.InnerClass ic = new Outer.InnerClass();
		ic.check();
	}

}
