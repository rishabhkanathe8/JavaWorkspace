package com;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int array[] = { 10, 20, 22, 33,10,10 };

		removeDupicate(array);

	}

	public static void removeDupicate(int[] array) {

		int[] arr = new int[array.length];
		int count = 0;
		boolean isduplicate;
	
		// 2,3,3,4,5
		for (int i = 0; i < array.length; i++) {
			isduplicate = false;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					isduplicate = true;
					break;
				}
				
			}
			if(!isduplicate) {
				arr[count++] = array[i];
			}
		}
		
		for(int i =0; i < count;i++) {
			System.out.println(arr[i]);
		}

		
	}

}
