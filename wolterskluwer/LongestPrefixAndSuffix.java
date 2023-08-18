package com.wolterskluwer;

public class LongestPrefixAndSuffix {
	public static void prefixAndSufix(String str) {
		// aabccdaa
//		String s1 = str.substring(0, str.length() / 2);
//		String s2 = str.substring(s1.length(), str.length());
//		System.out.println(s1);
//		System.out.println(s2);
//		int length = str.length() - 1;
//		int count = 0;
//		for (int i = 0; i < str.length() - 1; i++) {
//			if (str.charAt(i) == str.charAt(length) && length > 0) {
//				count++;
//				length--;
//			} else if (str.charAt(i) != str.charAt(length)) {
//				break;
//			}
//		}
//		System.out.println(count);
		String str1 = str;
		StringBuilder builder = new StringBuilder(str);
		StringBuilder rev = builder.reverse();
		String str2 = rev.toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				count++;
			} else if (str1.charAt(i) != str2.charAt(i)) {
				
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		prefixAndSufix("dabbccadaa");
	}
}
