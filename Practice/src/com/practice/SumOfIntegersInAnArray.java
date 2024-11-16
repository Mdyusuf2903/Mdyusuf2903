package com.practice;

import java.util.Arrays;

public class SumOfIntegersInAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 8 }; // Created an array of integers 

		int sum = Arrays.stream(arr).sum(); // converted array into stream and then calculated sum of integers

		System.out.println(sum); // Printed the sum..
		
		//System.out.println(Arrays.stream(arr).sum());

	}

}
