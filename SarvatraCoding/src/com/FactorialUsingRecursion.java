package com;

public class FactorialUsingRecursion {

	public static int fact(int num) {
		
		if(num ==1) {
			return 1;
		}
		return num *(fact(num-1));
	}
	public static void main(String[] args) {
		int num = 5;
		int fact = fact(num);
		System.out.println(fact);
	}
}
