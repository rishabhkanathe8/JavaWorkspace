package com.test;

public class Bubble {

	public static void bubble(int array[]) {
		int count =0;
		for (int i = 0; i < array.length; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < array.length - i-1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSwapped = true;
					count++;
				}
			}
			if (isSwapped == false) {
				System.out.println(count);
				return;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int array[] = {22,55,1,44,12,8,18};
		bubble(array);
		System.out.println();
		for(int i =0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}
}
