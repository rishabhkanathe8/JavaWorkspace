package com.neosoft;
public class UnsortedArray {
	public static void sortedAlternate(int array[], int devide) {

		int unsortedArray[] = new int[array.length];
		int counter = 0;
		int unsortedCounter = 0;
		int alternateCounter = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % devide == 0) {
				alternateCounter++;
				if (alternateCounter == 0 || alternateCounter % 2 == 0) {
					array[counter++] = array[i];
				} else {
					unsortedArray[unsortedCounter++] = array[i];
				}

			} else {
				unsortedArray[unsortedCounter++] = array[i];
			}
		}
		int length = counter;
		for (int i = 0; i < unsortedArray.length - length; i++) {
			array[counter++] = unsortedArray[i];
		}

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		sortedAlternate(array, 5);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
