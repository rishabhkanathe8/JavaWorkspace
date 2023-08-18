package com.interfacetest;

public class DealyProgramme {

	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		try {
			Thread.sleep(2000);
			t1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void t1() {
		System.out.println("Hello from t1");
	}
}
