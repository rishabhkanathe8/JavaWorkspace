package com;

public class Prime_Number {

	public static void main(String[] args) {

		System.out.println(primeNumber(37));
		System.out.println(primeNumber(41));
		System.out.println(primeNumber(43));
		System.out.println(primeNumber(151));
		System.out.println(primeNumber(8));
		System.out.println(primeNumber(1));
		System.out.println(primeNumber(0));
	}
	
	public static String primeNumber(int Number) {
			//2,3,5,7,11
		if(Number <2) {
			return "Number is not prime " + Number;
		}
		for(int i =2; i <= Number/2; i++) {
			if(Number % i ==0) {
				return "Number is not prime " + Number;
			}
		}
		
		return "Number is Prime " + Number;
	}

}
