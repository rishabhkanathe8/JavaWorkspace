package com.java;

public class Test {

	public static int[] sort(int array1[], int array2[]) {

		int array[] = new int[array1.length + array2.length];
		int i = 0, j = 0, count = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				array[count] = array1[i++];
			} else {
				array[count] = array2[j++];
			}
			count++;
		}
		if (i < array1.length) {
			while (i < array1.length) {
				array[count] = array1[i++];
				count++;
			}
		} else if (j < array2.length) {
			while (j < array2.length) {
				array[count] = array2[j++];
				count++;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		/*int[] array = { 1, 2, 3, 5, 7, };
		int[] array1 = { 2, 4, 5, 6, 7, 8, 9, 10, 11 };
		int arrays[] = sort(array, array1);
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}*/
		
		System.out.println(7/2);
	}
}
