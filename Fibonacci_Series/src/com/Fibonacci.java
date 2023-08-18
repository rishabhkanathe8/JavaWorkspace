package com;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int sum = 0;
		// 0,1,1,2,3,5,8
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(first +", "+second+", ");

		for (int i = 2; i < num; i++) {			
			sum = first + second;
			System.out.print(sum + ", ");
			first = second;
			second = sum;
		}
		sc.close();
	}
}
