package com;

public class CharFrequency {

	public static void main(String[] args) {
		
		System.out.println(charFre("Hello Moto Whats  up"));
	}

	public static String charFre(String str) {

		int freq[] = new int[str.length()];
		char string[] = str.toLowerCase().toCharArray();
		
		for(int i =0; i < string.length; i++) {
			freq[i] =1;
			for(int j=i+1; j < string.length; j++) {
				if(string[i]==string[j]&&string[i]!=' ') {
					freq[i]++;
					string[j]='0';
				}
			}
		}
		
		for(int i=0; i < freq.length; i++) {
			if(string[i] != ' ' && string[i]!= '0') {
				System.out.println(string[i] +" "+ freq[i] );
			}
		}

		return "";

	}
}
