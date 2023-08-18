package com.neosoft;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Testing {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner s = new Scanner(System.in);

		int testCases = s.nextInt(); // Number of test cases

		for (int i = 0; i < testCases; i++) {
			int k = s.nextInt(); // Kth value to determine

			int count = 0;
			int number = 1;
			while (count < k) {
				String binary = convertToBinaryString(number);
				if (!binary.contains("11")) {
					count++;
					if (count == k) {
						System.out.println(binary);
						break;
					}
				}
				number++;
			}
		}
	}

	private static String convertToBinaryString(int number) {
		StringBuilder binary = new StringBuilder();
		while (number > 0) {
			binary.insert(0, number % 2);
			number /= 2;
		}
		return binary.toString();
	}
}
