package com.notpad;

public class Palindrome {
	public static void palindrome(int number) {

		int rem = 0;
		int temp = number;
		int rev = 0;
		while (number > 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}

		if (temp == rev) {
			System.out.println("The Number is palindrome " + temp);
		} else {
			System.out.println("The Number is not a palindrome");
		}

	}

	public static void main(String[] args) {
		palindrome(111);
	}

}
