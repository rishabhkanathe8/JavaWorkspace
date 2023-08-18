package com.test;

public class ReverseStringArray {

	public static void reverseString(String str) {

		int length = str.length();
		if (length % 2 == 0) {
			length = length / 2 - 1;
		} else {
			length = length / 2;
		}

		char ch[] = str.toCharArray();
		for (int i = 0; i < length ; i++) {
			char c = ch[i];
			ch[i] = ch[str.length() - i-1];
			ch[str.length() - i-1] = c;

		}
		String s = String.valueOf(ch);
		System.out.println(s);

	}

	public static void main(String[] args) {
		reverseString("rishabh , kanathe");
		
	}

}
