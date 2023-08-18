package com.tenImportant;
import java.util.Arrays;
public class RemoveDuplicateFromAnArray {
	public static void removeDuplicate(int array[]) {
		Arrays.sort(array);
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] != array[i]) {
				array[count] = array[i];
				count++;
			}
		}
		System.out.println();		
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,552,2,3,4,2,3,4};
		removeDuplicate(arr);
	}
}
