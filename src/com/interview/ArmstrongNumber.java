package com.interview;

public class ArmstrongNumber {
	public static void arm(int num) {
		int temp = num;
		String str = String.valueOf(num);
		int length = str.length();
		int sum =0;
		while(num >0) {
			int rem = num % 10;
			sum += (int)Math.pow(rem, length);
			num = num /10;
		}
		if(sum == temp) {
			System.out.println(temp+" is Armstrong");
		}else {
			System.out.println(temp+" is not a Armstrong");
			
		}
	}
	public static void main(String[] args) {
		arm(8208);
	}

}
