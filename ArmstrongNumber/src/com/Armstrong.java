package com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		// example = 371= 3*3*3 + 7*7*7+1*1*1 =27+343+1=371 (3*3*3=nnn) bcz=371=nnn
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int checkNumber = sc.nextInt();
		int tempNum = checkNumber;
		int sum = 0;
		int remainder = 0;
	
		
		while(tempNum >0) {
			
			remainder = tempNum % 10;
			sum +=  remainder * remainder * remainder;

			tempNum = tempNum/10;
		}
		if(sum == checkNumber) {
			System.out.println("The num is armstrong " + checkNumber);
		}else {
			System.out.println("Not a armstrong" );
		}
		sc.close();

	}

}
