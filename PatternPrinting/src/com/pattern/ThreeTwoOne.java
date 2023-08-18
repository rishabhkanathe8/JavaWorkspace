package com.pattern;

public class ThreeTwoOne {

	public static void print() {
		for(int i=1; i <5; i++) {
			for(int k=i; k >0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print();
	}
}
