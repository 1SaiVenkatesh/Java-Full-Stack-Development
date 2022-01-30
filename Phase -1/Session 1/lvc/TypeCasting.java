package com.simplilearn.lvc;

public class TypeCasting {
	public static void main(String[]args) {
		
		System.out.println("Implicit type casting");
		
		char a='B';
		System.out.println("Value of a "+a);
		
		int b=a;
				System.out.println("Value of int "+b);
		
		float c=a;
				System.out.println("Value of float "+c);
		
		double d=a;
		System.out.println("Value of double "+d);
		
		long e=a;
		System.out.println("Value of double "+e);
	
		System.out.println("Explicit type casting");
		double x=78.80;
		int y = (int)x;
		System.out.println("Value of double " +x);			
		System.out.println("Value of int " +y);
	}

}
