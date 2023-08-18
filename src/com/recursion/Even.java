package com.recursion;

public class Even {

	public static void even(int number) {
		if(number <= 0) {
			return ;
		}
		if(number % 2==0) {
			even(number-2);
			System.out.println(number);
		}else {
		 even(number-1);
		}
	}
	public static void main(String[] args) {
		even(21);
	}
}
