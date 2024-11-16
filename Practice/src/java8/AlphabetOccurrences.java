package java8;

import java.util.Map;
import java.util.stream.Collectors;

public class AlphabetOccurrences {

	public static void main(String[] args) {


		String str = "MALAYALAM";
		
		Map<Character, Long> result = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(result);
		
		
//		Map<Character, Long> frequencyMap = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        String result = frequencyMap.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .collect(Collectors.joining(", "));
//
//        System.out.println(result);
		//output : M: 2, A: 4, L: 2, Y: 1
	}

}
