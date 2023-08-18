package com.neosoft;

public class RepetiveCharCount {

	public static void count(String str) {
		char ch[] = str.toCharArray();
		int secondCount = 0;
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				} else {
					break;
				}
			}
			System.out.println(ch[i] + " " + count);
			secondCount += count;
			i = secondCount - 1;

		}
	}

	public static void main(String[] args) {
		count("aaaabbbbccccssdaa");
	}
}
