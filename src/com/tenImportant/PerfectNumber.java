package com.tenImportant;

public class PerfectNumber {

	public static void prefectNum(int num) {

		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num)
			System.out.println("The num is perfect ");
		else
			System.out.println("Num is not perfect ");
	}
	public static void main(String[] args) {
		prefectNum(28);
	}
}
