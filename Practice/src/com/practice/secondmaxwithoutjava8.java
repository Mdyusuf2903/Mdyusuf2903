package com.practice;

import java.util.Arrays;
import java.util.List;

public class secondmaxwithoutjava8 {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(10,20,30,40);
		
		//second max without using java 8
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : lst) {
			
			if(num > max) {
				secondMax = max;
				max = num;
				
			}
			else if (num < max && num > secondMax){
				secondMax = num;
			}
		
		}
		System.out.println(secondMax);

	}
	
	
	//other way
//	if (lst.size() < 2) {
//	    System.out.println("List does not have enough elements for a second maximum.");
//	    return;
//	}
//
//	int max = lst.get(0);
//	int secondMax = lst.get(0);
//
//	for (int i = 1; i < lst.size(); i++) {
//	    int num = lst.get(i);
//	    if (num > max) {
//	        secondMax = max;
//	        max = num;
//	    } else if (num > secondMax && num < max) {
//	        secondMax = num;
//	    }
//	}
//
//	if (max == secondMax) {
//	    System.out.println("There is no distinct second maximum value.");
//	} else {
//	    System.out.println("The second maximum is: " + secondMax);
//	}


}
