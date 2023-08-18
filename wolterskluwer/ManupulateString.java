package com.wolterskluwer;

//aaabbbcccd ->a3b3c3d
public class ManupulateString {

	public static void stringQuestions(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			int j = i + 1;
			while (j < str.length() && str.charAt(i) == str.charAt(j)) {
				count++;
				j++;
			}
			string += str.charAt(i) + "" + count;
			i = j - 1;
		}
		System.out.println(string);
	}

	public static void main(String[] args) {
		stringQuestions("aaabbbcccdeeeeeeeeeee");
	}
}
