package com.tenImportant;

public class FibonaciiSeries {

	public static void fibonasciiSeriesPrint(int num) {

		int first = 0;
		int second = 1;
		System.out.print(first + " ");
		System.out.print(second + " ");
		int sum = 0;
		
		for (int i = 2; i < num; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) {
		fibonasciiSeriesPrint(10);
	}
}
