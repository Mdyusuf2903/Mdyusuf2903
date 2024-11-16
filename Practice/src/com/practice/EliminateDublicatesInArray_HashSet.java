package com.practice;

import java.util.HashSet;
import java.util.Set;

public class EliminateDublicatesInArray_HashSet {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 7, 7, 3, 5, 6, 7, 8, 4, 3, 3 };

		Set<Integer> Uniqueset = new HashSet<>();

		for (int n : arr) {
			Uniqueset.add(n);

		}
		System.out.println(Uniqueset);
	}

}
