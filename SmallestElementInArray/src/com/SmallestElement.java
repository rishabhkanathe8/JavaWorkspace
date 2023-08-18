package com;

public class SmallestElement {

	public static void main(String[] args) {

		int array[] = {40022,22,333,22,1212,11,3333};
		System.out.println(smallest(array));
	}

	public static int smallest(int array[]) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}
}
