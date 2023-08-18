package com.leetCode;

public class Remove26 {
	private static int a;
	private static final Integer b=10;
	

	public static int  removeDuplicate(int arr[]) {
		int count =1;
		
		for(int i =1; i < arr.length;i++) {
			
			if(arr[i-1] != arr[i]) {
				arr[count] =arr[i];
				count++;
			
			}
			System.out.println(a+" "+b);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,2,3,3,4,4,5,6,6,6};
		int a=removeDuplicate(arr);
		for(int i=0; i <a;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
