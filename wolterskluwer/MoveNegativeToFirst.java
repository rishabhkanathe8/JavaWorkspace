package com.wolterskluwer;

public class MoveNegativeToFirst {

	public static void move(int array[]) {
		if (array.length < 1) {
			return;
		}
		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {
				for (int j = i+1; j < array.length; j++) {
					if (array[j] < 0) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
				
					}
				}
			}
		}
	}

}
