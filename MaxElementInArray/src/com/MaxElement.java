package com;

public class MaxElement {

	public static void main(String[] args) {

		int array[] = {10,20,30,2,222};
		
		System.out.println(maxElement(array));
	}

	public static int maxElement(int array[]) {

		// int array[]={5,10,15}
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}

		return max;

	}

}
