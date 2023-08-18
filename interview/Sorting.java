package com.interview;

public class Sorting {
	
	public static void bubbleSort(int array[]) {
		boolean isSwapped = false;
		for(int i =0; i < array.length; i++) {
			for(int j=0; j < array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
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
	
	public static void insertion(int array[]) {
		for(int i=1 ; i < array.length; i++) {
			int j =i-1;
			int temp = array[i];
			while(j >=0 && array[j]>temp) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = temp;
			
		}
	}
	
	public static void selection(int array[]) {
		for(int i =0; i < array.length; i++) {
			int min = i;
			for(int j = i+1;j < array.length;j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min]= array[i];
			array[i] = temp;
		}
	}
	public static void main(String[] args) {
		int array[]= {1000,1,3,2000,77,0,-1,22,111};
		selection(array);
		for(int i =0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
