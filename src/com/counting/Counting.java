package com.counting;

public class Counting {

	public static void main(String[] args) {
		System.out.println("Hello");
		test(1264664536);
	}

	public static void test(int number) {
		String str = String.valueOf(number);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 'o';
				}
			}
			if (ch[i] != 'o') {
				System.out.println(ch[i] + " " + count);
			}
		}

	}
}
