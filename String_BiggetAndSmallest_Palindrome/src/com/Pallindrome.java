package com;

public class Pallindrome {

	public static void main(String[] args) {

		String str = "kkrrkk is a good boy onno";
		str = str.toLowerCase();
		
		String firstPal = "";
		String secondPal = "";

		String string[] = str.split(" ");
		
		for (int i = 0; i < string.length; i++) {
			
			char ch[] = string[i].toCharArray();
			String addChar = "";
			String revChar = "";
			for (int j = ch.length-1 ; j >= 0; j--) {

				revChar = revChar + ch[j];
			}
			addChar = String.valueOf(ch);
			
			if(revChar.equals(addChar)) {
				if (addChar.length() > firstPal.length()) {
					secondPal = firstPal;
					firstPal = addChar;
				} else if (addChar.length() > secondPal.length()) {
					secondPal = addChar;
				}
			}

		}
		
		if(firstPal.length() > secondPal.length()) {
			System.out.println("The larger is " + firstPal);
		}else if(firstPal.length()  < secondPal.length()) {
			System.out.println("The larger is " + secondPal);
		}

	}

}
