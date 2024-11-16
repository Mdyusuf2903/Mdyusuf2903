package java8;

import java.util.Arrays;
import java.util.List;

public class secondmax {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(20,20,20,20,20,10,10);
		
		int secondMax = lst.stream()
                .distinct()                  // Remove duplicates
                .sorted((a, b) -> b - a)      // Sort in descending order
                .skip(1)                      // Skip the maximum element
                .findFirst()                  // Get the first element (second max)
                .orElse(Integer.MIN_VALUE);   // Default value if no second max exists
		System.out.println(secondMax);

	}

}



