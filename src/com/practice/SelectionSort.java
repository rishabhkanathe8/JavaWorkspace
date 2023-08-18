package com.practice;

public class SelectionSort {
	
	public static void selectionSorting(int array[]) {
		
		for(int i =0; i < array.length; i++) {
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
	public static void main(String[] args) {
		int array[] = {1,22,2,44,5,66,-2};
		selectionSorting(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
