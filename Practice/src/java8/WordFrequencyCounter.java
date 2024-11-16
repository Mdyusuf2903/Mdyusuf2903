package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa", "bbb", "aaa");
		List<String> list2 = Arrays.asList("ddd", "aaa", "ddd");

		// Combine both lists and count occurrences
		Map<String, Long> result = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		//.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}

}
