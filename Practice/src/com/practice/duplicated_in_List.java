package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicated_in_List {

	public static void main(String[] args) {
	List<String> input_list = Arrays.asList("a", "b", "a", "d");
	
	
	//List<String> result = new ArrayList<>(new HashSet<>(input_list));
	


 
 
 Set<String> myset = new HashSet<>();
 
 for(String str : input_list) {
	 
	 myset.add(str);
	 
 }
	System.out.println(myset);
	
	List<String> newresult = new ArrayList<>(new HashSet<>(myset));
	System.out.println(newresult);
	
	}
	
}
