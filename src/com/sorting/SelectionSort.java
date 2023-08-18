package com.sorting;

public class SelectionSort {
	public static void SelectinSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			//5,12,13,55
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	 static public void main(String[] args) {
		 int array[] = { 10, 22, 23, 33, 22, 444, 32 };
		 SelectinSort(array);
			System.out.print("[ ");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.print("] \n");
	}
}
