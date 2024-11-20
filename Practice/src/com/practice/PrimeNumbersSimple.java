package com.practice;

public class PrimeNumbersSimple {
	public static void main(String[] args) {
        int[] numbers = {10, 11, 13, 17, 18, 19, 20, 23};

        System.out.println("Prime numbers (Simpler Traditional):");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i < n; i++) {
        	//for (int i = 2; i <= n / 2; i++) {// Check divisors up to sqrt(n)
            if (n % i == 0) {
                return false; // Divisible means not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

}
