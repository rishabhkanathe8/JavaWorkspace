package com.interview;

public class Factorial {

	
	public static void fact(int num) {
		int facto = 1;
		for (int i = 1; i <= num; i++) {
			//facto = facto * i;
		}
		System.out.println(facto);
	}
	
	public static void factori(int num) {
		int fact =1;
		for(int i=1; i <=num;i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		factori(5);
		
	}
}
