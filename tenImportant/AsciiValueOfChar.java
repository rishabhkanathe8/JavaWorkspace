package com.tenImportant;

public class AsciiValueOfChar {

	public static void Ascii() {
		for (int i = 97; i < 123; i++) {
			char c = (char) i;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Ascii();
	}
}
