package com.interfacetest;

import java.io.IOException;

public class CheckedExceptionTest {

	public static void h1() throws IOException {
		throw new IOException("Exception");
	}

	public static void main(String[] args) {
		try {
			h1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
