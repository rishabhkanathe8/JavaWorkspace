package com.test;

public class StringReverse {

	public static void reverseString(String str) {

		String[] strSplit = str.split(" ");
		String newStr[] = new String[strSplit.length];
		for (int i = 0; i < strSplit.length; i++) {
			newStr[i] = "";
			System.out.println(strSplit[i].length());
			for (int j = strSplit[i].length()-1 ; j >= 0; j--) {
				newStr[i] += strSplit[i].charAt(j);
			}

		}
		
		String str1[]= new String[newStr.length];
		for(int i =newStr.length-1; i >= 0; i--) {
			
			str1[i] += newStr[i];
		}
		for(int i =0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
//		String s = String.valueOf(str1);
//		System.out.println(s);
	}

	public static void main(String[] args) {
		reverseString("this is programming Language");
	}
}
