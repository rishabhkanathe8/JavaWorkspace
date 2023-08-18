package com;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remove("Hi Kya Chla Hai"));
	}

	public static String remove(String str) {

		String newStr = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(newStr);
		return newStr;
	}

}
