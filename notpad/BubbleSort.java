package com.notpad;

public class BubbleSort {
//	public static void bubbleSort(int array[]){
//		boolean isSwapped = false;
//		for(int i =0; i < array.length; i++){
//			for(int j =0; j < array.length -i-1; j++){				
//				if(array[j]> array[j+1]){
//				int temp = array[j];
//				array[j] = array[j+1];
//				array[j+1] = temp;
//				isSwapped = true;	
//				}
//			}
//			if(isSwapped == false)
//			return;
//		}
//	}
	public static void bubbleSort(int array[]) {
		boolean isSwapped = false;
		for(int i =0; i < array.length; i++) {
			for(int j =0; j < array.length-i-1; j++) {
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
	public static void main(String... args) {
		int array[] = {1000, 3, 22, 1, 33, 22, 444, 32 };
		bubbleSort(array);
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("] \n");
	}
}
