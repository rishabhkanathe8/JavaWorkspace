package com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int checkNumber = sc.nextInt();
		int rem = 0;
		int temp = checkNumber;
		int reverse = 0;

		while (temp > 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}
		if (reverse == checkNumber) {
			System.out.println("num  " + checkNumber + " palindrome");
		}
		sc.close();
	}

}
