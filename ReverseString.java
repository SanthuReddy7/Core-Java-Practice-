package com.GS;

public class ReverseString {

	public static void main(String[] args) {
		String input = "This is my Life";
		String output = reverse(input);
		System.out.println("Original string: " + input);
		System.out.println("Reverse String: " + output);
	}

	private static String reverse(String input) {
		String reverse = "";

		if (input.isEmpty() || input == null) {
			System.out.println("Please provide input");
		}

		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			for (String item : originalArray) {
				reverse = item + " " + reverse;
			}
		}

		return reverse.trim();
	}

}
