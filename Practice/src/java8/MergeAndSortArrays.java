package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortArrays {

	public static void main(String[] args) {
		 int[] array1 = {5, 2, 8};
	        int[] array2 = {3, 7, 6};

	        // Merging arrays using streams and sorting
	        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
	                                     .sorted()
	                                     .toArray();

	        // Printing the result using Arrays.toString
	        System.out.println("Sorted Merged Array: " + Arrays.toString(mergedArray));

	}

}
