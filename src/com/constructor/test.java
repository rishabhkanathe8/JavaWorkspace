package com.constructor;

public class test {
public static void main(String[] args) {
	StringBuilder str = new StringBuilder();
	int a =5;
	str.insert(0,a%2);
	System.out.println(str.toString());
}
}
