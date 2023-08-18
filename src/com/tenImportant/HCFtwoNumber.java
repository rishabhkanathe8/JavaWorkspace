package com.tenImportant;

public class HCFtwoNumber {

	public static void hcfCalaculate(int num, int num2) {
		int rem = 1;

		if (num != num2) {

			while (rem != 0) {
				rem = num % num2;

				if (rem != 0) {
					num = num2;
					num2 = rem;
				}

			}
			System.out.println(num2);

		} else {
			System.out.println("Enter valid number's");
		}
	}
	public static void main(String[] args) {
		hcfCalaculate(80, 20);
	}
}
