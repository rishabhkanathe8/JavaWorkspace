package com.cummlus;

public class StringReverse {

	public static String reverse(String str) {

		String s = "";
		String[] string = str.split(" ");
		for (int i = 0; i < string.length; i++) {

			for (int j = string[i].length() - 1; j >= 0; j--) {
				s += string[i].charAt(j);
		
			}
			s+=" ";
		}

		return s;
	}
	public static void main(String[] args) {
		System.out.println(reverse("Hello World"));
	}
}
