package com.test;

public class Parent{
	static Integer a =127;  
	static Integer b =127;
	static Integer c =1000;
	static Integer d =1000;
	static Float e = 100.0f;
	static Float f = 100.0f;
	
	public static void main(String[] args) {
		Integer x = 2000;
		Integer z = 2000;
		System.out.println(x==z);
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(e==f);
	}
	
}


