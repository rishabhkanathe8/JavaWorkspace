package com.notpad;

public class SelectionSort {
	public static void selectionSort(int array[]) {

//		for (int i = 0; i < array.length - 1; i++) {
//			int min = i;
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[j] < array[min]) {
//					min = j;
//				}
//			}
//			int temp = array[min];
//			array[min] = array[i];
//			array[i] = temp;
//		}
		
		for(int i =0; i < array.length-1; i++) {
			int min = i;
			for(int j =i+1; j < array.length; j++) {
				if(array[j]<array[min]) {
					min = j;
					
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}

	}

	static public void main(String[] args) {
		int array[] = { 22, 23, 33, 22, 444, -1, 32, -5 };
		selectionSort(array);
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("] \n");
	}
}
