package com.tenImportant;

import java.util.Arrays;

public class StringAnagramOrNot {

	public static void stringAnagram(String str, String str2) {

		if (str.length() != str2.length()) {
			return;
		}
		char[] ch1 = str.toLowerCase().toCharArray();
		char ch2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int count = 0;
		Arrays.equals(ch1, ch2);
		for(int i =0;i < ch1.length; i++) {
			if(ch1[i] == ch2[i] ) {
				count++;
			}
			else {
				return ;
			}
		
		}
		if(count == ch1.length) {
			System.out.println("String is Anagram ");
		}
	}
}
