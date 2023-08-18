package com;

public class EvenAndOddUsingRecursion {
	
	public static void evenOdd(int num) {
		
		if(num ==0) {
			return ;
		}
		else if(num%2==0) {
			evenOdd(num-1);
			System.out.println("Even "+num);
		}else {
			evenOdd(num-1);
			System.out.println("Odd "+num);
		}
	}
	public static void main(String[] args) {
		evenOdd(10);
	}

}
