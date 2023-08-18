package com;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void print(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);

			}
		}

			for (int j = 0; j < array.length; j++) {
				if (array[j] % 2 != 0) {
					System.out.println(array[j]);

				}
			}
		

	}
}
