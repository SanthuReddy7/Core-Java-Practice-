package com.GS;

import java.util.ArrayList;
import java.util.Collections;

public class LargeNum {

	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(872);
		al.add(625);
		al.add(92);
		al.add(8);
		al.add(71);
		al.add(93);
		al.add(9);

		Find find = new Find();
		find.duplicate(al);
	}
}

class Find {

	public void duplicate(ArrayList<Integer> al) {
		String numL = "";
		int size = al.size();
		Collections.sort(al, Collections.reverseOrder());
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if ((compare(al.get(j), al.get(j + 1))) == 1) {
					Collections.swap(al, j, j + 1);
				}
			}
		}

		for (int i = 0; i < size; i++) {
			numL = numL + al.get(i);
		}
		System.out.println(numL);

	}

	public static int compare(int x, int y) {

		String xStr = String.valueOf(x);
		String yStr = String.valueOf(y);

		int a = Integer.parseInt(xStr + yStr);
		int b = Integer.parseInt(yStr + xStr);

		return (a > b) ? 0 : 1;
	}
}