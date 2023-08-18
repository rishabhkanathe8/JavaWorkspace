package com.test;

public class Selection {
	public static void selectionSort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;

		}
	}

	public static void main(String[] args) {
		int array[] = { 12, 12, 1, 12, 33, 4, 22, -56, 7, 88 };
		selectionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
