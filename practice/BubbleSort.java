package com.practice;

public class BubbleSort {
	
	public static void bubbleSorting(int array[]) {
		
		for(int i =0; i < array.length; i++) {
			boolean isSwapped = false;
			for(int j =0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isSwapped = true;
				}
				
			}
			if(isSwapped == false) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		int array[] = {1,22,2,44,5,66,-2};
		bubbleSorting(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
