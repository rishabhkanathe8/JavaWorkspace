package com.test;

public class DiamondPattern {
	public static void print(int num) {
		
		for(int i =1; i < num; i++) {
			for(int j=1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-2; i>0; i--) {
			for(int j=1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j <i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int i=1; i < num; i++) {
//			for(int j=1; j < num-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<i*2; j++) {
//				System.out.print("*");
//			}
//		System.out.println();	
//		}
//		
//		for(int i=num-2; i>0;i--) {
//			for(int j =1; j < num-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<i*2; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	public static void main(String[] args) {
		print(6);
	}
}
