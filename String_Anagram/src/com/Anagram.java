package com;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "AsDfgHjKL";
		String str2 = "kjhgdflsa";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			return;
		} else {

			char[] str3 = str1.toCharArray();
			char[] str4 = str2.toCharArray();

			Arrays.sort(str3);
			Arrays.sort(str4);
			if (Arrays.equals(str3, str4)) {
				System.out.println("The String is Anagram");
			}
			 else 
				System.out.println("String is not Anagram");
			
		}

	}

}
