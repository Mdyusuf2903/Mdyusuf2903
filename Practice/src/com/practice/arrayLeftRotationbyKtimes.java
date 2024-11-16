package com.practice;

public class arrayLeftRotationbyKtimes {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		// int[] arr = new int[]{1,2,3,4,5}

		int k = 3;

		for (int i = 0; i < k; i++) {

			int first = arr[0],j;

			for (j = 0; j < arr.length-1; j++) {

				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
