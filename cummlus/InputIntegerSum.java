package com.cummlus;

import java.util.ArrayList;

public class InputIntegerSum {

	public static void sum(int Number, int sum) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		while (Number > 0) {
			list.add(Number % 10);
			Number = Number / 10;
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Integer minus = sum - list.get(i);
			if (list.contains(minus) && minus != list.get(i)) {
				System.out.println(minus + " " + list.get(i));
				list.remove(i);
				i=i-1;
			}
		}
	}

	public static void main(String[] args) {
		sum(23456780, 8);
	}
}
