package com.interfacetest;

public interface one {

	default void hello() {
		System.out.println("Hello interface");
	}
	int sum();
}
