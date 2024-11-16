package com.practice;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] array1 = {5, 2, 8};
        int[] array2 = {3, 7, 6};

        // Merging arrays by manually copying the elements
        int[] mergedArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

   

        // Printing the result
        System.out.println("Sorted Merged Array: " + Arrays.toString(mergedArray));
	}

}
