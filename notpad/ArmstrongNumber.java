package com.notpad;

public class ArmstrongNumber {
	public static void armstrong(int number) {
		int rem = 0;
		int sum = 0;
		int temp = number;
		int length = String.valueOf(number).length();

		while (number > 0) {
			rem = number % 10;
			sum = sum + (int)Math.pow(rem, length);
			number = number / 10;
		}

							
		if (temp == sum)
			System.out.println("The Number is armstrong Number " + sum);
		else
			System.out.println("The Number is not armstrong Number");
	}

	public static void main(String[] args) {
		armstrong(1634);
		//int arr[] = new int[];
	}
}
