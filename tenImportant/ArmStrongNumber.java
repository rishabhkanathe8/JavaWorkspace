package com.tenImportant;

public class ArmStrongNumber {

	public static void armstrong(int number) {
		int temp = number;
		double sum = 0;
		String length = String.valueOf(number);
		int length1 = length.length();
		System.out.println(length);
		System.out.println(length1);
		int num = Integer.parseInt(length);
		System.out.println(num);
		while (num > 0) {
			int rem = num % 10;
			sum = sum + Math.pow(rem, length1);
			num = num / 10;
		}
		System.out.println(sum);
		if (sum == temp) {
			System.out.println("The num is Armstrong");
		} else {
			System.out.println("Num is not a armstrong");
		}
	}

	public static void main(String[] args) {
		armstrong(8208);
	}
}
