package com.practice;

//public class leris {
//
//	final int roll = 100;
//
//	public static void main(String[] args) {
//
//		leris s1 = new leris();
//		leris s2 = new leris();
//		leris s3 = new leris();
//		leris s4 = new leris();
//
//		System.out.println(s1.roll);// here we are calling non-static variable with the help of object reerence name , so it is fine...
//		System.out.println(s2.roll);
//		System.out.println(s3.roll);
//		System.out.println(s4.roll);
//
//	}
//
//}


// Other Way


public class leris {

	static final int roll = 100;

	public static void main(String[] args) {
		//leris s1 = new leris();
		//leris s2 = new leris();
		//leris s3 = new leris();
		//leris s4 = new leris();

		System.out.println(leris.roll);//here we are calling non-static variable with the help of class name and parallelly we are making the variable as static.
		System.out.println(leris.roll);
		System.out.println(leris.roll);
		System.out.println(leris.roll);
	}
}
 