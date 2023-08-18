package com.pattern;

public class ReverseString {

	public static void reverse(String str) {
		String rev="";
		for(int i= str.length()-1; i >=0; i--) {
			rev+= str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		reverse("Rishabh");
	}
}
