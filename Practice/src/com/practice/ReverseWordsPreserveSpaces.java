package com.practice;

public class ReverseWordsPreserveSpaces {
	public static void main(String[] args) {
        String input = "Java is fun";
        String result = reverseWordsWithoutBuiltIn(input);
        System.out.println(result);
    }

    public static String reverseWordsWithoutBuiltIn(String input) {
        char[] arr = input.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                // Reverse the current word
                reverseManually(arr, start, i - 1);
                start = i + 1; // Move start to the next word
            }
        }

        return new String(arr);
    }

    private static void reverseManually(char[] arr, int start, int end) {
        while (start < end) {
            // Swap the characters
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
