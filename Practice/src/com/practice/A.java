package com.practice;


//Constructor overloading
public class A {
	
	A(){
		System.out.println("A block 1");
	}
	
	A(int a){
		System.out.println("int type  block");
	}
	
	A(double a){
		System.out.println("double type  block");
	}
	
	A(int a, int b){
		System.out.println("int, int type  block");
	}
	
//	A(double a, double b){
//		System.out.println("double, double type  block");
//	}
	
//	A(int a, double b){
//		System.out.println("int, double type  block");
//	}
//
//	A(double a, int b){
//		System.out.println("double, int type  block");
//	}
	
	public static void main(String[] Yusuf) {
		
		
		A a1 = new A();
		
		A a2 = new A(200);
		
		A a3 = new A(100.0);
		
		//A a4 = new A(12,14);
		
		//A a5 = new A(50.0, 100.0);
		
		A a6 = new A((int)(1000000000L),(int)(2000000000L));//The constructor A(int, double) is ambiguous
	}

}
