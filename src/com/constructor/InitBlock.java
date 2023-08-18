package com.constructor;

public class InitBlock {
	{
		System.out.println("InIt");
	}
	static {
		System.out.println("Static");
	}
	
	public InitBlock() {
		System.out.println("con");
	}
	public static void main(String[] args) {
		new InitBlock();
	}

}
