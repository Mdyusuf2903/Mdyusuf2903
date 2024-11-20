package com.practice;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacters {

	   public static void main(String[] args) {
	        String input = "MohammmmmedYusuf";
	        findRepeatingCharacters(input);
	    }

	    public static void findRepeatingCharacters(String input) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences of each character
	        for (char c : input.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        System.out.println("Characters repeating more than two times:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 2) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }

}
