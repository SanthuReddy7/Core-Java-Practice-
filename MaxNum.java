package com.GS;

import java.util.HashMap;
import java.util.Map;

public class MaxNum {
	public static void main(String[] args) {
		int a[] = { 1, 4, 1, 5, 2, 2, 4, 3, 4, 1, 3, 1, 2, 6, 4, 2 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		System.out.print(map);
	}
}
