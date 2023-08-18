package com.cummlus;

public class ThreeNumSumEquals {

	public static void subset(int array[], int sum) {
		int first = 0;
		int second = 0;
		int third = 0;
		int sums = 0;
		if (array.length < 3) {
			return;
		}
		for (int i = 0; i < array.length - 2; i++) {
			first = array[i];
			second = array[i + 1];
			third = array[i + 2];
			sums = first + second + third;
			if (sums == sum) {
				System.out.print("[ " + first + ", " + second + ", " + third + "]" + "\n");
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 2, 2, 5, 8, 6, 10, 1, 6, 2 };
		subset(array, 9);
	}
}
