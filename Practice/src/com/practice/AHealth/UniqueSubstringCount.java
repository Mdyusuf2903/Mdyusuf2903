package com.practice.AHealth;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringCount {

	public static void main(String[] args) {
		String s = "abcabcbb";
		
		Set<String> uniqueSubstringCount = new HashSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i +1; j <= s.length(); j++) {
				uniqueSubstringCount.add(s.substring(i,j));
				
			}
		}
		System.out.println("UniqueSubstringCount : " +  uniqueSubstringCount.size());
		//System.out.println("UniqueSubstringCount : " +  uniqueSubstringCount);
		
//		String maxLengthString = "";
//		
//		for(String str : uniqueSubstringCount) {
//			
//			if(str.length() > maxLengthString.length()) {
//				maxLengthString = str;
//			}
//		}
//		
//		System.out.println("String with max length: " + maxLengthString);

	}

}
