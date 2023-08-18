package com;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println(reverse(3985));
	}
	
	public static int reverse(int number) {
		
		int num =0;
		int remainder;
		
		while(number>0) {
			remainder = number % 10;
			num = num *10 + remainder;
			number = number / 10;
			
		}
		return num;
	}

}
