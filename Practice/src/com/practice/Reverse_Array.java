package com.practice;

public class Reverse_Array {






	/*
	 * ### 1. **Reverse an Array** Question**: Write a function to reverse an array
	 * in place.
	 ** 
	 * Solution**: ```java
	 */
public void reverseArray(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
/*
 * ``` Explanation**: This method uses two pointers: one starting at the
 * beginning and the other at the end of the array. They swap elements until
 * they meet in the middle.
 */
}