package com.interfacetest;

public class UncheckedException {

	public static void h1() throws ArithmeticException {
		System.out.println("Hello");
		throw new ArithmeticException("Unchecked exception");
		
	}

	public static void main(String[] args) {
		try {
			h1();
			return;
			
		} catch (ArithmeticException e) {
			
		}finally {
			 System.out.println("hello  moto");
			
		}
		
	}
}
