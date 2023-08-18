package com.tenImportant;

public class LongestPalindromeInArray {

	public static void longestPalnidrome(int number[]) {

		int num = 0;
		int actualNum = 0;
		int prev = 0;
		for (int i = 0; i < number.length; i++) {
			int length = 1;
			num = number[i];
			int sum = 0;
			int temp = num;
			while (num > 0) {
				int rem = num % 10;
				sum = sum * 10 + rem;
				num = num / 10;
				length++;
			}
			if (sum == temp) {
				if (prev < length) {
					prev = length;
					actualNum = number[i];
				}

			}
		}
		System.out.println(actualNum);
	}

	public static void main(String[] args) {
		int num[] = { 1221, 111, 11, 666666, 7890, 111111, 666,7777777,01111111111,0000001000000 };
		longestPalnidrome(num);
	}

}
