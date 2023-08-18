package com;

public class DuplicateCount {

	public static void main(String[] args) {
		
		System.out.println(duplicate("hh ihhh hh hh hh ihhh ihhh"));
	}

	public static int duplicate(String str) {

		int count = 0;
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			for (int j = i+1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
					break;
				}

			}

		}
		return count;
	}
}
