package java8;

import java.util.Arrays;
import java.util.List;

public class sumoflist {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(10,20,30,40);
		
		// Find sum of elements in a list
		
		int sum = lst.stream().mapToInt(i -> i).sum();
		
		System.out.println(sum);

	}

}
