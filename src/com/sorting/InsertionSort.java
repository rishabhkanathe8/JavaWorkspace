package com.sorting;

public class InsertionSort {

	public static void insertionSort(int array[]) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}
	}
	
	 static public void main(String[] args) {
		 int array[] = {  22, 23, 33, 22, 444, 32 };
		 insertionSort(array);
			System.out.print("[ ");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.print("] \n");
	}
}
