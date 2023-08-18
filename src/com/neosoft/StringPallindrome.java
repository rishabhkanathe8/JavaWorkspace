package com.neosoft;

public class StringPallindrome {
	public static String largestPallindromeInString(String str) {
		char ch[] = str.toCharArray();
		char rev[] = new char[str.length()];
		int count = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev[count] = str.charAt(i);
			count++;
		}
		String current = "";
		String largest = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == rev[i]) {
				current += ch[i];
			} else {
				if (current.length() > largest.length()) {
					largest = current;
				}
				current = "";
			}
		}
		if (current.length() > largest.length()) {
			largest = current;
		}
		return largest;
	}

	public static void main(String[] args) {
		String s = largestPallindromeInString("abxracecarzbc");
		System.out.println(s);
	}

}
