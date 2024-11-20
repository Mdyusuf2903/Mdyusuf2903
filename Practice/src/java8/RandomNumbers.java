package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Shuffle the list
        Collections.shuffle(numbers);

        // Stream and print 10 random numbers
        numbers.stream()
               .limit(10)
               .forEach(System.out::println);
	}

}
