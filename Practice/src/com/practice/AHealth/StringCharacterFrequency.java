package com.practice.AHealth;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterFrequency {

	public static void main(String[] args) {
//a --> 2
//b --> 4
//c ---> 2
		String s = "abcabcbb";
		Map<Character, Integer> countofchar = new HashMap<>();
		for (char ch : s.toCharArray()) {
			countofchar.put(ch, countofchar.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> map : countofchar.entrySet()) {
			System.out.println(map.getKey() + " = " + map.getValue());
		}

	}

}
