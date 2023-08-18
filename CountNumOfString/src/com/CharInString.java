package com;
public class CharInString {	
	public static void main(String[] args) {
	
		String character = "What is going on";
		int count = 0;
		for(int i=0; i < character.length(); i++) {
			if(character.charAt(i) != ' ' ) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
