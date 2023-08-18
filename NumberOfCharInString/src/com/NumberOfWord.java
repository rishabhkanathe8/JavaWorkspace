package com;

public class NumberOfWord {

	public static void main(String[] args) {
		
		System.out.println(noOfString("Hello Moto "));

	}

	public static int noOfString(String str) {
		int count = 0;
		if (str.length() == 0 || str.trim().length() == 0) {
			return 0;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}
}
