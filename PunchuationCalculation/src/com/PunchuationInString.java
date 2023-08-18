package com;
public class PunchuationInString {	
	public static void main(String[] args) {
	
		String character = "What! is g?oing o/no . my, :hello x ";
		int count = 0;
		for(int i=0; i < character.length(); i++) {
			if(character.charAt(i) == '!' || character.charAt(i) == '?' ||
					character.charAt(i) == '/' || character.charAt(i) == '.' || character.charAt(i) == ','
					|| character.charAt(i) == ':' ) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
