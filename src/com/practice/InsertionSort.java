package com.practice;

public class InsertionSort {

	public static void InsertionSorting(int array[]) {

		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int temp = array[i];
			while (j >= 0 && array[j] > temp) {

				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		int array[] = {1,22,2,44,5,66,-2};
		InsertionSorting(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
