package com.tenImportant;

public class CalculateFrequencyOfCharInString {

	public static void charFreq(String str) {

		char ch[] = str.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < str.length() ; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if (ch[i] != '0') {
				System.out.println(ch[i] + " " + count);
			}
		}
	}
	public static void main(String[] args) {
		charFreq("rishabhkanathekirankose");
	}

}
