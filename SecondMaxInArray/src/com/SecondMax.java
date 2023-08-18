package com;

public class SecondMax {

	public static void main(String[] args) {

		int array[] = {101,32, 76, 88, 46, 90, 17, 51, 89, 55, 22, 11, 87, 54, 66, 44, 33, 40, 83, 65, 77, 99, 97, 60, 24, 10, 69, 2, 45, 98, 9, 28, 95, 85, 58, 47, 75, 15, 25, 80, 43, 19, 42, 21, 7, 71, 36, 70, 3, 82, 61, 34, 68, 37, 96, 92, 26, 63, 53, 30, 94, 91, 78, 41, 14, 38, 84, 16, 27, 6, 1, 79, 31, 56, 81, 48, 62, 50, 57, 4, 20, 73, 72, 64, 29, 23, 12, 5, 49, 86, 18, 35, 52, 74, 39, 8, 67, 59, 13,100};
		System.out.println(secondMax(array));
	}
	

	public static int secondMax(int array[]) {

		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < array.length; i++) {
			//5,15,20,7,8,19
			if (array[i] > max ) {
				
				secondMax = max;
				max = array[i];
			}
			else if(array[i] > secondMax)
				secondMax = array[i];
		}

		return secondMax;
	}

}
