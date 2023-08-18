package com.test;

public class Negative {
	public static void move(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > 0) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] < 0) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { -1,22,-44, 2, 4, 5, -1, -10, -23 };
		move(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
