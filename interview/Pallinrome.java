
package com.interview;

public class Pallinrome {

	public static void pall(int num) {
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if (sum == num) {
			System.out.println("num is pallindorme" + num);
		} else
			System.out.println("num is not pallindorme" + num);
	}

	public static void main(String[] args) {
		pall(122);
	}
}
