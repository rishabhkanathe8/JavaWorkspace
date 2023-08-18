package com.neosoft;
public class ArrayRotation {
	public static void roted(int array[]) {

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = temp;
		}

		for (int i = 0; i < array.length - 1; i++) {
			int temp = array[i];
			array[i] = array[i + 1];
			array[i + 1] = temp;
			i++;
		}
	}
	public static void main(String[] args) {
		int array[] = { -1, 100, 3, 99 };
		roted(array);
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
	}
}
