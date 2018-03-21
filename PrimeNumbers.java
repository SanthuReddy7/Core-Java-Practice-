package com.GS;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int[] array = new int[5];
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < 5; i++) {
			array[i] = in.nextInt();
		}
		// Elements in the array are looped one by one using for loop.
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;

			// Using for loop and if condition, prime numbers are identified
			// from all the numbers that are entered in the array.
			for (int j = 2; j < array[i]; j++) {
				if (array[i] % j == 0) {
					isPrime = false;
					break;
				}
			}

			// All the prime numbers or the numbers that satisfy the if
			// condition are displayed as output.
			if (isPrime)

				System.out.println(array[i] + " are the prime numbers in the array ");
		}
	}
}

/*
 * import java.util.ArrayList;
 * 
 * public static void main(String[] args) { int max = 100;
 * 
 * System.out.
 * println("Generate Prime numbers between 1 and 100. \"1\" is not prime.");
 * 
 * ArrayList<Integer> list = new ArrayList<Integer>();
 * 
 * // loop through the numbers one by one for (int n = 1; n < max; n++) {
 * boolean prime = true; // analyzes if n is prime
 * 
 * for (int j = 2; j < n; j++) { if (n % j == 0) { prime = false; break; // exit
 * the inner for loop } } if (prime && n != 1) { list.add(n); } } for (int i :
 * list) { System.out.println(i + " "); } } }
 */