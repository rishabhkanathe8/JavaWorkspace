package com.test;

public class ReverseArray {

	public static void reverseArray(int array[]) {

		int length = array.length - 1;
		int lengths =0;
		if(length % 2==0) {
			 lengths = array.length /2-1;
		}else {
		 lengths	 = (array.length/2) -1;
		}
		for (int i = 0; i <= lengths; i++) {
			int temp = length - i;
			int temp2 = array[temp];
			array[temp] = array[i];
			array[i] = temp2;
		}

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		reverseArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
