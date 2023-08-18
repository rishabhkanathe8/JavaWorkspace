package com.interview;

public class PrintPrime {

	public static void printPrime(int num) {
		 for(int i =2; i < num; i++) {
			 int count =0;
			 int j =0;
			 for( j =2; j <= i/2; j++) {
				 if(i%j==0) {
					 count++;
					 break;
				 }
			 }
			 if(count==0) {
				 System.out.println(i);
			 }
		 }
		System.out.println(" ******************");
		for(int i=2; i < num; i++) {
			int count =0;
			for(int j=2; j <=i/2; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printPrime(100);
	}
}
