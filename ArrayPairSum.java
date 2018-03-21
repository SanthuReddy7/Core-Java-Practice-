package com.GS;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairSum {
	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 3, 5, 1, 8, 9, 5, 1 };
		sumPairs(a, 10);
	}

	public static void sumPairs(int[] input, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {

			if (set.contains(input[i]))
				System.out.println(input[i] + ", " + (k - input[i]));
			else
				set.add(k - input[i]);
		}
	}
}