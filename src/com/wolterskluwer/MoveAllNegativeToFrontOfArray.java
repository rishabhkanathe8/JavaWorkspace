package com.wolterskluwer;

public class MoveAllNegativeToFrontOfArray {
	public static void positiveEnd(int array[]) {
		if (array.length < 1) {
			return;
		}
		for (int i = 0; i < array.length; i++) {

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
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { -1, -2, 12, 3, 44, 5,  -5,33,43,-6,-6 };
		positiveEnd(array);

	}

}
