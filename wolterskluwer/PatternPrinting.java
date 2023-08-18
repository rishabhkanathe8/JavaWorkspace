package com.wolterskluwer;

public class PatternPrinting {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int count = 97;
			for (int j = 0; j <=  i; j++) {
				if (i % 2 == 0)
					System.out.print(j + 1 + " ");
				else {
					
					char ch = (char) count;
					System.out.print(ch + " ");
					count++;
				}
			}

			System.out.println();
		}

	}
}
