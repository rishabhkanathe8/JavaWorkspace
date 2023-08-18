package com.tenImportant;

public class BinarySearch {

	public static boolean binary(int array[], int search) {
		int start = 0;
		int last = array.length-1;
		
		int mid = (start + last) /2;
		while(start <= last) {
			if(array[mid] == search) {
				return true;
			}else if(array[mid] > search) {
				last = mid -1;
			}
			else if(array[mid] < search) {
				start = mid+1;
			}
			
			mid = (start + last) / 2;
		}
		
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9,10};
		
		System.out.println(binary(arr, 4));
	}
}
