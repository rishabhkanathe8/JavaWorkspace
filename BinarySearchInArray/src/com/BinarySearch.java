package com;

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 2, 3, 4, 6, 8,10, 12 };

		System.out.println(binary(array, 6));

	}

	public static boolean binary(int array[], int search) {

		int mid;

		int first = 0;
		int last = array.length - 1;
		mid = (first + last) / 2;
		while (first <= last) {

			if (array[mid] == search) {

				return true;
			} else if (array[mid] < search) {
				first = mid + 1;

			} else {
				last = mid - 1;
			}

			mid = (first + last) / 2;

		}

		return false;
	}

}
