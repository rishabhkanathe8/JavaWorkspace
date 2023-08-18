package com;

public class Vowels {
	public static void main(String[] args) {

		String charat = "Rishabh KanathE";
		String str = charat.toLowerCase();
		System.out.println(str);
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < charat.length(); i++) {
			charat.toLowerCase().charAt(i);
			if (charat.charAt(i) == 'a' || charat.charAt(i) == 'e' || charat.charAt(i) == 'i' || charat.charAt(i) == 'o'
					|| charat.charAt(i) == 'u') {
				vowels ++;
			}else {
				consonants++;
			}
		}
		System.out.println("v are" + vowels);
		System.out.println("c are" + consonants);
	}

}
