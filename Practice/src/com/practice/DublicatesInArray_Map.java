package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DublicatesInArray_Map {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 6, 7, 7, 3, 5, 6, 7, 8, 4, 3, 3 };

		Map<Integer, Integer> countMap = new HashMap<>();

		// Count occurrences of each element
		for (int n : arr) {
			countMap.put(n, countMap.getOrDefault(n, 0) + 1);
		}

		// Print duplicate elements
		System.out.println("Duplicate elements:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		// Print Unique elements
				System.out.println("Unique elements:");
				for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
					if (entry.getValue().equals(1)) {
						System.out.println(entry.getKey());
					}
				}
	}
}
