package com.interview;

public class fibonacci {
	
	public static void fib(int num) {
		
		int first =0;
		int second =1;
		int sum =0;
		System.out.print(first+", ");
		for(int i=0; i < num; i++) {
			first = second;
			second = sum;
			sum = first + second;
			
			System.out.print(sum+", ");
		}
		System.out.println();
		int a =0;
		int b =1;
		System.out.print(a+","+b+',');
		for(int i=2; i < num; i++) {
			int sum1 = a + b;
			a = b;
			b = sum1;
			System.out.print(sum1 +",");
		}
	}
	public static void main(String[] args) {
		fib(10);
	}

}
